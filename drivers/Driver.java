package drivers;

import transport.*;

import java.util.Objects;

public abstract class Driver <A extends Transport & Competing> {
    private final String name;

    protected boolean driverLicense;

    private int drivingExperience;

    private final A transport;

    public Driver(String name, boolean driverLicense, int drivingExperience, A transport) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Иванов Иван Иванович";
        }
        this.driverLicense = driverLicense;
        if (drivingExperience < 0) {
            this.drivingExperience = 0;
        } else {
            this.drivingExperience = drivingExperience;
        }
            this.transport = transport;
    }

    public A transport(String brand, String model, float engineVolume) {
        return transport;
    }

    public String getName() {
        return name;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public A getTransport() {
        if (transport == null) {
            throw new IllegalArgumentException("Необходимо указать тип прав!");
        } else {
            return transport;
        }
    }

    public void setDrivingExperience(int drivingExperience) {
        if (drivingExperience < 0) {
            this.drivingExperience = 0;
        } else {
            this.drivingExperience = drivingExperience;
        }
    }
    public abstract void startMoving();
    public abstract void finishMoving();

    public abstract void refuel();
    public void informationOfDriver() {
        if (this.driverLicense == true) {
            System.out.println("Имя водителя автомобиля - " + getName() + ", водительский стаж - " + this.getDrivingExperience() + " лет, имеет действующие водительские права");
        } else {
            System.out.println("Водитель не может быть допущен к управлению автомобилем, т.к. нет водительских прав");
        }
    }
    public void driverDriving() {
        if (this.driverLicense == true) {
            System.out.println("Водитель - " + this.getName() + " управляет автомобилем " + transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде");
        } else {
            System.out.println("Водитель легкового автомобиля - " + getName() + " не допущен к соревнованиям, т.к. отсутствуют или просрочены водительские права");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver<?> driver = (Driver<?>) o;
        return driverLicense == driver.driverLicense && drivingExperience == driver.drivingExperience && name.equals(driver.name) && transport.equals(driver.transport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, driverLicense, drivingExperience, transport);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driverLicense=" + driverLicense +
                ", drivingExperience=" + drivingExperience +
                ", transport=" + transport +
                '}';
    }
}