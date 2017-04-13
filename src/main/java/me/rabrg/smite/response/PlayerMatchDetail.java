package me.rabrg.smite.response;

import com.google.gson.annotations.SerializedName;

public class PlayerMatchDetail extends Response {

    @SerializedName("Account_Level")
    private int accountLevel;
    @SerializedName("ActiveId1")
    private int activeId1;
    @SerializedName("ActiveId2")
    private int activeId2;
    @SerializedName("Assists")
    private int assists;
    @SerializedName("Ban1")
    private String ban1;
    @SerializedName("Ban10")
    private String ban10;
    @SerializedName("Ban10Id")
    private int ban10Id;
    @SerializedName("Ban1Id")
    private int ban1Id;
    @SerializedName("Ban2")
    private String ban2;
    @SerializedName("Ban2Id")
    private int ban2Id;
    @SerializedName("Ban3")
    private String ban3;
    @SerializedName("Ban3Id")
    private int ban3Id;
    @SerializedName("Ban4")
    private String ban4;
    @SerializedName("Ban4Id")
    private int ban4Id;
    @SerializedName("Ban5")
    private String ban5;
    @SerializedName("Ban5Id")
    private int ban5Id;
    @SerializedName("Ban6")
    private String ban6;
    @SerializedName("Ban6Id")
    private int ban6Id;
    @SerializedName("Ban7")
    private String ban7;
    @SerializedName("Ban7Id")
    private int ban7Id;
    @SerializedName("Ban8")
    private String ban8;
    @SerializedName("Ban8Id")
    private int ban8Id;
    @SerializedName("Ban9")
    private String ban9;
    @SerializedName("Ban9Id")
    private int ban9Id;
    @SerializedName("Camps_Cleared")
    private int campsCleared;
    @SerializedName("Conquest_Losses")
    private int conquestLosses;
    @SerializedName("Conquest_Points")
    private int conquestPoints;
    @SerializedName("Conquest_Tier")
    private int conquestTier;
    @SerializedName("Conquest_Wins")
    private int conquestWins;
    @SerializedName("Damage_Bot")
    private int damageBot;
    @SerializedName("Damage_Done_In_Hand")
    private int damageDoneInHand;
    @SerializedName("Damage_Done_Magical")
    private int damageDoneMagical;
    @SerializedName("Damage_Done_Physical")
    private int damageDonePhysical;
    @SerializedName("Damage_Mitigated")
    private int damageMitigated;
    @SerializedName("Damage_Player")
    private int damagePlayer;
    @SerializedName("Damage_Taken")
    private int damageTaken;
    @SerializedName("Damage_Taken_Magical")
    private int damageTakenMagical;
    @SerializedName("Damage_Taken_Physical")
    private int damageTakenPhysical;
    @SerializedName("Deaths")
    private int deaths;
    @SerializedName("Distance_Traveled")
    private int distanceTraveled;
    @SerializedName("Duel_Losses")
    private int duelLosses;
    @SerializedName("Duel_Points")
    private int duelPoints;
    @SerializedName("Duel_Tier")
    private int duelTier;
    @SerializedName("Duel_Wins")
    private int duelWins;
    @SerializedName("Entry_Datetime")
    private String entryDatetime;
    @SerializedName("Final_Match_Level")
    private int finalMatchLevel;
    @SerializedName("First_Ban_Side")
    private String firstBanSide;
    @SerializedName("GodId")
    private int godId;
    @SerializedName("Gold_Earned")
    private int goldEarned;
    @SerializedName("Gold_Per_Minute")
    private int goldPerMinute;
    @SerializedName("Healing")
    private int healing;
    @SerializedName("Healing_Bot")
    private int healingBot;
    @SerializedName("Healing_Player_Self")
    private int healingPlayerSelf;
    @SerializedName("ItemId1")
    private int itemId1;
    @SerializedName("ItemId2")
    private int itemId2;
    @SerializedName("ItemId3")
    private int itemId3;
    @SerializedName("ItemId4")
    private int itemId4;
    @SerializedName("ItemId5")
    private int itemId5;
    @SerializedName("ItemId6")
    private int itemId6;
    @SerializedName("Item_Active_1")
    private String itemActive1;
    @SerializedName("Item_Active_2")
    private String itemActive2;
    @SerializedName("Item_Active_3")
    private String itemActive3;
    @SerializedName("Item_Purch_1")
    private String itemPurch1;
    @SerializedName("Item_Purch_2")
    private String itemPurch2;
    @SerializedName("Item_Purch_3")
    private String itemPurch3;
    @SerializedName("Item_Purch_4")
    private String itemPurch4;
    @SerializedName("Item_Purch_5")
    private String itemPurch5;
    @SerializedName("Item_Purch_6")
    private String itemPurch6;
    @SerializedName("Joust_Losses")
    private int joustLosses;
    @SerializedName("Joust_Points")
    private int joustPoints;
    @SerializedName("Joust_Tier")
    private int joustTier;
    @SerializedName("Joust_Wins")
    private int joustWins;
    @SerializedName("Killing_Spree")
    private int killingSpree;
    @SerializedName("Kills_Bot")
    private int killsBot;
    @SerializedName("Kills_Double")
    private int killsDouble;
    @SerializedName("Kills_Fire_Giant")
    private int killsFireGiant;
    @SerializedName("Kills_First_Blood")
    private int killsFirstBlood;
    @SerializedName("Kills_Gold_Fury")
    private int killsGoldFury;
    @SerializedName("Kills_Penta")
    private int killsPenta;
    @SerializedName("Kills_Phoenix")
    private int killsPhoenix;
    @SerializedName("Kills_Player")
    private int killsPlayer;
    @SerializedName("Kills_Quadra")
    private int killsQuadra;
    @SerializedName("Kills_Siege_Juggernaut")
    private int killsSiegeJuggernaut;
    @SerializedName("Kills_Single")
    private int killsSingle;
    @SerializedName("Kills_Triple")
    private int killsTriple;
    @SerializedName("Kills_Wild_Juggernaut")
    private int killsWildJuggernaut;
    @SerializedName("Mastery_Level")
    private int masteryLevel;
    @SerializedName("Match")
    private int match;
    @SerializedName("Minutes")
    private int minutes;
    @SerializedName("Multi_kill_Max")
    private int multiKillMax;
    @SerializedName("Objective_Assists")
    private int objectiveAssists;
    @SerializedName("PartyId")
    private int partyId;
    @SerializedName("Rank_Stat_Conquest")
    private int rankStatConquest;
    @SerializedName("Rank_Stat_Duel")
    private int rankStatDuel;
    @SerializedName("Rank_Stat_Joust")
    private int rankStatJoust;
    @SerializedName("Reference_Name")
    private String referenceName;
    @SerializedName("Skin")
    private String skin;
    @SerializedName("SkinId")
    private int skinId;
    @SerializedName("Structure_Damage")
    private int structureDamage;
    @SerializedName("Surrendered")
    private int surrendered;
    @SerializedName("TaskForce")
    private int taskForce;
    @SerializedName("Team1Score")
    private int team1Score;
    @SerializedName("Team2Score")
    private int team2Score;
    @SerializedName("TeamId")
    private int teamId;
    @SerializedName("Team_Name")
    private String teamName;
    @SerializedName("Time_In_Match_Seconds")
    private int timeInMatchSeconds;
    @SerializedName("Towers_Destroyed")
    private int towersDestroyed;
    @SerializedName("Wards_Placed")
    private int wardsPlaced;
    @SerializedName("Win_Status")
    private String winStatus;
    @SerializedName("Winning_TaskForce")
    private int winningTaskForce;
    @SerializedName("hasReplay")
    private String hasReplay;
    @SerializedName("name")
    private String name;
    @SerializedName("playerId")
    private String playerId;
    @SerializedName("playerName")
    private String playerName;

