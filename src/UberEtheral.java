public class UberEtheral extends Alien{
    String[] abilities = {"Mind control", "Mindfray", "Rift", "Psi lance", "Psi drain"};
    int width;
    int height;

    UberEtheral() {
        super("Uber Etheral", "images\\Uber_etheral.png", 25, 120, 0, 40, 12, 150);
        super.abilities = abilities;
        width = 350; //images dimension of width as pixels
        height = 197; //images dimension of height as pixels
    }
}
