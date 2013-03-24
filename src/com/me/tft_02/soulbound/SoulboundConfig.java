package com.me.tft_02.soulbound;

import java.util.ArrayList;
import java.util.List;

public class SoulboundConfig {
    Soulbound plugin;

    public SoulboundConfig(Soulbound instance) {
        plugin = instance;
    }

    // EpicBossRecoded config settings

    public boolean getEBRBindOnPickup() {
        return plugin.getConfig().getBoolean("Dependency_Plugins.EpicBossRecoded.BindOnPickup");
    }

    public boolean getEBRBindOnEquip() {
        return plugin.getConfig().getBoolean("Dependency_Plugins.EpicBossRecoded.BindOnEquip");
    }

    public boolean getEBRBindOnUse() {
        return plugin.getConfig().getBoolean("Dependency_Plugins.EpicBossRecoded.BindOnUse");
    }

    // DiabloDrops config settings

    public List<String> getDiabloDropsBindOnPickupTiers() {
        return getDiabloDropsItemTiers("BindOnPickup");
    }

    public List<String> getDiabloDropsBindOnUseTiers() {
        return getDiabloDropsItemTiers("BindOnUse");
    }

    public List<String> getDiabloDropsBindOnEquipTiers() {
        return getDiabloDropsItemTiers("BindOnEquip");
    }

    public List<String> getDiabloDropsItemTiers(String bindType) {
        String[] tiersString = plugin.getConfig().getString("Dependency_Plugins.DiabloDrops." + bindType).replaceAll(" ", "").split("[,]");
        List<String> tiers = new ArrayList<String>();

        for (String tier : tiersString) {
            tiers.add(tier);
        }
        return tiers;
    }

    // LoreLocks config settings

    public boolean getLoreLocksBindKeys() {
        return plugin.getConfig().getBoolean("Dependency_Plugins.LoreLocks.Bind_Keys");
    }
}
