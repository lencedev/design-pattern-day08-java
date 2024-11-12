package Factory;

public class TestMain {
    public static void main(String[] args) {
        Toy teddy = new TeddyBear();
        Factory factory = new Factory();
        Elf elf = new Elf(factory);
        elf.pickPapers(2);
        elf.pickToy(teddy.title);
        elf.pack();
        elf.pickToy("name");
    }
}