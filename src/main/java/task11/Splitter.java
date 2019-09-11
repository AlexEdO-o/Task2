package task11;

import java.io.IOException;
import java.util.ArrayList;

public class Splitter {

    private ArrayList<String> data;
    private String inputFile;
    private String outputFile;
    private Writer writer;
    private Reader reader;
    private Boolean wordCut = false;
    private Integer wordNum;
    private Boolean atSpace = false;

    public Splitter(String inputFile, String outputFile) throws IOException {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
        this.reader = new Reader(inputFile);
        this.data = reader.read();
        this.writer = new Writer(outputFile);
    }

    public void split() throws IOException {
        ArrayList<StringBuilder> list = new ArrayList<>();
        for (String s : data) {
            s = s.trim();
            String[] arr = s.split(" +");
            for (int i = 0; i < arr.length; i++) {
                if (list.size() > i)
                    list.get(i).append(arr[i]);
                else
                    list.add(new StringBuilder(arr[i]));
            }
        }
        if (wordCut) {
            StringBuilder s;
            for (int i = 0; i < list.size(); i++) {
                s = list.get(i);
                if (s.length() > wordNum)
                    list.set(i, new StringBuilder(s.substring(0, wordNum)));
            }
            StringBuilder sb;
            for (int i = 0; i < list.size(); i++) {
                sb = list.get(i);
                StringBuilder str = new StringBuilder();
                for (int j = sb.length(); j < wordNum; j++) {
                    if (!atSpace) {
                        sb.append(" ");
                    } else {
                        str.append(" ");
                    }
                }
                str.append(sb);
                list.set(i, str);
            }
        }
        writer.write(list);
        writer.close();
        reader.close();
    }


    public void setWordNum(Integer wordNum) {
        this.wordNum = wordNum;
    }

    public void setAtSpace(Boolean atSpace) {
        this.atSpace = atSpace;
    }

    public void setWordCut(Boolean wordCut) {
        this.wordCut = wordCut;
    }
}

