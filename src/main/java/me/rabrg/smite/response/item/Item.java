package me.rabrg.smite.response.item;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("ChildItemId")
    @Expose
    private int childItemId;
    @SerializedName("DeviceName")
    @Expose
    private String deviceName;
    @SerializedName("IconId")
    @Expose
    private int iconId;
    @SerializedName("ItemDescription")
    @Expose
    private ItemDescription itemDescription;
    @SerializedName("ItemId")
    @Expose
    private int itemId;
    @SerializedName("ItemTier")
    @Expose
    private int itemTier;
    @SerializedName("Price")
    @Expose
    private int price;
    @SerializedName("RootItemId")
    @Expose
    private int rootItemId;
    @SerializedName("ShortDesc")
    @Expose
    private String shortDesc;
    @SerializedName("StartingItem")
    @Expose
    private boolean startingItem;
    @SerializedName("Type")
    @Expose
    private String type;
    @SerializedName("itemIcon_URL")
    @Expose
    private String itemIconURL;

    public int getChildItemId() {
        return childItemId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public int getIconId() {
        return iconId;
    }

    public ItemDescription getItemDescription() {
        return itemDescription;
    }

    public int getItemId() {
        return itemId;
    }

    public int getItemTier() {
        return itemTier;
    }

    public int getPrice() {
        return price;
    }

    public int getRootItemId() {
        return rootItemId;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public boolean isStartingItem() {
        return startingItem;
    }

    public String getType() {
        return type;
    }

    public String getItemIconURL() {
        return itemIconURL;
    }

    @Override
    public String toString() {
        return getDeviceName();
    }
}
