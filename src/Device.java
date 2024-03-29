
public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;


    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }



    @Override
    public String toString() {
        return "Device: manufacturer=" + manufacturer + ", price=" + price + ", serialNumber=" + serialNumber;
    }
}


public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;


    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }


    @Override
    public String toString() {
        return super.toString() + ", X=" + resolutionX + ", Y=" + resolutionY;
    }
}


public class EthernetAdapter extends Device {
    private int speed;
    private String mac;


    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }


    @Override
    public String toString() {
        return super.toString() + ", speed=" + speed + ", mac=" + mac;
    }
}
