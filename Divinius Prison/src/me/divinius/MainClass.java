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
	
	Random rand = new Random();
	
	int coins = rand.nextInt(50);
	
	@Override
	public void onEnable() {
		
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		
		
		if (cmd.getName().equalsIgnoreCase("cf") && sender instanceof Player)
			
			Player player = (Player) sender;
			
			player.sendMessage()
			
		
		return true
	
	
	}
	
	return false

}
