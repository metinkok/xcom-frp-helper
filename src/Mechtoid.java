public class Mechtoid extends Alien{
    String[] abilities = {"Psi shield", "Plasma barrage"};
    int width;
    int height;

    Mechtoid() {
        super("Mechtoid", "images\\Mechtoid.webp", 20, 70, 0, 10, 14, 0);
        width = 350; //images dimension of width as pixels
        height = 188; //images dimension of height as pixels
    }
}
