package com.github.larste.jango.plugin;

import java.util.Date;

import org.jibble.pircbot.PircBot;

import com.github.larste.jango.Plugin;

public class Time implements Plugin {

	private PircBot bot;

	public Time(PircBot bot) {

		this.bot = bot;
	}

	@Override
	public void handleMessage(String target, String sender, String login,
			String hostname, String message) throws Exception {
		
		if (message.equalsIgnoreCase("!time")) {
			
			String time = new Date().toString();
			this.bot.sendMessage(target, sender + ": The time is now " + time);
		}
	}
}