package exercise_musicPlaylist_LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class Song {
	String title;
	String artist;

	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
}

class MusicPlaylist {

	List<Song> playlist = new LinkedList<>();

	public void addSong(String title, String artist) {
		Song song = new Song(title, artist);
		playlist.add(song);
	}

	public void shufflePlaylist() {
		long seed = System.nanoTime();
		Collections.shuffle(playlist, new Random(seed));
	}

	public void repeatPlaylist(int times) {
		List<Song> repeatedPlaylist = new LinkedList<>();
		for(int i=0; i<times; i++) {
			repeatedPlaylist.addAll(playlist);
		}
		playlist = repeatedPlaylist;
	}

	public void displayPlaylist() {
		for (Song songs : playlist) {
			System.out.println("Title: " + songs.title + "// Artist: " + songs.artist);
		}
	}
}

public class Main {

	public static void main(String[] args) {

		MusicPlaylist playlist = new MusicPlaylist();

		playlist.addSong("Macarena", "Los del Rio");
		playlist.addSong("Beso", "Rosalia y Rauw");
		playlist.addSong("Malamente", "Rosalia");

		System.out.println("Original Playlist: ");
		playlist.displayPlaylist();
		System.out.println("----------");
		
		System.out.println("Shuffled Playlist: ");
		playlist.shufflePlaylist();
		
		playlist.displayPlaylist();
		System.out.println("----------");
		
		System.out.println("Repeated Playlist: ");
		playlist.repeatPlaylist(2);
		playlist.displayPlaylist();
	}

}
