public class Zombie extends Alien {
    int width;
    int height;

    Zombie() {
        super("Zombie", "images\\Zombie.png", 10, 0, 0, 0, 8, 120);
        width = 350; //images dimension of width as pixels
        height = 303; //images dimension of height as pixels
    }
}
