package me.rabrg.smite.response;

import com.google.gson.annotations.SerializedName;

abstract class Response {

    @SerializedName("ret_msg")
    private String returnMessage;

    private String timestamp;

    public final String getReturnMessage() {
        return returnMessage;
    }

    public final String getTimestamp() {
        return timestamp;
    }
}
