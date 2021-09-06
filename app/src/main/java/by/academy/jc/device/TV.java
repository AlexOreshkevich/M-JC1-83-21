package by.academy.jc.device;

import com.google.common.base.MoreObjects;

public class TV extends Device {
    private String brand;
    private Double price;

    public TV(String brand, Double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", getId())
                .add("brand", brand)
                .add("price", price)
                .toString();
    }
}
