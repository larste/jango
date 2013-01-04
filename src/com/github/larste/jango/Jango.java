package com.github.larste.jango;

import org.jibble.pircbot.*;

public class Jango extends PircBot {

	private PluginManager pluginManager;
	private SettingsManager settingsManager;
	
	public Jango() {
		this.pluginManager = new PluginManager(this);
		this.settingsManager = new SettingsManager();
		
		this.setName("Jango_Bott");
	}
	
	public void onConnect() {
		super.onConnect();
		this.identify("");
	}
	
	public void onMessage(String channel, String sender, String login, String hostname, String message) {
		
		this.pluginManager.handleMessage(channel, sender, message);
	}
}