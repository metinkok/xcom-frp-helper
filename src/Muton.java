public class Muton extends Alien{
    String[] abilities = {"Intimidate", "Blood call", "Supression"};
    int width;
    int height;

    Muton(){
        super("Muton", "images\\Muton.webp", 8, 70, 0, 10, 12, 10);
        width = 350; //images dimension of width as pixels
        height = 338; //images dimension of height as pixels
    }
}
