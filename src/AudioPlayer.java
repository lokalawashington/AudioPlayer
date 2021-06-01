import java.util.Date;

public class AudioPlayer extends Product implements MultimediaControl{

    String audioSpecification;
    ItemType mediaType;

    public AudioPlayer(String name, Date manufacturedOn, int currentProductionNumber, String audioSpecification, ItemType mediaType) {
        super(name, manufacturedOn, currentProductionNumber);
        this.audioSpecification = audioSpecification;
        this.mediaType = mediaType;
    }

    @Override
    public String toString() {
        return "AudioPlayer{" +
                "audioSpecification='" + audioSpecification + '\'' +
                ", mediaType=" + mediaType +
                ", serialNumber=" + serialNumber +
                ", manufacturer='" + manufacturer + '\'' +
                ", manufacturedOn=" + manufacturedOn +
                ", name='" + name + '\'' +
                ", currentProductionNumber=" + currentProductionNumber +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Playing");
    }

    @Override
    public void stop() {
        System.out.println("Stopping");
    }

    @Override
    public void previous() {
        System.out.println("Going to Previous");
    }

    @Override
    public void next() {
        System.out.println("Going to Next");
    }
}
