public class Thinman extends Alien{
    String[] abilities = {"Leap", "Poison spit", "Supression"};
    int width;
    int height;

    Thinman(){
        super("Thinman", "images\\Thinman.png", 3, 65, 0, 0, 15, 15);
        super.abilities = abilities;
        width = 350; //images dimension of width as pixels
        height = 263; //images dimension of height as pixels
    }
}
