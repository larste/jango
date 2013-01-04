package com.github.larste.jango.plugin;

import org.jibble.pircbot.PircBot;

import com.github.larste.jango.Plugin;

public class Baje implements Plugin {

	private PircBot bot;

	public Baje(PircBot bot) {

		this.bot = bot;
	}

	@Override
	public void handleMessage(String target, String sender, String login,
			String hostname, String message) throws Exception {
		
		if (message.equalsIgnoreCase("!baje")) {
			
			this.bot.sendMessage(target, sender + ": ØL OG SNAPS!");
		}
	}
}