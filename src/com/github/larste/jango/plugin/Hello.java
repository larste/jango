package com.github.larste.jango.plugin;

import com.github.larste.jango.Plugin;

public class Hello implements Plugin {

	@Override
	public String handleMessage(String sender, String message) {
		
		String result = null;
		
		if (message.equalsIgnoreCase("!hello")) {
			
			result = sender + ": Hello";
		}
		
		return result;
	}
}
