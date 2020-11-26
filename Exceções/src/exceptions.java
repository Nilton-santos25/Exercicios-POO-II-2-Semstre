import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class exceptions {
    public static void main(String[] args) throws FileNotFoundException {

        FileReader file = new FileReader("C:\\teste\\test.txt");
        BufferedReader fileInput = new BufferedReader(file);

        for (int counter = 0; counter < 3; counter++) {
            try {
                System.out.println(fileInput.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
