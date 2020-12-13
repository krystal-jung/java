package MP3;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException; 
import javazoom.jl.player.Player;
public class AudioPlayer {
	public static void main(String[] args) throws JavaLayerException, FileNotFoundException {
	File file = new File("D:\\×ÀÃæ\\musictest\\hurry.mp3");
	FileInputStream fin = new FileInputStream(file);
	BufferedInputStream stream = new BufferedInputStream(fin);
	Player player = new Player(stream);
	player.play();
}
}