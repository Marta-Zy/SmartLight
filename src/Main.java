
public class Main {

    public static void main(String[] args) {
        // SmrtLight

        SmartLight lamp1 = new SmartLight();
        lamp1.deviceID = "Lamp-101";
        lamp1.brightness = 80;

        SmartLight lamp2 = new SmartLight();
        lamp2.deviceID = "Lamp-102";
        lamp2.brightness = 100;

        SmartLight lamp3 = new SmartLight();
        lamp3.deviceID = "Lamp-103";
        lamp3.brightness = 15;

        lamp1.turnOn();
        lamp1.turnOff();

        lamp2.turnOn();
        lamp2.turnOff();

        lamp3.turnOn();
        lamp3.turnOff();

        System.out.println("----------------------------------------");

        //DoorSensor
        DoorSensor door = new DoorSensor();
        door.sensorID = "Door-01";

        door.openDoor();

        if (door.isOpen) {
            System.out.println("Open door detected! Turning on Light 2...");
            lamp2.turnOn();
        }
    }
}