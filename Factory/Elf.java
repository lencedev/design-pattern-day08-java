package Factory;

import java.util.ArrayList;
import java.util.List;

public class Elf {
    protected Toy toy;
    protected List<GiftPaper> papers;
    protected Factory factory;
    protected boolean hasToyPicked = false;

    public Elf(Factory factory) {
        this.factory = factory;
        papers = new ArrayList<GiftPaper>();
    }

    public boolean pickToy(String toyName) {
        if (!hasToyPicked) {
            try {
                toy = factory.create(toyName);
            } catch (NoSuchToyException e) {
                System.out.println("I didn't find any " + toyName+".");
                return false;
            }
            System.out.println("What a nice one! I would have liked to keep it...");
            hasToyPicked = true;
            return true;
        }
        System.out.println("Minute please?! I'm not that fast.");
        return false;
    }

    public boolean pickPapers(int nb) {
        papers.addAll(factory.getPapers(nb));
        return true;
    }

    public GiftPaper pack() {
        if(papers.isEmpty()) {
            System.out. println("Wait... I can't pack it with my shirt.");
            return null;
        }
        GiftPaper giftPaper = papers.get(0);
        papers.remove(0);
        giftPaper.wrap(toy);
        toy = null;
        System.out.println((giftPaper.gift == null) ? "I don't have any toy, but hey at least it's paper!" : "And another kid will be happy!" );
        hasToyPicked = false;
        return giftPaper;
    }
}
