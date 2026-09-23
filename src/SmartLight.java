public class SmartLight {

    String deviceID;
    boolean isOn;
    int brightness;

        public void turnOn() {
            isOn = true;
            System.out.println("Light with ID " + deviceID + " is now ON.");
        }

        public void turnOff() {
            isOn = false;
            System.out.println("Light with ID " + deviceID + " is now OFF. ");
        }
    }
