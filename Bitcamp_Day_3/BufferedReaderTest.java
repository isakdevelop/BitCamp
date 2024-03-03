import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("값을 입력하세요:");
        String value = reader.readLine();
        System.out.println("입력한 값: " + value);
        reader.close();
    }
}
