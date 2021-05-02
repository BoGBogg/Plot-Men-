package events;

import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerFormRespondedEvent;
import cn.nukkit.form.response.FormResponseSimple;
import cn.nukkit.form.window.FormWindowSimple;

public class PlayerFormRespondedEventEvent implements Listener {

	@EventHandler
	public void on(PlayerFormRespondedEvent event)
	{
		Player player = event.getPlayer();
		if(event.getWindow() instanceof FormWindowSimple) {
            FormWindowSimple form = (FormWindowSimple) event.getWindow();
            FormResponseSimple response = form.getResponse();
            if(response == null)
                        return;
            else if(response.getClickedButton().getText().equals("Gr��e zu 1.5 �ndern")) {
            	player.sendMessage("�aDu hast erflogreich deine Gr��e ge�ndert.");
            	player.setScale(1.5f);
          }
            else if(response.getClickedButton().getText().equals("Gr��e zu 0.5 �ndern")) {
            	player.sendMessage("�aDu hast erflogreich deine Gr��e ge�ndert.");
            	player.setScale(0.5f);
            }
            else if(response.getClickedButton().getText().equals("Normal werden")) {
            	player.sendMessage("�aDu hast erflogreich deine Gr��e ge�ndert.");
            	player.setScale(1);
            }
            
            else if(response.getClickedButton().getText().equals("Beanspruche ein Grundst�ck")) {
            	Server.getInstance().dispatchCommand(player, "deop");
            	
            	
            }
            
	   }
	}
}


	