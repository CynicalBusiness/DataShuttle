package net.mayateck.DataShuttle;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

@SuppressWarnings("unused")
public class CommandHandler implements CommandExecutor{
	private DataShuttle plugin;
	
	public CommandHandler(DataShuttle plugin){
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender s, Command cmd, String l, String[] args) {
		if(DataShuttle.isConnected && DataShuttle.isReady){
			if(cmd.getName().equalsIgnoreCase("ds")){
				
			}
		}
		return false;
	}
}
