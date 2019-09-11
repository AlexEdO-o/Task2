package task11;

import static task11.Flag.*;

public class Flagger {

    private String[] args;
    private String inputFile;
    private String outputFiLe;
    private Integer wordNum;
    private Boolean worldCut;
    private Boolean atSpace;

    public Flagger(String[] args) {
        this.args = args;
    }

    public void manageFlags() {
        for (int i = 0; i < args.length; i++) {
            if(args[i].equals(INPUT_FILE.getFlag())) {
                inputFile = args[i + 1];
            }
            if(args[i].equals(OUTPUT_FILE.getFlag())) {
                outputFiLe = args[i + 1];
            }
            if(args[i].equals(WORD_NUM.getFlag())) {
                wordNum = Integer.parseInt(args[i + 1]);
            }
            if(args[i].equals(WORD_CUT.getFlag())) {
                worldCut = true;
            }
            if(args[i].equals(AT_SPACES.getFlag())) {
                atSpace = true;
            }
        }
    }

    public String getInputFile() {
        return inputFile;
    }

    public String getOutputFiLe() {
        return outputFiLe;
    }

    public Integer getWordNum() {
        return wordNum;
    }

    public Boolean getWordCut() {
        return worldCut;
    }

    public Boolean getAtSpace() {
        return atSpace;
    }
}
