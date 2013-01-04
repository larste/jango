package com.github.larste.jango.plugin;

import com.github.larste.jango.Plugin;

public class Baje implements Plugin {

	@Override
	public String handleMessage(String sender, String message) {
		
		String result = null;
		
		if (message.equalsIgnoreCase("!baje")) {
			
			result = sender + ": ØL OG SNAPS!";
		}
		
		return result;
	}
}