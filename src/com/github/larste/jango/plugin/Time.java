package com.github.larste.jango.plugin;

import java.util.Date;

import com.github.larste.jango.Plugin;

public class Time implements Plugin {

	@Override
	public String handleMessage(String sender, String message) {
		
		String result = null;
		
		if (message.equalsIgnoreCase("!time")) {
			
			String time = new Date().toString();
			result = sender + ": The time is now " + time;
		}
		
		return result;
	}
}