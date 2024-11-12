package Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Factory {

    public Toy create(String toyName) throws NoSuchToyException {
        if (toyName.equals("teddy"))
            return new TeddyBear();
        if (toyName.equals("gameboy")) {
            return new Gameboy();
        }
        throw new NoSuchToyException("No such toy: " + toyName+".");
    }

    public List<GiftPaper> getPapers(int nb) {
        List<GiftPaper> al = Stream.generate(GiftPaper::new)
                .limit(nb)
                .collect(Collectors.toList());
        return al;
    }
}
