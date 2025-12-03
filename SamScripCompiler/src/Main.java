import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;




public class Main {

    static void parse_line(String line){
        
    }

    static String[] line_to_words(String line){
        int numOfWords = 1;
        for(int i = 0; i < line.length(); i ++){
            char space = ' ';
            if (line.charAt(i) == space ){
                numOfWords += 1;
            }
        }

        String[] words = new String[3];

        return words;
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