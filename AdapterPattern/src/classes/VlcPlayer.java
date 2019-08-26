package classes;

import interfaces.AdvancedMediaPlayer;

/**
 * @author dylan
 *
 */
public class VlcPlayer implements AdvancedMediaPlayer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.AdvancedMediaPlayer#playVlc(java.lang.String)
	 */
	@Override
	public void playVlc(String fileName) {

		System.out.println("playing Vlc song : " + fileName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.AdvancedMediaPlayer#playMp4(java.lang.String)
	 */
	@Override
	public void playMp4(String fileName) {

		return;
	}

}
