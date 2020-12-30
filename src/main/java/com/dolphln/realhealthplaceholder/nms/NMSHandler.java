package com.dolphln.realhealthplaceholder.nms;

import org.bukkit.entity.Player;

public interface NMSHandler {

    /**
     * Get the amount left of Absorption Hearts of a {@code org.bukkit.entity.Player}
     *
     * @param player
     *     A {@link org.bukkit.entity.Player player} you want to get the Hearts of.
     * @return amount of Absorption Hearts
     */
    double getAbsorptionHearts(Player player);

}
