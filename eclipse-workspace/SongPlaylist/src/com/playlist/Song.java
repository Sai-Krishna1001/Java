package com.playlist;

public class Song {
	
	private String songName;
	private String duration;
	
	//constructor with fields
	public Song(String songName, String duration) {
		super();
		this.songName = songName;
		this.duration = duration;
	}

	//getters and setters
	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Song [songName=" + songName + ", duration=" + duration + "]";
	}
	
	
	

}
