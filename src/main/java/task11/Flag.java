package task11;

public enum Flag {
    INPUT_FILE("-f"), OUTPUT_FILE("-o"), WORD_NUM("-a"),
    WORD_CUT("-t"), AT_SPACES("-r");

    private final String flag;

    Flag(String flag)
    {
        this.flag = flag;
    }

    public String getFlag() {
        return flag;
    }
}
