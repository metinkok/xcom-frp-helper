public class Chryssalid extends Alien{
    String[] abilities = {"Poisonous claws", "Leap", "Implant"};

    Chryssalid() {
        super("Chryssalid", "images\\Chryssalid.png", 8, 0, 0, 10, 20, 120, "1d4+3");
        super.abilities = abilities;
        super.width = 350; //images dimension of width as pixels
        super.height = 263; //images dimension of height as pixels
    }
}
