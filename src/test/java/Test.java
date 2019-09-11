import org.junit.Assert;
import task11.Splitter;

import java.io.*;

public class Test {

    @org.junit.Test
    public void test() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));
        writer.write(
                    "  a   b  c\n" +
                        "   aa    b   c   \n" +
                            "cc  ss    h        has     "
        );
        writer.close();
        Splitter splitter = new Splitter("test.txt", "out.txt");
        splitter.split();
        BufferedReader reader = new BufferedReader(new FileReader("out.txt"));
        StringBuilder sb = new StringBuilder();
        String s = reader.readLine();
        while (s != null) {
            sb.append(s + "\n");
            s = reader.readLine();
        }
        reader.close();
        String shouldBe = "aaacc\nbbss\ncch\nhas\n";
        Assert.assertEquals(shouldBe, sb.toString());
    }

}
