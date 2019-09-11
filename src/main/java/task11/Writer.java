package task11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Writer {

    private BufferedWriter bufferedWriter;

    public Writer (String fileName) throws IOException {
        if (fileName != null)
            bufferedWriter = new BufferedWriter(new FileWriter(fileName));
    }

    public void write(ArrayList<StringBuilder> data) throws IOException {
        for (StringBuilder s : data) {
            if (bufferedWriter != null) {
                bufferedWriter.write(s.toString());
                bufferedWriter.newLine();
            } else {
                System.out.println(s);
            }
        }
    }
    public void close() throws IOException {
        if(bufferedWriter != null)
            bufferedWriter.close();
        bufferedWriter = null;
    }

}
