public class Mechtoid extends Alien{
    String[] abilities = {"Psi shield", "Plasma barrage"};

    Mechtoid() {
        super("Mechtoid", "images\\Mechtoid.png", 20, 70, 0, 10, 14, 0);
        super.abilities = abilities;
        super.width = 350; //images dimension of width as pixels
        super.height = 188; //images dimension of height as pixels
    }
}
