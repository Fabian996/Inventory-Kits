package de.Fabian.Kit.EventHandler;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class Compass implements Listener 
{
	@EventHandler
	public void onCompassClick(PlayerInteractEvent e)
	{
		if(e.getAction() == Action.RIGHT_CLICK_AIR){
			if(e.getPlayer().getItemInHand().getType() == Material.COMPASS){
					Player p = e.getPlayer();
					
					Bukkit.dispatchCommand(p.getPlayer(), "invkits");	
			}
		}
	}
}
