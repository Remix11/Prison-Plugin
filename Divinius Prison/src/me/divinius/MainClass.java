/**
 * 
 */
package me.divinius;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;

/**
 * @author Remix11
 *
 */
public class MainClass extends JavaPlugin {
	
	
	
	@Override
	public void onEnable() {
		
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		
		
		if (cmd.getName().equalsIgnoreCase("cf") && sender instanceof Player)
			
			Player player = (Player) sender;
		
			Random rand = new Random();
	
			int coins = rand.nextInt(-50,50);
			
			player.sendMessage(rand.nextInt() + "coins")
			
		
		return true
	
	
	}
	
	return false

}
