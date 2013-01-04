package com.github.larste.jango;

import java.util.ArrayList;
import java.util.List;

import org.jibble.pircbot.PircBot;

public class SettingsManager {

	private String name;
	private List<String> channels = new ArrayList<String>();
	
	public SettingsManager() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
