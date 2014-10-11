package helloworld;
import net.canarymod.plugin.Plugin;
import net.canarymod.logger.Logman;
import net.canarymod.Canary;
import net.canarymod.commandsys.*;
import net.canarymod.chat.MessageReceiver;
import com.pragprog.ahmine.ez.EZPlugin;

public class HelloWorld extends EZPlugin {
	
	@Command(aliases = { "hello" },
			 description = "Displays the hello world message.",
			 permissions = { "" },
			 toolTip = "/hello"	)
				 
	public void helloCommand(MessageReceiver caller, String[] parameters) {
		String msg = "That'sss a very niccce EVERYTHING you have there...";
		Canary.instance().getServer().broadcastMessage(msg);
	}
}