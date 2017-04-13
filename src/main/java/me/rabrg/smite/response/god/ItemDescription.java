package me.rabrg.smite.response.god;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import me.rabrg.smite.response.DescValueItem;

@Generated("org.jsonschema2pojo")
public class ItemDescription {

    @Expose
    private String cooldown;
    @Expose
    private String cost;
    @Expose
    private String description;
    @Expose
    private List<BassicAttackDescValueItem> menuitems = new ArrayList<BassicAttackDescValueItem>();
    @Expose
    private List<BassicAttackDescValueItem> rankitems = new ArrayList<BassicAttackDescValueItem>();
    @Expose
    private String secondaryDescription;

    public String getCooldown() {
        return cooldown;
    }

    public String getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public List<BassicAttackDescValueItem> getMenuitems() {
        return menuitems;
    }

    public List<BassicAttackDescValueItem> getRankitems() {
        return rankitems;
    }

    public String getSecondaryDescription() {
        return secondaryDescription;
    }

    public void setSecondaryDescription(String secondaryDescription) {
        this.secondaryDescription = secondaryDescription;
    }

    @Override
    public String toString() {
        return "ItemDescription{" +
                "cooldown='" + cooldown + '\'' +
                ", cost='" + cost + '\'' +
                ", description='" + description + '\'' +
                ", menuitems=" + menuitems +
                ", rankitems=" + rankitems +
                ", secondaryDescription='" + secondaryDescription + '\'' +
                '}';
    }
}
