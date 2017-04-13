package me.rabrg.smite;

import com.google.gson.Gson;
import me.rabrg.smite.response.PlayerMatchDetail;
import me.rabrg.smite.response.QueueMatch;
import me.rabrg.smite.response.SessionResponse;
import me.rabrg.smite.response.god.God;
import me.rabrg.smite.response.item.Item;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public final class SmiteApi {

    private static final boolean DEBUG = false;

    private static final Charset UTF_8_CHARSET = Charset.forName("UTF-8");

    private static final DateFormat DATE_FORMAT_DAY = new SimpleDateFormat("yyyyMMdd");

    private static final DateFormat DATE_FORMAT_TIME = new SimpleDateFormat("HHmmss");

    private final int devId;

    private final String authKey;

    private final MessageDigest messageDigest;

    private final Gson gson;

    private String sessionId;

    static {
        DATE_FORMAT_DAY.setTimeZone(TimeZone.getTimeZone("UTC"));
        DATE_FORMAT_TIME.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public SmiteApi(final int devId, final String authKey) {
        this.devId = devId;
        this.authKey = authKey;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("The provider for the MD5 algorithm does not exist");
        }
        gson = new Gson();
        createNewSession();
    }

    private void createNewSession() {
        sessionId = getSessionResponse().getSessionId();
        if (DEBUG) {
            System.out.println("sessionId= " + sessionId);
        }
    }

    private SessionResponse getSessionResponse() {
        return gson.fromJson(getTextResponse("createsession"), SessionResponse.class);
    }

    public List<QueueMatch> getMatchesByQueue(final int queue, final String date) {
        return Arrays.asList(gson.fromJson(getTextResponse("getmatchidsbyqueue", "" + queue, date, "-1"), QueueMatch[].class));
    }

    public List<PlayerMatchDetail> getPlayerMatchDetails(final int matchId) {
        return Arrays.asList(gson.fromJson(getTextResponse("getmatchdetails", "" + matchId), PlayerMatchDetail[].class));
    }

    public List<Item> getItems(final int languageCode) {
        return Arrays.asList(gson.fromJson(getTextResponse("getitems", "" + languageCode), Item[].class));
    }

    public List<God> getGods(final int languageCode) {
        return Arrays.asList(gson.fromJson(getTextResponse("getgods", "" + languageCode), God[].class));
    }

    public String getTextResponse(final String method, final String... arguments) {
        final StringBuffer urlStringBuffer = new StringBuffer("http://api.smitegame.com/smiteapi.svc/").append(method)
                .append("json");
        final String date = new StringBuffer(getDateDay()).append(getDateTime()).toString();
        if (!method.equals("ping")) {
            urlStringBuffer.append('/').append(devId).append('/').append(createSignature(method, date));
            if (!method.equals("createsession")) {
                urlStringBuffer.append('/').append(sessionId);
            }
            urlStringBuffer.append('/').append(date);
            for (final String argument : arguments) {
                urlStringBuffer.append("/" + argument);
            }
        }
        if (DEBUG) {
            System.out.println("request=" + urlStringBuffer);
        }
        try {
            final BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(urlStringBuffer.toString())
                    .openStream()));
            final StringBuffer response = new StringBuffer();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            return response.toString();
        } catch (IOException e) {
            throw new IllegalStateException("Could not get response for method " + method + " and arguments "
                    + Arrays.asList(arguments), e);
        }
    }

    private String createSignature(final String methodName, final String date) {
        final StringBuilder signature = new StringBuilder();
        for (final byte b : messageDigest.digest(new StringBuffer().append(devId).append(methodName).append(authKey)
                .append(date).toString().getBytes(UTF_8_CHARSET))) {
            signature.append(String.format("%02x", b).replaceAll("\\s", ""));
        }
        return signature.toString();
    }

    public String getDateDay() {
        return DATE_FORMAT_DAY.format(new Date());
    }

    public String getDateTime() {
        return DATE_FORMAT_TIME.format(new Date());
    }

    public String getPastDay(final int past) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -past);
        return DATE_FORMAT_DAY.format(cal.getTime());
    }
}
