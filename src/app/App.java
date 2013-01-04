package app;

import com.github.larste.jango.Jango;

public class App {

	public static void main(String[] args) throws Exception {
		
		Jango bot = new Jango();
		bot.setVerbose(true);
		bot.connect("irc.freenode.net");
		bot.joinChannel("#datamatiker");
	}
}