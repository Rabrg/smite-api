package me.rabrg.smite.response;

import com.google.gson.annotations.SerializedName;

public final class SessionResponse extends Response {

    @SerializedName("session_id")
    private final String sessionId;

    private SessionResponse(final String sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionId() {
        return sessionId;
    }

    @Override
    public String toString() {
        return "SessionResponse{" +
                "sessionId='" + sessionId + '\'' +
                '}';
    }
}
