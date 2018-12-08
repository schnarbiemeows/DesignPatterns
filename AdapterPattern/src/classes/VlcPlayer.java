package classes;

import interfaces.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		
		System.out.println("playing Vlc song : " + fileName);
	}

	@Override
	public void playMp4(String fileName) {
		
		return;
	}

}
