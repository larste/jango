package com.github.larste.jango;

import org.jibble.pircbot.PircBot;

public class Jango extends PircBot {

	private PluginManager pluginManager;
	private SettingsManager settingsManager;
	
	public Jango() throws Exception {
		this.pluginManager = new PluginManager(this);
		this.settingsManager = new SettingsManager();
		
		this.setName("Jango_Bott");
	}
	
	public void run() throws Exception {
		this.setVerbose(true);
		this.connect("irc.freenode.net");
		this.joinChannel("#datamatiker");
	}
	
	public void onConnect() {
		super.onConnect();
		this.identify("");
	}
	
	public void onMessage(String channel, String sender, String login, String hostname, String message) {
		
		try {

			this.pluginManager.handleMessage(channel, sender, login, hostname,
					message);

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}
}