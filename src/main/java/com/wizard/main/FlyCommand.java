package com.wizard.main;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class FlyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command,String label,String[] args){
        if(command.getName().equalsIgnoreCase("fly")){
            if (sender instanceof Player) {
                Player p = (Player) sender;
                if (!p.hasPermission("fly.use")) {
                    p.sendMessage(ChatColor.RED + "You cant flyyyyyyyyyy");
                    return true;
                } else {
                    if (p.getAllowFlight() == true) {
                        p.setAllowFlight(false);
                        p.setFlying(false);
                        p.sendMessage(ChatColor.LIGHT_PURPLE + "Flight has been disabled");
                        p.playSound(p.getLocation(), Sound.ENTITY_CHICKEN_DEATH, 1, 1);
                        p.getActivePotionEffects().clear();
                    }
                    else if (p.getAllowFlight() == false) {
                        p.setAllowFlight(true);
                        p.setFlying(true);
                        p.sendMessage(ChatColor.RED + "Flight has been enabled");
                        p.playSound(p.getLocation(), Sound.ENTITY_ARROW_HIT_PLAYER, 1, 1);
                        p.getActivePotionEffects().clear();
                        p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION,1000000000,1));
                    }
                }
            }
        }
        return false;
    }
}
