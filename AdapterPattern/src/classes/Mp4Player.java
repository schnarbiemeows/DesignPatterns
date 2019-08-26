package classes;

import interfaces.AdvancedMediaPlayer;

/**
 * @author dylan
 *
 */
public class Mp4Player implements AdvancedMediaPlayer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.AdvancedMediaPlayer#playVlc(java.lang.String)
	 */
	@Override
	public void playVlc(String fileName) {

		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.AdvancedMediaPlayer#playMp4(java.lang.String)
	 */
	@Override
	public void playMp4(String fileName) {

		System.out.println("playing Mp4 song : " + fileName);
	}

}
