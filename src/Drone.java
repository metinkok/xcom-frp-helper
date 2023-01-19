public class Drone extends Alien{
    String[] abilities = {"Airborne", "Reapir", "Overload"};
    int width;
    int height;

    Drone() {
        super("Drone", "images\\Drone.png", 3, 60, 0, 10, 12, 0);
        super.abilities = abilities;
        width = 350; //images dimension of width as pixels
        height = 246; //images dimension of height as pixels
    }
}
