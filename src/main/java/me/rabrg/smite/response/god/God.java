
package me.rabrg.smite.response.god;

import com.google.gson.annotations.Expose;

public class God {

    @Expose
    private String Ability1;
    @Expose
    private String Ability2;
    @Expose
    private String Ability3;
    @Expose
    private String Ability4;
    @Expose
    private String Ability5;
    @Expose
    private int AbilityId1;
    @Expose
    private int AbilityId2;
    @Expose
    private int AbilityId3;
    @Expose
    private int AbilityId4;
    @Expose
    private int AbilityId5;
    @Expose
    private double AttackSpeed;
    @Expose
    private double AttackSpeedPerLevel;
    @Expose
    private String Cons;
    @Expose
    private double HP5PerLevel;
    @Expose
    private int Health;
    @Expose
    private int HealthPerFive;
    @Expose
    private int HealthPerLevel;
    @Expose
    private String Lore;
    @Expose
    private double MP5PerLevel;
    @Expose
    private int MagicProtection;
    @Expose
    private double MagicProtectionPerLevel;
    @Expose
    private int MagicalPower;
    @Expose
    private double MagicalPowerPerLevel;
    @Expose
    private int Mana;
    @Expose
    private double ManaPerFive;
    @Expose
    private int ManaPerLevel;
    @Expose
    private String Name;
    @Expose
    private String OnFreeRotation;
    @Expose
    private String Pantheon;
    @Expose
    private int PhysicalPower;
    @Expose
    private double PhysicalPowerPerLevel;
    @Expose
    private int PhysicalProtection;
    @Expose
    private double PhysicalProtectionPerLevel;
    @Expose
    private String Pros;
    @Expose
    private String Roles;
    @Expose
    private int Speed;
    @Expose
    private String Title;
    @Expose
    private String Type;
    @Expose
    private Discriptable abilityDescription1;
    @Expose
    private Discriptable abilityDescription2;
    @Expose
    private Discriptable abilityDescription3;
    @Expose
    private Discriptable abilityDescription4;
    @Expose
    private Discriptable abilityDescription5;
    @Expose
    private Discriptable basicAttack;
    @Expose
    private int id;

    public String getAbility1() {
        return Ability1;
    }

    public String getAbility2() {
        return Ability2;
    }

    public String getAbility3() {
        return Ability3;
    }

    public String getAbility4() {
        return Ability4;
    }

    public String getAbility5() {
        return Ability5;
    }

    public int getAbilityId1() {
        return AbilityId1;
    }

    public int getAbilityId2() {
        return AbilityId2;
    }

    public int getAbilityId3() {
        return AbilityId3;
    }

    public int getAbilityId4() {
        return AbilityId4;
    }

    public int getAbilityId5() {
        return AbilityId5;
    }

    public double getAttackSpeed() {
        return AttackSpeed;
    }

    public double getAttackSpeedPerLevel() {
        return AttackSpeedPerLevel;
    }

    public String getCons() {
        return Cons;
    }

    public double getHP5PerLevel() {
        return HP5PerLevel;
    }

    public int getHealth() {
        return Health;
    }

    public int getHP5() {
        return HealthPerFive;
    }

    public int getHealthPerLevel() {
        return HealthPerLevel;
    }

    public String getLore() {
        return Lore;
    }

    public double getMP5PerLevel() {
        return MP5PerLevel;
    }

    public int getMagicProtection() {
        return MagicProtection;
    }

    public double getMagicProtectionPerLevel() {
        return MagicProtectionPerLevel;
    }

    public int getMagicalPower() {
        return MagicalPower;
    }

    public double getMagicalPowerPerLevel() {
        return MagicalPowerPerLevel;
    }

    public int getMana() {
        return Mana;
    }

    public double getManaPerFive() {
        return ManaPerFive;
    }

    public int getManaPerLevel() {
        return ManaPerLevel;
    }

    public String getName() {
        return Name;
    }

    public String getOnFreeRotation() {
        return OnFreeRotation;
    }

    public String getPantheon() {
        return Pantheon;
    }

    public int getPhysicalPower() {
        return PhysicalPower;
    }

    public double getPhysicalPowerPerLevel() {
        return PhysicalPowerPerLevel;
    }

    public int getPhysicalProtection() {
        return PhysicalProtection;
    }

    public double getPhysicalProtectionPerLevel() {
        return PhysicalProtectionPerLevel;
    }

    public String getPros() {
        return Pros;
    }

    public String getRoles() {
        return Roles;
    }

    public int getSpeed() {
        return Speed;
    }

    public String getTitle() {
        return Title;
    }

    public String getType() {
        return Type;
    }

    public Discriptable getAbilityDescription1() {
        return abilityDescription1;
    }

    public Discriptable getAbilityDescription2() {
        return abilityDescription2;
    }

    public Discriptable getAbilityDescription3() {
        return abilityDescription3;
    }

    public Discriptable getAbilityDescription4() {
        return abilityDescription4;
    }

    public Discriptable getAbilityDescription5() {
        return abilityDescription5;
    }

    public Discriptable getBasicAttack() {
        return basicAttack;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return getName();
    }
}
