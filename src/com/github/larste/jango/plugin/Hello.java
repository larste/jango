package com.github.larste.jango.plugin;

import org.jibble.pircbot.PircBot;

import com.github.larste.jango.Plugin;

public class Hello implements Plugin {

	private PircBot bot;

	public Hello(PircBot bot) {

		this.bot = bot;
	}

	@Override
	public void handleMessage(String target, String sender, String login,
			String hostname, String message) throws Exception {
		
		if (message.equalsIgnoreCase("!hello")) {
			
			this.bot.sendMessage(target, sender + ": Hello");
		}
	}
}
