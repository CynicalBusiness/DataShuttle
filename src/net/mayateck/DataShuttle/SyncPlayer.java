package net.mayateck.DataShuttle;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

@SuppressWarnings("unused")
public class SyncPlayer implements Listener{
	
	private DataShuttle plugin;
	public SyncPlayer(DataShuttle instance){
		plugin=instance;
	}
	
	
	@EventHandler()
	public void playerConnect(PlayerLoginEvent event){
		Player player = event.getPlayer();
		String pName = player.getName();
		if (DataShuttle.isConnected==true && DataShuttle.isReady==true){
			player.sendMessage(DataShuttle.header + "Attempting to fetch data for you...");
			int r = FetchNetworkData.fetchPlayerData(pName);
			if (r==0){
				// TODO Sync player data.
				player.sendMessage(DataShuttle.hSucc + "Sync Successful. You have been moved to your correct rank.");
			}
		} else {
			player.sendMessage(DataShuttle.hError + "DataShuttle is offline or disabled. Could not Sync!");
		}
	}
}
