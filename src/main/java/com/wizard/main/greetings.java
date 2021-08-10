package com.wizard.main;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class greetings implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        System.out.println(event.getPlayer().getDisplayName()+" Welcome to our server");
        event.setJoinMessage(ChatColor.BLUE+ event.getPlayer().getDisplayName()+" Welcome to our server");
        ItemStack apple= new ItemStack(Material.GOLDEN_APPLE);
        event.getPlayer().getInventory().addItem(apple);
    }
}

