public class SectoidCommander extends Alien{
    String[] abilities = {"Greater mind merge", "Mindfray", "Mind control", "Psi panic"};
    int width;
    int height;

    SectoidCommander() {
        super("Sectoid Commander", "images\\Sectoid_commander.png", 10, 85, 0, 20, 12, 90);
        super.abilities = abilities;
        width = 350; //images dimension of width as pixels
        height = 443; //images dimension of height as pixels
    }
}
