import java.util.Date;

public class MoviePlayer extends Product implements MultimediaControl{

    Screen screen;
    MonitorType monitorType;

    public MoviePlayer(String name, Date manufacturedOn, int currentProductionNumber,  Screen screen, MonitorType monitorType) {
        super(name, manufacturedOn, currentProductionNumber);
        this.screen = screen;
        this.monitorType = monitorType;
    }

    @Override
    public String toString() {
        return "MoviePlayer{" +
                "screen=" + "Resolution: "+screen.getResolution() + "Refresh Rate: "+ screen.getRefreshRate() + "Response Time: "+ screen.getResponseTime()+
                ", monitorType=" + monitorType +
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
