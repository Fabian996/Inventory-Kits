package de.Fabian.Kit;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Kits implements Listener	
{
	@EventHandler
	public void Inventory(InventoryClickEvent event)
	{	
		Player p = (Player) event.getWhoClicked();
		if(event.getInventory().getName().equalsIgnoreCase("Kits Auswahl")){
			event.setCancelled(true);
		
			
			//ItemStack Krieger
			ItemStack Schwert = new ItemStack(Material.DIAMOND_SWORD);
			Schwert.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 14);
			Schwert.addEnchantment(Enchantment.FIRE_ASPECT, 2);
			Schwert.addEnchantment(Enchantment.LOOT_BONUS_MOBS, 2);
			
			ItemStack Helm = new ItemStack(Material.DIAMOND_HELMET);
			ItemStack Brust = new ItemStack(Material.DIAMOND_CHESTPLATE);
			ItemStack Hose = new ItemStack(Material.DIAMOND_LEGGINGS);
			ItemStack Schuhe = new ItemStack(Material.DIAMOND_BOOTS);
			
			//ItemStack Miner
			ItemStack Spitzhacke = new ItemStack(Material.DIAMOND_PICKAXE);
			ItemStack Schaufel = new ItemStack(Material.DIAMOND_SPADE);
			ItemStack Axt = new ItemStack(Material.DIAMOND_AXE);
			Spitzhacke.addEnchantment(Enchantment.DIG_SPEED, 5);
			Spitzhacke.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);
			Schaufel.addEnchantment(Enchantment.DIG_SPEED, 5);
			Axt.addEnchantment(Enchantment.DIG_SPEED, 5);
			
			
			//ItemStack Schütze
			ItemStack Bogen = new ItemStack(Material.BOW);
			ItemStack Pfeil = new ItemStack(Material.ARROW);
			Bogen.addEnchantment(Enchantment.ARROW_INFINITE, 1);
			Bogen.addEnchantment(Enchantment.ARROW_DAMAGE, 5);
			Bogen.addEnchantment(Enchantment.ARROW_FIRE, 1);
			
			ItemStack Helm1 = new ItemStack(Material.CHAINMAIL_HELMET);
			ItemStack Brust1 = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
			ItemStack Hose1 = new ItemStack(Material.CHAINMAIL_LEGGINGS);
			ItemStack Schuhe1 = new ItemStack(Material.CHAINMAIL_BOOTS);
			
			// Krieger Kit
			if(event.getCurrentItem().getType() == Material.DIAMOND_SWORD){
				p.getInventory().addItem(Schwert);
				p.getInventory().setHelmet(Helm);
				p.getInventory().setChestplate(Brust);
				p.getInventory().setLeggings(Hose);
				p.getInventory().setBoots(Schuhe);
				p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 4999, 5));
				p.sendMessage("§2 Du hast das Krieger Kit gewählt");
				
				event.getView().close();
				
				}// Miner Kit
				else if(event.getCurrentItem().getType() == Material.DIAMOND){
					p.getInventory().addItem(Schaufel);
					p.getInventory().addItem(Spitzhacke);
					p.getInventory().addItem(Axt);
					p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 4999, 5));
					p.getInventory().addItem(new ItemStack(Material.GOLDEN_APPLE, 6));
					p.sendMessage("§b Du hast das Diamond-Miner Kit gewählt");
					
					event.getView().close();
					
				}// Schützen Kit
				else if(event.getCurrentItem().getType() == Material.BOW){
					p.getInventory().addItem(Bogen);
					p.getInventory().addItem(Pfeil);
					p.getInventory().addItem(Helm1);
					p.getInventory().addItem(Brust1);
					p.getInventory().addItem(Hose1);
					p.getInventory().addItem(Schuhe1);
					p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 4999, 1));
					p.sendMessage("§6 Du hast das Schützen Kit gewählt");
					
					event.getView().close();
					} 
			}
	
		}
	}
