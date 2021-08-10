package com.wizard.main;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

public class arrowKnockback implements Listener {
    @EventHandler
    public void playerWarning(EntityDamageByEntityEvent event){
        if(event.getDamager() instanceof Player){
           Player player=(Player) event.getDamager();
            player.sendMessage("Thou shalln't sin");
            player.setDisplayName(ChatColor.RED+"Sinner");
            player.getWorld().strikeLightning(player.getLocation()).isEffect();
        }

    }
}
