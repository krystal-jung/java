package MP3;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

public class playWaveTest {
	
	    private AudioFormat audioFormat = null;
	    private SourceDataLine sourceDataLine = null;
	    private DataLine.Info dataLine_info = null;
	   private String wavfilename = "D:\\����\\musictest\\hey.wav";     
	
	    private AudioInputStream audioInputStream = null;

	    public playWaveTest() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
	        File wavfile= new File(wavfilename);
	        audioInputStream = AudioSystem.getAudioInputStream(wavfile);
	  
	        audioFormat = audioInputStream.getFormat();
	        System.out.println("ÿ�벥��֡����"+audioFormat.getSampleRate());
	        System.out.println("��֡����"+audioInputStream.getFrameLength());
	        System.out.println("��Ƶʱ�����룩��"+audioInputStream.getFrameLength()/audioFormat.getSampleRate());
	        dataLine_info = new DataLine.Info(SourceDataLine.class, audioFormat);
	        sourceDataLine = (SourceDataLine) AudioSystem.getLine(dataLine_info);
	    }

	    public void play() throws IOException, LineUnavailableException {
	        byte[] b = new byte[1024];
	        int len = 0;
	        sourceDataLine.open(audioFormat, 1024);
	        sourceDataLine.start();
	        while ((len = audioInputStream.read(b)) > 0) {
	            sourceDataLine.write(b, 0, len);
	        }
	        audioInputStream.close();
	        sourceDataLine.drain();
	        sourceDataLine.close();
	    }
	public static void main(String[] args) {
		try {
            new playWaveTest().play();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        }
	}
	
}

