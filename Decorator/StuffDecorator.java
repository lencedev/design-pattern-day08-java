package Decorator;

public class StuffDecorator extends Warrior{
    protected Warrior holder;


    public StuffDecorator() {
    }

    @Override
    public int getHp() {
        return holder.hp;
    }

    @Override
    public int getDmg() {
        return holder.dmg;
    }
}
