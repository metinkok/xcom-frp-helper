public class Etheral extends Alien{
    String[] abilities = {"Mindfray", "Mind merge", "Psi lance", "Rift", "Psi drain"};
    int width;
    int height;

    Etheral() {
        super("Etheral", "images\\Etheral.png", 20, 100, 0, 40, 12, 120);
        super.abilities = abilities;
        width = 350; //images dimension of width as pixels
        height = 253; //images dimension of height as pixels
    }
}
