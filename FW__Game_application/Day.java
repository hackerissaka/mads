package com.cg.application.bean;

import java.util.List;

public class Day {
	
	private String name;
	private List<Game> game;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Game> getGame() {
		return game;
	}
	public void setGame(List<Game> game) {
		this.game = game;
	}
	/*@Override
	public String toString() {
		return "Day =" + name + ", " + game + " ";
	}*/
	
	

}
