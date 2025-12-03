import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;




public class Main {

    static void parse_line(String line) {

        int numOfWords = 1;
        for (int i = 0; i < line.length(); i++) {
            char space = ' ';
            if (line.charAt(i) == space) {
                numOfWords += 1;
            }
        }
        int i = 0;
        int j = 0;
        char space = ' ';
        String word = "";
        String[] words = new String[numOfWords];
        while (i < line.length()){
            if (!(line.charAt(i) == space)) {
                word = word + line.charAt(i);
            } else {
                words[j] = word;
                j += 1;
            }
        }

    }


    ArrayList<String> functions = new ArrayList<String>();

    public static void main(String[] args) {

        File file = new File("src/code.smsc");

        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (sc.hasNextLine()){
            String currentLine = sc.nextLine();
            if (!currentLine.equals("")){

                parse_line(currentLine);
            }

        }
    }
}