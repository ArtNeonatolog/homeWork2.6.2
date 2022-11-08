package transport;

import java.util.Objects;

public abstract class Transport {

    private final String brand;
    private final String model;

    // private final int productionYear;
    // private final String productionCountry;
    // private String color;
    // private int maximumSpeed;

    public Transport(String brand, String model) { //int productionYear, String productionCountry, String color, int maximumSpeed) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "default";
        }
        // if (productionYear <= 1950) {
        // this.productionYear = 2000;
        //} else {
        //    this.productionYear = productionYear;}
        //  if (productionCountry != null && !productionCountry.isEmpty() && !productionCountry.isBlank()) {
        //    this.productionCountry = productionCountry;
        //  } else {
        // this.productionCountry = "Россия";
        // }
        // if (color != null && !color.isEmpty() && !color.isBlank()) {
        //  this.color = color;
        // } else {
        //   this.color = "белый";
        // }
        //if (maximumSpeed <= 0) {
        // this.maximumSpeed = 100;
        // } else {
        // this.maximumSpeed = maximumSpeed;
        // }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport)) return false;
        Transport transport = (Transport) o;
        return brand.equals(transport.brand) && model.equals(transport.model);
    }
    public abstract void determineTheTypeOfCar();

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    //public Integer getProductionYear() {
    //return productionYear;}

    //  public String getProductionCountry() {
    //   return productionCountry;}

    // public String getColor() {
    //   return color;
    //}

    // public Integer getMaximumSpeed() {
    //   return maximumSpeed;}

    // public void setColor(String color) {
    //    if (color != null && !color.isEmpty() && !color.isBlank()) {
    //   this.color = color;
    // } else {
    //   this.color = "белый";
    // }
}

// public void setMaximumSpeed(int maximumSpeed) {
//    if (maximumSpeed <= 0) {
// this.maximumSpeed = 100;
//  } else {
//   this.maximumSpeed = maximumSpeed;
//  }
// }
//}

//public abstract void refill ();
//}

