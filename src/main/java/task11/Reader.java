package task11;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {

    private BufferedReader bufferedReader;
    private Scanner scanner;


    public Reader(String fileName) throws FileNotFoundException {
        if(fileName == null)
            scanner = new Scanner(System.in);
        else
            bufferedReader = new BufferedReader(new FileReader(fileName));
    }

    public ArrayList<String> read() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        if(bufferedReader != null) {
            String line = bufferedReader.readLine();
            while (line != null) {
                list.add(line);
                line = bufferedReader.readLine();
            }
        } else {
            String s = scanner.nextLine();
            while (!s.equals("end")) {
                list.add(s);
                s = scanner.nextLine();
            }
        }
        return list;
    }
    public void close() throws IOException {
        if(bufferedReader != null)
            bufferedReader.close();
        else
            scanner.close();
        scanner = null;
        bufferedReader = null;
    }
}
