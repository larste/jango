package com.github.larste.jango;

public interface Plugin {

	public void handleMessage(String target, String sender, String login,
			String hostname, String message) throws Exception;
}
