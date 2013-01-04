package com.github.larste.jango.plugin;

import org.jibble.pircbot.PircBot;

import com.github.larste.jango.Plugin;

public class Meme implements Plugin {

	private PircBot bot;

	public Meme(PircBot bot) {

		this.bot = bot;
	}

	@Override
	public void handleMessage(String target, String sender, String login,
			String hostname, String message) throws Exception {

		if (message.equalsIgnoreCase("!meme_cry")) {

			this.bot.sendMessage(target, "ಥ_ಥ");
		} else if (message.equalsIgnoreCase("!meme_disapp")) {

			this.bot.sendMessage(target, "ಠ_ಠ");
		} else if (message.equalsIgnoreCase("!meme_dunno")) {

			this.bot.sendMessage(target, "¯＼(º_o)/¯");
		} else if (message.equalsIgnoreCase("!meme_fu")) {

			this.bot.sendMessage(target, "╭∩╮(Ο_Ο)╭∩╮");
		} else if (message.equalsIgnoreCase("!meme_happy")) {

			this.bot.sendMessage(target, "ツ");
		} else if (message.equalsIgnoreCase("!meme_tableflip")) {

			this.bot.sendMessage(target, "(╯°□°）╯︵ ┻━┻");
		} else if (message.equalsIgnoreCase("!meme_tableflip2")) {

			this.bot.sendMessage(target, "┻━┻ ︵╰(°□°)╯︵ ┻━┻");
		} else if (message.equalsIgnoreCase("!meme_tableputback")) {
			
			this.bot.sendMessage(target, "┬──┬ ﻿ノ( ゜-゜ノ)");
		} else if (message.equalsIgnoreCase("!meme_tablethrow")) {

			this.bot.sendMessage(target, "(ノಠ益ಠ)ノ彡┻━┻");
		} else if (message.equalsIgnoreCase("!meme_yeah")) {

			this.bot.sendMessage(target, "(-■_■)");
		} else if (message.equalsIgnoreCase("!meme_yuno")) {

			this.bot.sendMessage(target, "ლ(ಠ益ಠლ)");
		} else if (message.equalsIgnoreCase("!meme_zoidberg")) {

			this.bot.sendMessage(target, "(\\/) (°,,°) (\\/)");
		}
	}
}