import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    ArrayList<ArrayList<String>> Command_groups = new ArrayList<ArrayList<String>>();

    /***
     *
     * finds the length of the line and chops it up into a String[]
     *
     * @param line one line of code to be chopped up into an array
     * @return String[] of chopped up line
     */
    static String[] parse_line(String line) {

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
        while (i < line.length()) {
            if (!(line.charAt(i) == space)) {
                word = word + line.charAt(i);
            } else {

                words[j] = word;
                j ++;
                word = "";
            }
            i += 1;
        }
        return(words);
    }

    /***
     * reads the file then chops its up into and array List
     * @return ArrayList of String[]s that contain the line info
     */
    static ArrayList<String[]> get_file() {

        File file = new File("src/code.smsc");

        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        ArrayList<String[]> parsed_Lines = new ArrayList<String[]>();

        while (sc.hasNextLine()){
            String currentLine = sc.nextLine();
            if (!currentLine.equals("")){
                parsed_Lines.add(parse_line(currentLine));
            }

        }
        return(parsed_Lines);
    }


    public static void main(String[] args){

        System.out.println("compiling...");
        ArrayList<String[]> file = get_file();

        for (int i = 0; i < file.size(); i++){
            String[] line = file.get(i);
            boolean indented = false;

            for (int j = 0; j < line.length; j++){
                String word = line[j];

                if (word.equals(" ")){ // if Starts with indentation
                    indented = true;
                    continue;
                }
                switch(word){
                    case "Command_group":


                }

            }
        }
    }
}