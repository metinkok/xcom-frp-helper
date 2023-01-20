public class Drone extends Alien{
    String[] abilities = {"Airborne", "Reapir", "Overload"};

    Drone() {
        super("Drone", "images\\Drone.png", 3, 60, 0, 10, 12, 0, "1d4");
        super.abilities = abilities;
        super.width = 350; //images dimension of width as pixels
        super.height = 246; //images dimension of height as pixels
    }
}
