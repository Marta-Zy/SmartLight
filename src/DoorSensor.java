public class DoorSensor {

    String sensorID;
    boolean isOpen = false;

    public void openDoor() {
        isOpen = true;
        System.out.println("Dorrsensor " + sensorID + ": Doors are oppen");
    }

    public void closeDoor() {
        isOpen = false;
        System.out.println("dorrsensor " + sensorID + ": Doors äre close");

    }
}
