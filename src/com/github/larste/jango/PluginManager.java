package com.github.larste.jango;

import java.util.ArrayList;
import java.util.List;

import org.jibble.pircbot.PircBot;

import com.github.larste.jango.plugin.*;

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
	
	public void handleMessage(String target, String sender, String message) {
		
		for (Plugin plugin : this.plugins) {
			
			String result = plugin.handleMessage(sender, message);
			
			if (result != null) {
				
				this.bot.sendMessage(target, result);
			}
		}
	}
	
	private void initPlugins() {
		
		this.registerPlugin(new Hello());
		this.registerPlugin(new Time());
		new EightBall(this);
		this.registerPlugin(new Baje());
	}
}
