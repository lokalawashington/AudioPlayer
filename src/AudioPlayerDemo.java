import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AudioPlayerDemo {

    public static void main(String[] args) {

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

        //int currentProductionNumber, String audioSpecification, ItemType mediaType
        AudioPlayer audioPlayer = new AudioPlayer("Dj Khaled",
                date,
                1,
                "HD",
                ItemType.Audio);

        audioPlayer.play();
    }
}
