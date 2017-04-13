package me.rabrg.smite.response.god;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class BassicAttackDescValueItem {

    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("value")
    @Expose
    private String value;

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The value
     */
    public String getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "BassicAttackDescValueItem{" +
                "description='" + description + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
