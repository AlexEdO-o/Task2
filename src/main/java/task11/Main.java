package task11;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Flagger flagger = new Flagger(args);
        Splitter split = new Splitter(flagger.getInputFile(), flagger.getOutputFiLe());
        split.setWordCut(flagger.getWordCut());
        split.setAtSpace(flagger.getAtSpace());
        split.setWordNum(flagger.getWordNum());
        split.split();
    }
}

