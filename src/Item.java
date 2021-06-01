import java.util.Date;

public interface Item {
    final String MANUFACTURER=  "ScaiProduction";
    void setProductionNumber(int num);
    void setName(String name);
    String getName();
    Date getManufactureDate();
    int getSerialNumber();
}
