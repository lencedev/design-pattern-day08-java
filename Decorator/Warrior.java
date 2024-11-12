package Decorator;

public abstract class Warrior {
    protected int hp;
    protected int dmg;

    public Warrior(int hp, int dmg) {
        this.hp = hp;
        this.dmg = dmg;
    }

    public Warrior() {

    }

    public int getHp() {
        return hp;
    }

    public int getDmg() {
        return dmg;
    }
}
