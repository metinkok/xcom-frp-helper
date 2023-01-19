public class Muton extends Alien{
    String[] abilities = {"Intimidate", "Blood call", "Supression"};

    Muton(){
        super("Muton", "images\\Muton.png", 8, 70, 0, 10, 12, 10);
        super.abilities = abilities;
        super.width = 350; //images dimension of width as pixels
        super.height = 338; //images dimension of height as pixels
    }
}
