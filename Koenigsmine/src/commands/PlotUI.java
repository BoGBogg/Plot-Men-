package commands;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.form.element.ElementButton;
import cn.nukkit.form.window.FormWindowSimple;

public class PlotUI extends Command {
	
	public PlotUI()
	{
		super("plotui", "Öffne das Plot Menü");
	}

    @Override
    public boolean execute(CommandSender sender, String string, String[] args) {
    	Player player = (Player) sender;
       if(sender instanceof Player);
       if(player.hasPermission("command.plotui")) {
    	 FormWindowSimple form = new FormWindowSimple("Plot Menü", "");
	        form.addButton(new ElementButton("Zu deinem GS"));
	        form.addButton(new ElementButton("Deine Trust"));
	        form.addButton(new ElementButton("Deine Helper"));
	        form.addButton(new ElementButton("Claime ein GS"));
	        form.addButton(new ElementButton("Gebe dein GS frei"));
	        form.addButton(new ElementButton("Leere dein GS"));
	        player.showFormWindow(form, 1234);
     } else
    	player.sendMessage("§cDu hast für den Command keine rechte!");
		return false;
			
    }
}
    


