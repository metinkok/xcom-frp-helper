public class Zombie extends Alien {
    String[] abilities = {"Metamorph"};

    Zombie() {
        super("Zombie", "images\\Zombie.png", 10, 0, 0, 0, 8, 120);
        super.abilities = abilities;
        super.width = 350; //images dimension of width as pixels
        super.height = 303; //images dimension of height as pixels
    }
}
