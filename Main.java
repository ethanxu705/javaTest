import com.google.common.io.Files;

import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = Files.newReader(new File("src/main/resources/test.yang"), Charset.forName("utf-8"));
        String line;
        Stack<String> keyStack = new Stack<String>();
        Stack<String> valueStack = new Stack<String>();
        StringBuilder sb = new StringBuilder();
        boolean isKey = true;
        boolean inQuote = false;
        while ((line = br.readLine()) != null) {
            line = line.replaceAll("[{]", " { ").replaceAll("}", " } ");
            String[] words = line.split("\\s");
            for (String word : words) {
                if (inQuote) {
                    
                }
                if (word.equals("{")) {
                    keyStack.push("{");
                    valueStack.push("}");
                    continue;
                } else if (word.equals("}")) {

                }
                if (!word.contains("\"")) {
                    if (isKey) {
                        keyStack.push(word);
                    } else {
                        valueStack.push(word);
                    }
                    isKey = !isKey;
                } else {
                    if (inQuote) {

                    } else {

                    }
                }
            }

        }
        System.out.println("Hello World!");

    }
}
