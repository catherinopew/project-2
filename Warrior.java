import java.util.Random;

public class Warrior extends Enemy_Decorator {
    public Warrior ( Enemy e ){
        super(e, e.getName() + " Warrior", e.getMaxHP() + 2, e.getItem());
    }
    @Override
    public String attack( Entity e ){
        Random rand = new Random();
        int damage = rand.nextInt(7) + 4;
        e.takeDamage(damage);
        return getName() + " attacks " + e.getName() + " for " + damage + " damage.";
    }
}