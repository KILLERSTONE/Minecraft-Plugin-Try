package com.wizard.main;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class BlockEvent implements Listener  {
    @EventHandler
    public void blockDestroy(BlockBreakEvent lado){
        Player p= lado.getPlayer();
        p.getLocation().getWorld().createExplosion(p.getLocation(),10F);
    }


}
