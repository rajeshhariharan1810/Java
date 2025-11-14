import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class W1Act1
{
    static void main() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("W1Act1.txt"));
        String line;
        Map<String, Integer> wordCount = new HashMap<>();

        while ((line = br.readLine()) != null) {
            line.strip();
            wordCount.put(line, wordCount.getOrDefault(line, 0) + 1);
        }
        br.close();

        System.out.println(wordCount);
    }
}
