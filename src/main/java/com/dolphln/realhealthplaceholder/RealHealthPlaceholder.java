package com.dolphln.realhealthplaceholder;

import com.dolphln.realhealthplaceholder.hooks.PlaceholdersHook;
import com.dolphln.realhealthplaceholder.nms.NMSHandler;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class RealHealthPlaceholder extends JavaPlugin {

    private RealHealthPlaceholder instance;

    private NMSHandler nmsHandler;

    @Override
    public void onEnable() {
        if(Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null){
            new PlaceholdersHook(this).register();
        }

        try {
            this.nmsHandler = (NMSHandler) Class.forName("com.dolphln.realhealthplaceholder.nms.NMSHandler_" + Bukkit.getServer().getClass().getPackage().getName().replace(".", ",").split(",")[3].substring(1)).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public RealHealthPlaceholder getInstance() {
        return instance;
    }

    public NMSHandler getNmsHandler() {
        return nmsHandler;
    }
}
