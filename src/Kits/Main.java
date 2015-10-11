package de.Fabian.Kits.main;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import de.Fabian.Kit.Kits;
import de.Fabian.Kit.EventHandler.Blaze;
import de.Fabian.Kits.main.Updater;

public class Main extends JavaPlugin 
{
	private Inventory inv = null;
		
	public void onDisabled()
	{
		System.out.println("[InvKits] deaktiviert");
	}
	
	public void onEnable()
	{
		System.out.println("[InvKits] aktivert");
		getServer().getPluginManager().registerEvents(new Kits(), this);
		getServer().getPluginManager().registerEvents(new Blaze(), this);
		
		// Updater
		 Updater updater = new Updater(this, 56140, getFile(), Updater.UpdateType.DEFAULT, true);

		    if (updater.getResult() == Updater.UpdateResult.UPDATE_AVAILABLE)
		    {System.out.println("[Inventory Kit] New version avaible!");
		    } else if (updater.getResult() == Updater.UpdateResult.NO_UPDATE)
		    {System.out.println("[Inventory Kit]No new version avaible!");
		    }
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String lable, String[] args)
	{
		Player p = (Player)sender;
		
		if(cmd.getName().equalsIgnoreCase("invkits")){
			inv = p.getPlayer().getServer().createInventory(null, 9, "Kits Auswahl");
			
					
			ItemStack Dia = new ItemStack(Material.DIAMOND);
			ItemMeta Diameta = Dia.getItemMeta();
			Diameta.setDisplayName(ChatColor.DARK_AQUA + "Diamond Miner");
			Dia.setItemMeta(Diameta);
			
			ItemStack Schwert = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta Schwertmeta = Schwert.getItemMeta();
			Schwertmeta.setDisplayName(ChatColor.RED + "Krieger");
			Schwert.setItemMeta(Schwertmeta);
			
			ItemStack Bogen= new ItemStack(Material.BOW);
			ItemMeta Bogenmeta = Bogen.getItemMeta();
			Bogenmeta.setDisplayName(ChatColor.GOLD + "Schütze");
			Bogen.setItemMeta(Bogenmeta);
						
			ItemStack Technik = new ItemStack(Material.REDSTONE);
			ItemMeta Technikmeta = Technik.getItemMeta();
			Technikmeta.setDisplayName(ChatColor.BLUE + "Techniker");
			Technik.setItemMeta(Technikmeta);
			
			ItemStack Angel = new ItemStack(Material.FISHING_ROD);
			ItemMeta Angelmeta = Angel.getItemMeta();
			Angelmeta.setDisplayName(ChatColor.YELLOW + "Angler");
			Angel.setItemMeta(Angelmeta);
			
			//Comming Soon	
			
			ItemStack Cube2 = new ItemStack(Material.NETHER_STAR);
			ItemMeta Cubemeta2 = Cube2.getItemMeta();
			Cubemeta2.setDisplayName("§4 Comming Soon");
			Cube2.setItemMeta(Cubemeta2);
			
			ItemStack Cube3 = new ItemStack(Material.NETHER_STAR);
			ItemMeta Cubemeta3 = Cube3.getItemMeta();
			Cubemeta3.setDisplayName("§4 Comming Soon");
			Cube3.setItemMeta(Cubemeta3);
			

			
			//Glass Pane
			ItemStack Glasschreibe = new ItemStack(Material.STAINED_GLASS_PANE);
			ItemMeta Glasschreibemeta = Glasschreibe.getItemMeta();
			Glasschreibemeta.setDisplayName(ChatColor.DARK_PURPLE + " ******** ");
			Glasschreibe.setItemMeta(Glasschreibemeta);
			
			ItemStack Glasschreibe1 = new ItemStack(Material.STAINED_GLASS_PANE);
			ItemMeta Glasschreibemeta1 = Glasschreibe1.getItemMeta();
			Glasschreibemeta1.setDisplayName(ChatColor.DARK_PURPLE + " ******** ");
			Glasschreibe1.setItemMeta(Glasschreibemeta1);


			
			inv.setItem(0, Glasschreibe);
			inv.setItem(1, Schwert);
			inv.setItem(2, Technik);
			inv.setItem(3, Cube2);
			inv.setItem(4, Dia);
			inv.setItem(5, Cube3);
			inv.setItem(6, Angel);
			inv.setItem(7, Bogen);
			inv.setItem(8, Glasschreibe1);

			p.getPlayer().openInventory(inv);
			
			return true;
		}

		return false;
	}
	
	
}
