package classes;

import interfaces.AdvancedMediaPlayer;
import interfaces.MediaPlayer;

/**
 * @author dylan
 *
 */
public class MediaAdapter implements MediaPlayer {

	// interface to the advanced media players
	AdvancedMediaPlayer advancedMusicPlayer;

	/**
	 * @param audioType
	 */
	public MediaAdapter(String audioType) {

		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer = new VlcPlayer();

		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer = new Mp4Player();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.MediaPlayer#play(java.lang.String, java.lang.String)
	 */
	@Override
	public void play(String audioType, String fileName) {

		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer.playVlc(fileName);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer.playMp4(fileName);
		}
	}
}
