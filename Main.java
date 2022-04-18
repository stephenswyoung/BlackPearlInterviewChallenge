/*
Stephen Young
4/5/2022
Black Pearl Software Engineering Intern Interview Challenge
 */
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //Creates BufferedReaders
        BufferedReader inputReader = new BufferedReader(new FileReader("\\Users\\ssy30\\IdeaProjects\\Interview Challenge Black Pearl\\src\\input.txt"));
        BufferedReader compareReader = new BufferedReader(new FileReader("\\Users\\ssy30\\IdeaProjects\\Interview Challenge Black Pearl\\src\\compare.txt"));

        //Assigns first line of both txt files to temp Strings, and marks the inputReader
        String temp1 = inputReader.readLine();
        String temp2 = compareReader.readLine();
        inputReader.mark(1000);

        //Cycles through both txt files, and resets to the top of the input.txt after all of input has been compared to current compare.txt line
        while(temp2!=null) {
            while(temp1!=null){
                if (temp1.contains(temp2)) {
                    System.out.println(temp1);
                }
                temp1= inputReader.readLine();
            }
            temp2 = compareReader.readLine();
            inputReader.reset();
            temp1= inputReader.readLine();
        }


        inputReader.close();
        compareReader.close();
    }
}
