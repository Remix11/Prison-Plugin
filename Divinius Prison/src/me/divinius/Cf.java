/**
 * 
 */
package me.divinius;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;

/**
 * @author Remix11
 *
 */
public class MainClass extends JavaPlugin {
	
	int numberofcoins = 0;
	
	
	
	@Override
	public void onEnable() {
		
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		
		
		if (cmd.getName().equalsIgnoreCase("cl") && sender instanceof Player) {
			
			Player player = (Player) sender;
		
			Random rand = new Random();
	
			int coins = rand.nextInt(50);
			
			player.sendMessage(rand.nextInt() + "coins");
				
			numberofcoins = numberofcoins + coins;
			
		
		return true;
	
	
	}
	
	return false;

 }

}
