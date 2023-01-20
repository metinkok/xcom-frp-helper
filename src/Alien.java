public class Alien{
    String name;
    String image_url;
    String [] abilities;
    int hp;
    int aim;
    int critical_chance;
    int defence;
    int mobility;
    int will;
    String damage;

    int width;
    int height;

    public Alien(String name, String image_url, int hp, int aim, int critical_chance, int defence, int mobility, int will, String damage){
        this.name = name;
        this.image_url = image_url;
        this.hp = hp;
        this.aim = aim;
        this.critical_chance = critical_chance;
        this.defence = defence;
        this.mobility = mobility;
        this.will = will;
        this.damage = damage;
    }
}