package Composite;

import java.util.ArrayList;
import java.util.List;

public class SentenceComposite implements Sentence
{
    List<Sentence> childSentence = new ArrayList<>();

    public SentenceComposite() {
    }

    @Override
    public void print() {
        childSentence.stream().forEach(Sentence::print);
    }

    public void add(Sentence sentence) {
        childSentence.add(sentence);
    }

    public void remove(Sentence sentence) {
        childSentence.remove(sentence);
    }
}
