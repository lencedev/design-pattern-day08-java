package Decorator;

public class Shield extends StuffDecorator{
    public Shield(Warrior warrior) {
        this.holder = warrior;
        hp = getHp();
        dmg = getDmg();
        System.out.println("May this shield protect me against every enemy.");
    }

    @Override
    public int getHp() {
        return holder.hp + 10;
    }
}
