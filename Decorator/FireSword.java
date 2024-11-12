package Decorator;
public class FireSword extends StuffDecorator {
    public FireSword(Warrior warrior) {
        holder = warrior;
        hp = getHp();
        dmg = getDmg();
        System.out.println("I can slice and burn like the wind and the flames.");
    }

    @Override
    public int getDmg() {
        return holder.dmg + 3;

    }
}
