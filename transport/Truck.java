package transport;

import java.util.Objects;

public class Truck extends PassengerCar implements Competing {

    public CarryingCapacity carryingCapacity;

    public Truck(String brand, String model, float engineVolume, CarryingCapacity carryingCapacity) {
        super(brand, model, engineVolume);
        this.carryingCapacity = carryingCapacity;
    }

    public CarryingCapacity getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(CarryingCapacity carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public final int MAX_SPEED = 150;

    @Override
    public void startMoving() {
        System.out.println("Начало движения - постепенный старт, затем быстрый разгон");
    }

    @Override
    public void finishMoving() {
        System.out.println("Закончить движение после пересечения финишной черты медленным торможением");

    }

    @Override
    public boolean getDiagnosed() {
        return Math.random() > 0.75;
    }

    public void informationOfTheTrucks() {
        System.out.println(getBrand() + " " + getModel() + ", объем двигателя - " + getEngineVolume() + " л.");
    }


    @Override
    public void PitStop() {
        System.out.println("Заезжать на пит-стоп через каждые 20 кругов или если начнется дождь, также при поломке");
    }

    @Override
    public void theBestTimeOfLap() {
        System.out.println("Лучшее время круга - 9 мин. 58 сек.");

    }

    @Override
    public String maxSpeed() {
        return "Максимальная скорость грузовой машины в гоночных соревнованиях - " + MAX_SPEED + " км/ч.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Truck)) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return MAX_SPEED == truck.MAX_SPEED;
    }

    @Override
    public void determineTheTypeOfCar() {
        if (carryingCapacity == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            String from = carryingCapacity.getFrom() == null?"": " от " + carryingCapacity.getFrom();
            String to = carryingCapacity.getTo() == null?"": " до " + carryingCapacity.getTo();
            System.out.println("Грузоподъемность грузового автомобиля -" + from + to + " тонн.");}
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), MAX_SPEED);
    }

    @Override
    public String toString() {
        return "Trucks{" +
                "MAX_SPEED=" + MAX_SPEED +
                "} " + super.toString();
    }
}
