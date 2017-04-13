package me.rabrg.smite.response.item;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import me.rabrg.smite.response.DescValueItem;

@Generated("org.jsonschema2pojo")
public class ItemDescription {

    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("Menuitems")
    @Expose
    private List<DescValueItem> menuitems = new ArrayList<DescValueItem>();
    @SerializedName("SecondaryDescription")
    @Expose
    private String secondaryDescription;

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
     *     The Description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The menuitems
     */
    public List<DescValueItem> getMenuitems() {
        return menuitems;
    }

    /**
     * 
     * @param menuitems
     *     The Menuitems
     */
    public void setMenuitems(List<DescValueItem> menuitems) {
        this.menuitems = menuitems;
    }

    /**
     * 
     * @return
     *     The secondaryDescription
     */
    public String getSecondaryDescription() {
        return secondaryDescription;
    }

    /**
     * 
     * @param secondaryDescription
     *     The SecondaryDescription
     */
    public void setSecondaryDescription(String secondaryDescription) {
        this.secondaryDescription = secondaryDescription;
    }

}
