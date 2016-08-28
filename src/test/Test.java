package test;

import musicplayer.MusicPlayer;

public class Test {
	public static void main(String args[]) {
		MusicPlayer player = new MusicPlayer();
		
		player.load("test.mp3", true);
		player.play();
	}
}
