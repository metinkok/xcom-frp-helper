public class SectoidCommander extends Alien{
    String[] abilities = {"Greater mind merge", "Mindfray", "Mind control", "Psi panic"};
    int width;
    int height;

    SectoidCommander() {
        super("Sectoid Commander", "images\\Sectoid_commander.webp", 10, 85, 0, 20, 12, 90);
        width = 350; //images dimension of width as pixels
        height = 443; //images dimension of height as pixels
    }
}