    public int getAccountLevel() {
        return accountLevel;
    }

    public int getActiveId1() {
        return activeId1;
    }

    public int getActiveId2() {
        return activeId2;
    }

    public int getAssists() {
        return assists;
    }

    public String getBan1() {
        return ban1;
    }

    public String getBan10() {
        return ban10;
    }

    public int getBan10Id() {
        return ban10Id;
    }

    public int getBan1Id() {
        return ban1Id;
    }

    public String getBan2() {
        return ban2;
    }

    public int getBan2Id() {
        return ban2Id;
    }

    public String getBan3() {
        return ban3;
    }

    public int getBan3Id() {
        return ban3Id;
    }

    public String getBan4() {
        return ban4;
    }

    public int getBan4Id() {
        return ban4Id;
    }

    public String getBan5() {
        return ban5;
    }

    public int getBan5Id() {
        return ban5Id;
    }

    public String getBan6() {
        return ban6;
    }

    public int getBan6Id() {
        return ban6Id;
    }

    public String getBan7() {
        return ban7;
    }

    public int getBan7Id() {
        return ban7Id;
    }

    public String getBan8() {
        return ban8;
    }

    public int getBan8Id() {
        return ban8Id;
    }

    public String getBan9() {
        return ban9;
    }

    public int getBan9Id() {
        return ban9Id;
    }

