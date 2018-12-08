package classes;

import interfaces.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		
		return;
	}

	@Override
	public void playMp4(String fileName) {
		
		System.out.println("playing Mp4 song : " + fileName);
	}

}
