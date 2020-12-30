package com.dolphln.realhealthplaceholder.nms;

import org.bukkit.craftbukkit.v1_11_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class NMSHandler_1_11_R1 implements NMSHandler{

    @Override
    public double getAbsorptionHearts(Player player) {
        return ((CraftPlayer) player).getHandle().getAbsorptionHearts();
    }
    
}
