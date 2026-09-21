
public class Main {
public static void main(String[] args) {
    // Lampa

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
            if (brightness >= 0 && brightness <= 100){

            System.out.println("Brightness is valid");
            } else {
            System.out.println("Invalid brightness valid!");
        }

    }
}