package ro.siit;

// Concrete class for SamsungBrand
public class SamsungBrand extends PhoneBrand {
    public SamsungBrand() {
        super("Samsung");
    }

    @Override
    public Phone createPhone(String model) {
        if (model.equals("SamsungGalaxyS6")) {
            return new SamsungGalaxyS6();
        }
        // Add more models here if needed
        else {
            throw new IllegalArgumentException("Invalid model for Samsung phone");
        }
    }
}

