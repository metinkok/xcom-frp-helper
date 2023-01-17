public class Berserker extends Alien{
    String[] abilities = {"Intimidate", "Bull rush", "Bloodlust"};
    int width;
    int height;

    Berserker() {
        super("Berserker", "images\\Berserker.png", 20, 60, 0, 20, 17, 80);
        width = 350; //images dimension of width as pixels
        height = 263; //images dimension of height as pixels
    }
}
