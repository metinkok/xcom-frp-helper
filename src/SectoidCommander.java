public class SectoidCommander extends Alien{
    String[] abilities = {"Greater mind merge", "Mindfray", "Mind control", "Psi panic"};

    SectoidCommander() {
        super("Sectoid Commander", "images\\Sectoid_commander.png", 10, 85, 0, 20, 12, 90, "1d4");
        super.abilities = abilities;
        super.width = 350; //images dimension of width as pixels
        super.height = 443; //images dimension of height as pixels
    }
}
