package me.rabrg.smite.response;

import com.google.gson.annotations.SerializedName;

public final class QueueMatch {

    @SerializedName("Active_Flag")
    private final String activeFlag;

    @SerializedName("Match")
    private final String match;

    private QueueMatch(final String activeFlag, final String match) {
        this.activeFlag = activeFlag;
        this.match = match;
    }

    public boolean isActive() {
        return "y".equals(activeFlag);
    }

    public String getMatch() {
        return match;
    }

    @Override
    public String toString() {
        return "QueueMatch{" +
                "activeFlag='" + isActive() + '\'' +
                ", match='" + match + '\'' +
                '}';
    }
}
