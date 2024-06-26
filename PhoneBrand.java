package ro.siit;

// Abstract class for PhoneBrand
public abstract class PhoneBrand {
    protected String brandName;

    public PhoneBrand(String brandName) {
        this.brandName = brandName;
    }

    public abstract Phone createPhone(String model);
}
