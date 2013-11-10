import java.util.logging.Level;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginDescriptionFile;

@SuppressWarnings("unused")
public class NeedHome extends JavaPlugin
  implements Listener
{
	public void onEnable()
	  {
	    getLogger().log(Level.INFO, "Version 1.0");
	    getServer().getPluginManager().registerEvents(this, this);
	    getConfig().options().copyDefaults(true);
	    saveConfig();
	  }

	
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
	  
    if ((cmd.getName().equalsIgnoreCase("ineedtown")) && 
      ((sender instanceof Player))) {
      Player p = (Player)sender;
      if (p.hasPermission("needhome.town"))
      {
    	    Bukkit.broadcastMessage(ChatColor.DARK_PURPLE + p.getDisplayName() + 
" "); 
    	    String message = getConfig().getString("TownMessage").replace("%player%", p.getName());
            message = ChatColor.translateAlternateColorCodes('&', message);
            Bukkit.broadcastMessage(message);
      }
    
  

    return false;
  }
    if ((cmd.getName().equalsIgnoreCase("needhome")) && 
    	      ((sender instanceof Player))) {
    	      Player p = (Player)sender;
    	      if (p.hasPermission("needhome.command"))
    	      {
    	    	   p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Invalid usage.");
    	    	   p.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "Commands");
    	    	   p.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "/Needhome - Displays help");
    	    	   p.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "/Needhome Reload - Reloads configuration");

    	      }
    	      if (args[0].equalsIgnoreCase("reload")) {
    	          if (args.length == 1) {
    	  
    	        	  this.reloadConfig();
    	        	  reloadConfig();
    	        	  
       	    	   p.sendMessage(ChatColor.GRAY + "" + ChatColor.BOLD + ChatColor.ITALIC + "Reloaded configuration file.");

    	    return false;
    	  }
    	      }
    }
    if ((cmd.getName().equalsIgnoreCase("ineedfaction")) && 
    	      ((sender instanceof Player))) {
    	      Player p = (Player)sender;
    	      if (p.hasPermission("needhome.faction"))
    	      {
    	    	    Bukkit.broadcastMessage(ChatColor.GOLD + p.getDisplayName() + 
    	" "); 
    	    	    String message = getConfig().getString("FactionMessage").replace("%player%", p.getName());
    	            message = ChatColor.translateAlternateColorCodes('&', message);
    	            Bukkit.broadcastMessage(message);
    	      }
    	    
    	  

    	    return false;
    	  }
    if ((cmd.getName().equalsIgnoreCase("ineedclan")) && 
  	      ((sender instanceof Player))) {
  	      Player p = (Player)sender;
  	      if (p.hasPermission("needhome.clan"))
  	      {
  	    	    Bukkit.broadcastMessage(ChatColor.BLUE + p.getDisplayName() + 
  	" "); 
  	    	  String message = getConfig().getString("ClanMessage").replace("%player%", p.getName());
	            message = ChatColor.translateAlternateColorCodes('&', message);
	            Bukkit.broadcastMessage(message);
  	      }
  	    
  	  

  	    return false;
  	  }
    if ((cmd.getName().equalsIgnoreCase("ineedteam")) && 
    	      ((sender instanceof Player))) {
    	      Player p = (Player)sender;
    	      if (p.hasPermission("needhome.team"))
    	      {
    	    	    Bukkit.broadcastMessage(ChatColor.AQUA + p.getDisplayName() + 
    	" "); 
    	    	    String message = getConfig().getString("TeamMessage").replace("%player%", p.getName());
    	            message = ChatColor.translateAlternateColorCodes('&', message);
    	            Bukkit.broadcastMessage(message);
    	      }
    	    
    	  

    	    return false;
    	  }
    if ((cmd.getName().equalsIgnoreCase("ineedhome")) && 
  	      ((sender instanceof Player))) {
  	      Player p = (Player)sender;
  	      if (p.hasPermission("needhome.home"))
  	      {
  	    	    Bukkit.broadcastMessage(ChatColor.DARK_GREEN + p.getDisplayName() + 
  	" "); 
  	    	  String message = getConfig().getString("HomeMessage").replace("%player%", p.getName());
	            message = ChatColor.translateAlternateColorCodes('&', message);
	            Bukkit.broadcastMessage(message);
  	      }
  	    
  	  

  	    return false;
  	  }
    if ((cmd.getName().equalsIgnoreCase("ineedmcmmoparty")) && 
    	      ((sender instanceof Player))) {
    	      Player p = (Player)sender;
    	      if (p.hasPermission("needhome.party"))
    	      {
    	    	    Bukkit.broadcastMessage(ChatColor.DARK_RED + p.getDisplayName() +    	    	    		    	    	    	  	    	    		
    	" "); 
    	    	    String message = getConfig().getString("PartyMessage").replace("%player%", p.getName());
    	            message = ChatColor.translateAlternateColorCodes('&', message);
    	            Bukkit.broadcastMessage(message);
    	            
    	      }
    	    
    	  

    	    return false;
    	  }
    if ((cmd.getName().equalsIgnoreCase("ineedtmem")) && 
  	      ((sender instanceof Player))) {
  	      Player p = (Player)sender;
  	      if (p.hasPermission("needhome.tmem"))
  	      {
  	    	    Bukkit.broadcastMessage(ChatColor.DARK_RED + p.getDisplayName() +    	    	    		    	    	    	  	    	    		
  	" "); 
  	    	    String message = getConfig().getString("TownMemberMessage").replace("%player%", p.getName());
  	            message = ChatColor.translateAlternateColorCodes('&', message);
  	            Bukkit.broadcastMessage(message);
  	      }
  	    
  	  

  	    return false;
  	  }
	return false;
}



}


