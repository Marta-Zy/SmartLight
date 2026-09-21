
public class Main {

    public static void main(String[] args) {
    // Nivå1
        int lightId = 1;
        boolean isLightOn = false;
        int brightness = 0;
        String doorZone = "Entré";
        boolean isOpen = true;

        if (isOpen) {
        isLightOn = true;
        brightness = 80;
        System.out.println("Door " + doorZone + " are open!");
        System.out.println("Lamp status (" + isLightOn + ") is ON");
        }

        if (brightness >= 0 && brightness <= 100) {

        System.out.println("Brightness is valid");
        } else {
        System.out.println("Invalid brightness valid!");
        }

        //Nivå 2

        // Dimmerloop
        for (int b = 0; b <= 100; b += 20) {
        brightness = b;
        System.out.println("Brightness: " + brightness + "%");
        }

        // 2. Toggle
        isLightOn = !isLightOn;
        System.out.println("Lamp status after toggle: " + isLightOn);


        // 3. Felhantering
        brightness = 120; //
        if (brightness >= 0 && brightness <= 100) {
        System.out.println("Brightness is valid");
        } else {
        System.out.println("Error: " + brightness + "% is invalid!");
        }
    }
}