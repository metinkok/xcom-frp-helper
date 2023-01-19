public class Berserker extends Alien{
    String[] abilities = {"Intimidate", "Bull rush", "Bloodlust"};

    Berserker() {
        super("Berserker", "images\\Berserker.png", 20, 60, 0, 20, 17, 80);
        super.abilities = abilities;
        super.width = 350; //images dimension of width as pixels
        super.height = 263; //images dimension of height as pixels
    }
}
