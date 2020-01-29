import java.io.File;
import java.io.IOException;
import java.io.File;
import javax.sound.sampled.*;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class MakeSound {

    private static final int BUFFER_SIZE = 128000;
    private static File soundFile;
    private static AudioInputStream audioStream;
    private static AudioFormat audioFormat;
    private static SourceDataLine sourceLine;

    /**
     * @param filename the name of the file that is going to be played
     */
    public static void moan(String filename){
        File file = new File(filename);
        try
        {
            final Clip clip = (Clip)AudioSystem.getLine(new Line.Info(Clip.class));

            clip.addLineListener(new LineListener()
                {
                    @Override
                    public void update(LineEvent event)
                    {
                        if (event.getType() == LineEvent.Type.STOP)
                            clip.close();
                    }
                });

            clip.open(AudioSystem.getAudioInputStream(file));
            clip.start();
        }
        catch (Exception exc)
        {
            exc.printStackTrace(System.out);
        }
    }
}