package com.github.larste.jango.plugin;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.jibble.pircbot.PircBot;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.github.larste.jango.Plugin;

public class CNoiz implements Plugin {

	private PircBot bot;

	public CNoiz(PircBot bot) {

		this.bot = bot;
	}

	@Override
	public void handleMessage(String target, String sender, String login,
			String hostname, String message) throws Exception {

		if (message.equalsIgnoreCase("!cnoiz")) {
			URL url = new URL(
					"http://api.icndb.com/jokes/random?escape=javascript");

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					url.openStream()));

			String input;

			JSONParser parser = new JSONParser();

			Object o = parser.parse(reader);
			JSONObject jo = (JSONObject) o;

			JSONObject joke = (JSONObject) jo.get("value");
			String returnMessage = (String) joke.get("joke");
			this.bot.sendMessage(target, returnMessage);
		}
	}
}
