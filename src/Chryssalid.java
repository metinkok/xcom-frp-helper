public class Chryssalid extends Alien{
    String[] abilities = {"Poisonous claws", "Leap", "Implant"};
    int width;
    int height;

    Chryssalid() {
        super("Chryssalid", "images\\Chryssalid.png", 8, 0, 0, 10, 20, 120);
        super.abilities = abilities;
        width = 350; //images dimension of width as pixels
        height = 263; //images dimension of height as pixels
    }
}
