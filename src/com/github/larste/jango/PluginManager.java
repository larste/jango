package com.github.larste.jango;

import java.util.ArrayList;
import java.util.List;

import org.jibble.pircbot.PircBot;

import com.github.larste.jango.plugin.Baje;
import com.github.larste.jango.plugin.CNoiz;
import com.github.larste.jango.plugin.EightBall;
import com.github.larste.jango.plugin.Hello;
import com.github.larste.jango.plugin.Meme;
import com.github.larste.jango.plugin.Reddit;
import com.github.larste.jango.plugin.Time;

public class PluginManager {

	private PircBot bot;
	private List<Plugin> plugins = new ArrayList<Plugin>();
	
	public PluginManager(PircBot bot) {
		
		this.bot = bot;
		this.initPlugins();
	}
	
	public void registerPlugin(Plugin plugin) {
		
		if (!this.plugins.contains(plugin)) {
			
			this.plugins.add(plugin);
		}
	}

	public void removePlugin(Plugin plugin) {
		
		if (this.plugins.contains(plugin)) {
			
			this.plugins.remove(plugin);
		}
	}
	
	public void handleMessage(String target, String sender, String login,
			String hostname, String message) throws Exception {
		
		for (Plugin plugin : this.plugins) {
			
			plugin.handleMessage(target, sender, login, hostname, message);
		}
	}
	
	private void initPlugins() {
		
		this.registerPlugin(new Baje(this.bot));
		this.registerPlugin(new CNoiz(this.bot));
		this.registerPlugin(new EightBall(this.bot));
		this.registerPlugin(new Hello(this.bot));
		this.registerPlugin(new Meme(this.bot));
		this.registerPlugin(new Reddit(this.bot));
		this.registerPlugin(new Time(this.bot));
	}
}
