/**
 * 
 */
package me.divinius;

import org.bukkit.plugin.java.JavaPlugin;

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
		
		
		if (cmd.getName().equalsIgnoreCase("cl") && sender instanceof Player)
			
			Player player = (Player) sender;
			// I forgot what this was supposed to do...
	
	
	}

}