    public int getCampsCleared() {
        return campsCleared;
    }

    public int getConquestLosses() {
        return conquestLosses;
    }

    public int getConquestPoints() {
        return conquestPoints;
    }

    public int getConquestTier() {
        return conquestTier;
    }

    public int getConquestWins() {
        return conquestWins;
    }

    public int getDamageBot() {
        return damageBot;
    }

    public int getDamageDoneInHand() {
        return damageDoneInHand;
    }

    public int getDamageDoneMagical() {
        return damageDoneMagical;
    }

    public int getDamageDonePhysical() {
        return damageDonePhysical;
    }

    public int getDamageMitigated() {
        return damageMitigated;
    }

    public int getDamagePlayer() {
        return damagePlayer;
    }

    public int getDamageTaken() {
        return damageTaken;
    }

    public int getDamageTakenMagical() {
        return damageTakenMagical;
    }

    public int getDamageTakenPhysical() {
        return damageTakenPhysical;
    }

    public int getDeaths() {
        return deaths;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public int getDuelLosses() {
        return duelLosses;
    }

    public int getDuelPoints() {
        return duelPoints;
    }

    public int getDuelTier() {
        return duelTier;
    }

    public int getDuelWins() {
        return duelWins;
    }

    public String getEntryDatetime() {
        return entryDatetime;
    }

    public int getFinalMatchLevel() {
        return finalMatchLevel;
    }

    public String getFirstBanSide() {
        return firstBanSide;
    }

    public int getGodId() {
        return godId;
    }

    public int getGoldEarned() {
        return goldEarned;
    }

    public int getGoldPerMinute() {
        return goldPerMinute;
    }

    public int getHealing() {
        return healing;
    }

    public int getHealingBot() {
        return healingBot;
    }

    public int getHealingPlayerSelf() {
        return healingPlayerSelf;
    }

    public int getItemId1() {
        return itemId1;
    }

    public int getItemId2() {
        return itemId2;
    }

    public int getItemId3() {
        return itemId3;
    }

    public int getItemId4() {
        return itemId4;
    }

    public int getItemId5() {
        return itemId5;
    }

    public int getItemId6() {
        return itemId6;
    }

    public String getItemActive1() {
        return itemActive1;
    }

    public String getItemActive2() {
        return itemActive2;
    }

    public String getItemActive3() {
        return itemActive3;
    }

    public String getItemPurch1() {
        return itemPurch1;
    }

    public String getItemPurch2() {
        return itemPurch2;
    }

    public String getItemPurch3() {
        return itemPurch3;
    }

    public String getItemPurch4() {
        return itemPurch4;
    }

    public String getItemPurch5() {
        return itemPurch5;
    }

    public String getItemPurch6() {
        return itemPurch6;
    }

    public int getJoustLosses() {
        return joustLosses;
    }

    public int getJoustPoints() {
        return joustPoints;
    }

    public int getJoustTier() {
        return joustTier;
    }

    public int getJoustWins() {
        return joustWins;
    }

    public int getKillingSpree() {
        return killingSpree;
    }

    public int getKillsBot() {
        return killsBot;
    }

    public int getKillsDouble() {
        return killsDouble;
    }

    public int getKillsFireGiant() {
        return killsFireGiant;
    }

    public int getKillsFirstBlood() {
        return killsFirstBlood;
    }

    public int getKillsGoldFury() {
        return killsGoldFury;
    }

    public int getKillsPenta() {
        return killsPenta;
    }

    public int getKillsPhoenix() {
        return killsPhoenix;
    }

    public int getKillsPlayer() {
        return killsPlayer;
    }

    public int getKillsQuadra() {
        return killsQuadra;
    }

    public int getKillsSiegeJuggernaut() {
        return killsSiegeJuggernaut;
    }

    public int getKillsSingle() {
        return killsSingle;
    }

    public int getKillsTriple() {
        return killsTriple;
    }

    public int getKillsWildJuggernaut() {
        return killsWildJuggernaut;
    }

    public int getMasteryLevel() {
        return masteryLevel;
    }

    public int getMatch() {
        return match;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getMultiKillMax() {
        return multiKillMax;
    }

    public int getObjectiveAssists() {
        return objectiveAssists;
    }

    public int getPartyId() {
        return partyId;
    }

    public int getRankStatConquest() {
        return rankStatConquest;
    }

    public int getRankStatDuel() {
        return rankStatDuel;
    }

    public int getRankStatJoust() {
        return rankStatJoust;
    }

    public String getReferenceName() {
        return referenceName;
    }

    public String getSkin() {
        return skin;
    }

    public int getSkinId() {
        return skinId;
    }

    public int getStructureDamage() {
        return structureDamage;
    }

    public int getSurrendered() {
        return surrendered;
    }

    public int getTaskForce() {
        return taskForce;
    }

    public int getTeam1Score() {
        return team1Score;
    }

    public int getTeam2Score() {
        return team2Score;
    }

    public int getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getTimeInMatchSeconds() {
        return timeInMatchSeconds;
    }

    public int getTowersDestroyed() {
        return towersDestroyed;
    }

    public int getWardsPlaced() {
        return wardsPlaced;
    }

    public String getWinStatus() {
        return winStatus;
    }

    public int getWinningTaskForce() {
        return winningTaskForce;
    }

    public String getHasReplay() {
        return hasReplay;
    }

    public String getName() {
        return name;
    }

    public String getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    @Override
    public String toString() {
        return "PlayerMatchDetail{" +
                "accountLevel=" + accountLevel +
                ", activeId1=" + activeId1 +
                ", activeId2=" + activeId2 +
                ", assists=" + assists +
                ", ban1='" + ban1 + '\'' +
                ", ban10='" + ban10 + '\'' +
                ", ban10Id=" + ban10Id +
                ", ban1Id=" + ban1Id +
                ", ban2='" + ban2 + '\'' +
                ", ban2Id=" + ban2Id +
                ", ban3='" + ban3 + '\'' +
                ", ban3Id=" + ban3Id +
                ", ban4='" + ban4 + '\'' +
                ", ban4Id=" + ban4Id +
                ", ban5='" + ban5 + '\'' +
                ", ban5Id=" + ban5Id +
                ", ban6='" + ban6 + '\'' +
                ", ban6Id=" + ban6Id +
                ", ban7='" + ban7 + '\'' +
                ", ban7Id=" + ban7Id +
                ", ban8='" + ban8 + '\'' +
                ", ban8Id=" + ban8Id +
                ", ban9='" + ban9 + '\'' +
                ", ban9Id=" + ban9Id +
                ", campsCleared=" + campsCleared +
                ", conquestLosses=" + conquestLosses +
                ", conquestPoints=" + conquestPoints +
                ", conquestTier=" + conquestTier +
                ", conquestWins=" + conquestWins +
                ", damageBot=" + damageBot +
                ", damageDoneInHand=" + damageDoneInHand +
                ", damageDoneMagical=" + damageDoneMagical +
                ", damageDonePhysical=" + damageDonePhysical +
                ", damageMitigated=" + damageMitigated +
                ", damagePlayer=" + damagePlayer +
                ", damageTaken=" + damageTaken +
                ", damageTakenMagical=" + damageTakenMagical +
                ", damageTakenPhysical=" + damageTakenPhysical +
                ", deaths=" + deaths +
                ", distanceTraveled=" + distanceTraveled +
                ", duelLosses=" + duelLosses +
                ", duelPoints=" + duelPoints +
                ", duelTier=" + duelTier +
                ", duelWins=" + duelWins +
                ", entryDatetime='" + entryDatetime + '\'' +
                ", finalMatchLevel=" + finalMatchLevel +
                ", firstBanSide='" + firstBanSide + '\'' +
                ", godId=" + godId +
                ", goldEarned=" + goldEarned +
                ", goldPerMinute=" + goldPerMinute +
                ", healing=" + healing +
                ", healingBot=" + healingBot +
                ", healingPlayerSelf=" + healingPlayerSelf +
                ", itemId1=" + itemId1 +
                ", itemId2=" + itemId2 +
                ", itemId3=" + itemId3 +
                ", itemId4=" + itemId4 +
                ", itemId5=" + itemId5 +
                ", itemId6=" + itemId6 +
                ", itemActive1='" + itemActive1 + '\'' +
                ", itemActive2='" + itemActive2 + '\'' +
                ", itemActive3='" + itemActive3 + '\'' +
                ", itemPurch1='" + itemPurch1 + '\'' +
                ", itemPurch2='" + itemPurch2 + '\'' +
                ", itemPurch3='" + itemPurch3 + '\'' +
                ", itemPurch4='" + itemPurch4 + '\'' +
                ", itemPurch5='" + itemPurch5 + '\'' +
                ", itemPurch6='" + itemPurch6 + '\'' +
                ", joustLosses=" + joustLosses +
                ", joustPoints=" + joustPoints +
                ", joustTier=" + joustTier +
                ", joustWins=" + joustWins +
                ", killingSpree=" + killingSpree +
                ", killsBot=" + killsBot +
                ", killsDouble=" + killsDouble +
                ", killsFireGiant=" + killsFireGiant +
                ", killsFirstBlood=" + killsFirstBlood +
                ", killsGoldFury=" + killsGoldFury +
                ", killsPenta=" + killsPenta +
                ", killsPhoenix=" + killsPhoenix +
                ", killsPlayer=" + killsPlayer +
                ", killsQuadra=" + killsQuadra +
                ", killsSiegeJuggernaut=" + killsSiegeJuggernaut +
                ", killsSingle=" + killsSingle +
                ", killsTriple=" + killsTriple +
                ", killsWildJuggernaut=" + killsWildJuggernaut +
                ", masteryLevel=" + masteryLevel +
                ", match=" + match +
                ", minutes=" + minutes +
                ", multiKillMax=" + multiKillMax +
                ", objectiveAssists=" + objectiveAssists +
                ", partyId=" + partyId +
                ", rankStatConquest=" + rankStatConquest +
                ", rankStatDuel=" + rankStatDuel +
                ", rankStatJoust=" + rankStatJoust +
                ", referenceName='" + referenceName + '\'' +
                ", skin='" + skin + '\'' +
                ", skinId=" + skinId +
                ", structureDamage=" + structureDamage +
                ", surrendered=" + surrendered +
                ", taskForce=" + taskForce +
                ", team1Score=" + team1Score +
                ", team2Score=" + team2Score +
                ", teamId=" + teamId +
                ", teamName='" + teamName + '\'' +
                ", timeInMatchSeconds=" + timeInMatchSeconds +
                ", towersDestroyed=" + towersDestroyed +
                ", wardsPlaced=" + wardsPlaced +
                ", winStatus='" + winStatus + '\'' +
                ", winningTaskForce=" + winningTaskForce +
                ", hasReplay='" + hasReplay + '\'' +
                ", name='" + name + '\'' +
                ", playerId='" + playerId + '\'' +
                ", playerName='" + playerName + '\'' +
                '}';
    }
}
