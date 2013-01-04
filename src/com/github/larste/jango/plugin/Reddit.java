package com.github.larste.jango.plugin;

import java.net.URL;
import java.util.Iterator;

import org.jibble.pircbot.PircBot;

import com.github.larste.jango.Plugin;
import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

public class Reddit implements Plugin {

	private PircBot bot;

	public Reddit(PircBot bot) {

		this.bot = bot;
	}

	@Override
	public void handleMessage(String target, String sender, String login,
			String hostname, String message) throws Exception {

		if (message.equalsIgnoreCase("!reddit")) {

			URL url = new URL("http://www.reddit.com/r/datamatiker/.rss");

			XmlReader reader = null;

			try {

				reader = new XmlReader(url);
				SyndFeed feed = new SyndFeedInput().build(reader);

				Iterator i = feed.getEntries().subList(0, 5).iterator();

				while (i.hasNext()) {

					SyndEntry entry = (SyndEntry) i.next();
					this.bot.sendMessage(target, entry.getTitle()
							+ " : "
							+ entry.getUri());
				}

			} finally {

				if (reader != null) {

					reader.close();
				}
			}
		}
	}
}
