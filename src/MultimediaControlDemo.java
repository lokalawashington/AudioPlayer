import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MultimediaControlDemo {

    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

        Screen screen = new Screen("1050X768", 60, 12);


        AudioPlayer audioPlayer = new AudioPlayer("Dj Khaled",
                date,
                1,
                "HD",
                ItemType.Audio);
        MoviePlayer moviePlayer = new MoviePlayer(
                "Into the Badlands",
                date,1,screen,MonitorType.LCD
        );



        audioPlayer.play();
        moviePlayer.play();

    }
}
