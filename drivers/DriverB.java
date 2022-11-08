package drivers;

import transport.Car;
import transport.PassengerCar;

public class DriverB extends Driver<Car> {

    public DriverB(String name, boolean driverLicense, int drivingExperience, Car transport) {
        super(name, driverLicense, drivingExperience, transport);
    }

    public void startMoving() {
        System.out.println("Вставляю ключ в замок зажигания, поворачиваю, удерживаю сцепление, нажимаю педаль газа, начинаю движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Плавно нажимаю на педаль тормоза, останавливаю машину");
    }

    @Override
    public void refuel() {
        System.out.println("Если в машине бензина осталось менее чем 1/3 бака, заправляю машину");
    }

    @Override
    public String toString() {
        return "DriverB{" +
                "driverLicense=" + driverLicense +
                "} " + super.toString();
    }
}