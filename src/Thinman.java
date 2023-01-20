public class Thinman extends Alien{
    String[] abilities = {"Leap", "Poison spit", "Supression"};

    Thinman(){
        super("Thinman", "images\\Thinman.png", 3, 65, 0, 0, 15, 15, "1d4");
        super.abilities = abilities;
        super.width = 350; //images dimension of width as pixels
        super.height = 263; //images dimension of height as pixels
    }
}
