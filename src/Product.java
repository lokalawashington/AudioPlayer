import java.util.Date;

public abstract class Product implements Item {
    int serialNumber;
    String manufacturer;
    Date manufacturedOn;
    String name;

    int currentProductionNumber;

    public Product(String name, Date manufacturedOn, int currentProductionNumber) {
        this.name = name;
        serialNumber = currentProductionNumber;
        this.manufacturedOn = manufacturedOn;
    }


    @Override
    public String toString() {
        return "Manufacturer: " + manufacturer + '\'' +
                "Serial Number: " + serialNumber + '\'' +
                "Date: " + manufacturedOn + '\'' +
                "Name: " + name + '\'';
    }

    @Override
    public void setProductionNumber(int num) {
        currentProductionNumber = num;

    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getManufactureDate() {
        return manufacturedOn;
    }

    @Override
    public int getSerialNumber() {
        return serialNumber;
    }
}
