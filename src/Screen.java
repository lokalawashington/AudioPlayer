public class Screen implements ScreenSpec{

    private String resolution;
    private int refreshrate;
    private int responsetime;

    public Screen(String resolution, int refreshrate, int responsetime) {
        this.resolution = resolution;
        this.refreshrate = refreshrate;
        this.responsetime = responsetime;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "resolution='" + resolution + '\'' +
                ", refreshrate=" + refreshrate +
                ", responsetime=" + responsetime +
                '}';
    }

    @Override
    public String getResolution() {
        return resolution;
    }

    @Override
    public int getRefreshRate() {
        return refreshrate;
    }

    @Override
    public int getResponseTime() {
        return responsetime;
    }
}
