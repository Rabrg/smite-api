package me.rabrg.smite.response;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class DescValueItem {

    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("Value")
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
