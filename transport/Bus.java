package transport;

import java.util.Objects;

public class Bus extends PassengerCar implements Competing {

    private CapacityType capacityType;

    public Bus(String brand, String model, float engineVolume, CapacityType capacityType) {
        super(brand, model, engineVolume);
        this.capacityType = capacityType;
    }

    public CapacityType getCapacityType() {
        return capacityType;
    }

    public void setCapacityType(CapacityType capacityType) {
        this.capacityType = capacityType;
    }

    public final int MAX_SPEED = 100;

    @Override
    public void startMoving() {
        System.out.println("Начало движения - медленный старт, затем плавный разгон");
    }

    @Override
    public void finishMoving() {
        System.out.println("Закончить движение после пересечения финишной черты постепенной остановкой");

    }

    @Override
    public boolean getDiagnosed() {
        System.out.println("Автобус " + getBrand() + getModel() + " в диагностике не нуждается");
        return true;

    }

    public void informationOfTheBus() {
        System.out.println(getBrand() + " " + getModel() + ", объем двигателя - " + getEngineVolume() + " л.");
    }

    @Override
    public void PitStop() {
        System.out.println("Заезжать на пит-стоп через каждые 15 кругов или если начнется дождь, также при поломке");

    }

    @Override
    public void theBestTimeOfLap() {
        System.out.println("Лучшее время круга - 15 мин. 42 сек.");
    }

    @Override
    public String maxSpeed() {
        return "Максимальная скорость автобуса в гоночных соревнованиях - " + MAX_SPEED + " км/ч.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus)) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return MAX_SPEED == bus.MAX_SPEED;
    }

    @Override
    public void determineTheTypeOfCar() {
        if (capacityType == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Вместимость автобуса - от " + capacityType.getFrom() + " до " + capacityType.getTo() + " мест.");}
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), MAX_SPEED);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "MAX_SPEED=" + MAX_SPEED +
                "} " + super.toString();
    }
}
