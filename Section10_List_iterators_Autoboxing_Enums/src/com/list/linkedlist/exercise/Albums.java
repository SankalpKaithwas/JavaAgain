package com.list.linkedlist.exercise;

import java.util.ArrayList;
import java.util.List;

public class Albums {

	private String name;
	private String artist;
	private ArrayList<Song> songs;

	public Albums(String name, String artist) {
		this.name = name;
		this.artist = artist;
		this.songs = new ArrayList<Song>();
	}

	public boolean addSong(String inSong, double duration) {
		Song soungFound = findSong(inSong);
		if (soungFound == null) {
			songs.add(new Song(inSong, duration));
			return true;
		}
		return false;
	}

	private Song findSong(String song) {
		Song foundSong = null;
		for (int i = 0; i < songs.size(); i++) {
			if (songs.get(i).getTitle().equals(song)) {
				foundSong = new Song(songs.get(i).getTitle(), songs.get(i).getDuration());
				return foundSong;
			}
		}
		return foundSong;
	}

	public boolean addToPlayList(int trackNumber, List<Song> list) {
		boolean addedToPlaylist = false;

//		for (int i = 0; i < songs.size(); i++) {
//			if (songs.indexOf(songs.get(i)) == trackNumber) {
//				list.add(new Song(songs.get(i).getTitle(), songs.get(i).getDuration()));
//			}
//		}

		/** Or using findSong() */
		if (trackNumber >= 0 && trackNumber < songs.size()) {
			String track = songs.get(trackNumber).getTitle();
			Song songToAdd = findSong(track);
			if (songToAdd != null) {
				list.add(new Song(songs.get(trackNumber).getTitle(), songs.get(trackNumber).getDuration()));
				addedToPlaylist = true;
			} else {
				addedToPlaylist = true;
			}
		}

		return addedToPlaylist;
	}

	public boolean addToPlayList(String title, List<Song> playlist) {
		boolean addedToPlaylist = false;
//		for (int i = 0; i < songs.size(); i++) {
//			if (songs.get(i).getTitle().equalsIgnoreCase(title)) {
//				playlist.add(new Song(title, songs.get(i).getDuration()));
//				addedToPlaylist = true;
//			}
//		}

//		Using findSong()
		String track = "";
		for (int i = 0; i < songs.size(); i++) {
			track = songs.get(i).getTitle();
			Song songToAdd = findSong(track);
			if (songToAdd != null && songToAdd.getTitle().equals(title)) {
				playlist.add(songToAdd);
				addedToPlaylist = true;
			}

		}
		return addedToPlaylist;
	}

	@Override
	public String toString() {
		return "Albums [name=" + name + ", artist=" + artist + ", songs=" + songs + "]";
	}

}
