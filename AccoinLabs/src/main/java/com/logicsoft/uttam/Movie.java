package com.logicsoft.uttam;

import java.util.*;;

public class Movie {
	
	private String name;
	private List<String> cast;
	private int duration;
	
	public Movie(String name,List<String> cast,int duration) {
		this.name = name;
		this.cast=cast;
		this.duration=duration;
	}
	
	public Movie() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public List<String> getCast(){
		return cast;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCast(List<String> cast) {
		this.cast=cast;
	}
	
	public void setDuration(int duration) {
		this.duration=duration;
	}

}
