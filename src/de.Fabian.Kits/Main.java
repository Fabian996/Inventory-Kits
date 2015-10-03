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
import de.Fabian.Kit.EventHandler.Compass;

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
		getServer().getPluginManager().registerEvents(new Compass(), this);
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String lable, String[] args)
	{
		Player p = (Player)sender;
		
		if(cmd.getName().equalsIgnoreCase("invkits")){
			inv = p.getPlayer().getServer().createInventory(null, 9, "Kits Auswahl");
			
					
			ItemStack Dia = new ItemStack(Material.DIAMOND);
			ItemMeta Diameta = Dia.getItemMeta();
			Diameta.setDisplayName(ChatColor.AQUA + "Diamond Miner");
			Dia.setItemMeta(Diameta);
			
			ItemStack Schwert = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta Schwertmeta = Schwert.getItemMeta();
			Schwertmeta.setDisplayName(ChatColor.RED + "Krieger");
			Schwert.setItemMeta(Schwertmeta);
			
			ItemStack Bogen= new ItemStack(Material.BOW);
			ItemMeta Bogenmeta = Bogen.getItemMeta();
			Bogenmeta.setDisplayName(ChatColor.GOLD + "Schütze");
			Bogen.setItemMeta(Bogenmeta);
			
			//Comming Soon			
			ItemStack Cube = new ItemStack(Material.NETHER_STAR);
			ItemMeta Cubemeta = Cube.getItemMeta();
			Cubemeta.setDisplayName("§4 Comming Soon");
			Cube.setItemMeta(Cubemeta);
			
			ItemStack Cube2 = new ItemStack(Material.NETHER_STAR);
			ItemMeta Cubemeta2 = Cube2.getItemMeta();
			Cubemeta2.setDisplayName("§4 Comming Soon");
			Cube2.setItemMeta(Cubemeta2);
			
			ItemStack Cube3 = new ItemStack(Material.NETHER_STAR);
			ItemMeta Cubemeta3 = Cube3.getItemMeta();
			Cubemeta3.setDisplayName("§4 Comming Soon");
			Cube3.setItemMeta(Cubemeta3);
			
			ItemStack Cube4 = new ItemStack(Material.NETHER_STAR);
			ItemMeta Cubemeta4 = Cube4.getItemMeta();
			Cubemeta4.setDisplayName("§4 Comming Soon");
			Cube4.setItemMeta(Cubemeta4);
			
			
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
			inv.setItem(2, Cube);
			inv.setItem(3, Cube2);
			inv.setItem(4, Dia);
			inv.setItem(5, Cube3);
			inv.setItem(6, Cube4);
			inv.setItem(7, Bogen);
			inv.setItem(8, Glasschreibe1);

			p.getPlayer().openInventory(inv);
			
			return true;
		}

		return false;
	}
	
	
}
