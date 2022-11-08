package drivers;

import transport.PassengerCar;
import transport.Truck;
public class DriverC extends Driver<Truck> {

    public DriverC(String name, boolean driverLicense, int drivingExperience, Truck transport) {
        super(name, driverLicense, drivingExperience, transport);
    }

    @Override
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
        return "DriverC{" +
                "driverLicense=" + driverLicense +
                "} " + super.toString();
    }
}