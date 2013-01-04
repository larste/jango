package com.github.larste.jango.plugin;

import java.util.Random;

import org.jibble.pircbot.PircBot;

import com.github.larste.jango.Plugin;

public class EightBall implements Plugin {

	private PircBot bot;
	public String[] answers = new String[20];
	
	public EightBall(PircBot bot) {

		this.bot = bot;
		this.createAnswers();
	}
	
	@Override
	public void handleMessage(String target, String sender, String login,
			String hostname, String message) throws Exception {

		if (message.startsWith("!8ball")) {
		
			Random generator = new Random();
			int random = generator.nextInt(20);

			this.bot.sendMessage(target, sender + ": " + this.answers[random]);
		}
	}
	
	private void createAnswers() {
		
		this.answers[0] = "It is certain";
		this.answers[1] = "It is decidedly so";
		this.answers[2] = "Without a doubt";	
		this.answers[3] = "Yes – definitely";	
		this.answers[4] = "You may rely on it";	
		this.answers[5] = "As I see it, yes";	
		this.answers[6] = "Most likely";	
		this.answers[7] = "Outlook good";	
		this.answers[8] = "Yes";	
		this.answers[9] = "Signs point to yes";	
		this.answers[10] = "Reply hazy, try again";	
		this.answers[11] = "Ask again later";	
		this.answers[12] = "Better not tell you now";	
		this.answers[13] = "Cannot predict now";	
		this.answers[14] = "Concentrate and ask again";	
		this.answers[15] = "Don't count on it";	
		this.answers[16] = "My reply is no";	
		this.answers[17] = "My sources say no";	
		this.answers[18] = "Outlook not so good";	
		this.answers[19] = "Very doubtful";	
	}
}