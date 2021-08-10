package com.wizard.main;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Plugin is starting");
        registerListener();
        registerCommand();


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


    public void registerListener(){
        PluginManager pm=getServer().getPluginManager();
        pm.registerEvents(new BlockEvent(),this);
        pm.registerEvents(new greetings(), this);
        pm.registerEvents(new arrowKnockback(), this);


    }
    public void registerCommand(){
        getCommand("fly").setExecutor(new FlyCommand());
    }
}
