package ro.siit;

// Abstract class for PhoneModel
public abstract class PhoneModel implements Phone {
    protected String model;
    protected String color;
    protected String material;
    protected int batteryLife; // in hours
    protected String IMEI;

    public PhoneModel(String model, String color, String material, int batteryLife, String IMEI) {
        this.model = model;
        this.color = color;
        this.material = material;
        this.batteryLife = batteryLife;
        this.IMEI = IMEI;
    }

    // Add common methods for all phone models here

}
