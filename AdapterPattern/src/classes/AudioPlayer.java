package classes;

import interfaces.MediaPlayer;

public class AudioPlayer implements MediaPlayer {

	// this is used to summon an AdvancedMediaPlayer interface which returns
	// the appropriate AdvancedMediaPlayer implementer
	MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {
		
		if (audioType.equals("mp3")) {
			System.out.println("playing mp3 song : " + fileName);
		} else if (audioType.equals("mp4")) {
			mediaAdapter = new MediaAdapter("mp4");
			mediaAdapter.play("mp4", fileName);
		} else if (audioType.equals("vlc")) {
			mediaAdapter = new MediaAdapter("vlc");
			mediaAdapter.play("vlc", fileName);
		}
	}

}
