package musicplayer;

import java.io.File;
import java.nio.file.Paths;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class MusicPlayer {
	MediaPlayer player = null;
	
	private boolean initializeMediaPlayer(File file, boolean loop) {
		Media media = new Media(Paths.get(file.getName()).toUri().toString());
		
		player = new MediaPlayer(media);
		
		if(loop) {
			player.setOnEndOfMedia(new Runnable() {
				@Override
				public void run() {
					player.play();
				}
			});
		}
		
		return true;
	}
	
	public boolean load(String fileName, boolean loop) {
		File source = new File(fileName);
		
		if(source.exists()) {
			return initializeMediaPlayer(source, loop);
		}
		else {
			return false;
		}
	}
	
	public boolean play() {
		if(player != null) {
			player.play();
			
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean stop() {
		if(player != null) {
			player.stop();
			
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean setVolume(float volume) {
		if(player != null) {
			player.setVolume(volume);
			
			return true;
		}
		else {
			return false;
		}
	}
}
