package Factory;

public class GiftPaper {
    protected Toy gift;


    public void wrap(Toy toy) {
        gift = toy;
    }

    public Toy unwrap() {
        Toy gift = this.gift;
        this.gift = null;
        return gift;
    }
}
