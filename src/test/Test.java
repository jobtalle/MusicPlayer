package test;

import javafx.embed.swing.JFXPanel;
import musicplayer.MusicPlayer;

public class Test {
	public static void main(String args[]) {
		MusicPlayer player = new MusicPlayer();
		
		new JFXPanel(); // This initializes the toolkit required to play media files
		
		player.load("test.mp3", true);
		player.play();
	}
}
