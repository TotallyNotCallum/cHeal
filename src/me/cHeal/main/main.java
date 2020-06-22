package me.cHeal.main;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class main  extends JavaPlugin{
	
	public void onEnable() {
		
		System.out.println("cHeal is now loaded");
	}
	
	
	public void onDisable() {
		
		System.out.println("cHeal is now unloaded");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		
		
		if(label.equalsIgnoreCase("heal")) { // /heal 
			player.setHealth(20);
			player.sendMessage(ChatColor.GOLD + "Your have been healed!");
			return true; // then u get the heal message, it's pretty fucking simple alright?
			
		}
		
		
		return false;
	}
 
}
