package com.dolphln.realhealthplaceholder.nms;

import org.bukkit.craftbukkit.v1_9_R2.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class NMSHandler_1_9_R2 implements NMSHandler{

    @Override
    public double getAbsorptionHearts(Player player) {
        return ((CraftPlayer) player).getHandle().getAbsorptionHearts();
    }
    
}
