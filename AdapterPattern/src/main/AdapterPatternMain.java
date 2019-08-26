package main;

import classes.AudioPlayer;
import interfaces.MediaPlayer;

/**
 * @author dylan
 *
 */
public class AdapterPatternMain {

	/**
	 * The Adapter pattern works as a bridge between two incompatible interfaces.
	 * Structural Pattern
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		MediaPlayer myPlayer = new AudioPlayer();
		// this one plays using the old AudioPlayer class
		myPlayer.play("mp3", "abc");
		// these two use the MediaAdapter interface to retrieve an AdvancedMedaiPlayer,
		// which then plays the new formats
		myPlayer.play("mp4", "def");
		myPlayer.play("vlc", "ghi");
	}

}
