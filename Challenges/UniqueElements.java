// Diogo Vidigal, 05/06/2015, CodeEval
/*
You are given a sorted list of numbers with duplicates. Print out the sorted list with duplicates removed.
*/

import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] number_Str = line.split(",");
            String finalNumb = number_Str[0] + ",";
            for (int i = 1; i < number_Str.length; i++) {
                if (!number_Str[i].equals(number_Str[i - 1])) {
                    finalNumb += number_Str[i] + ",";
                }
            }
            if (finalNumb.length() != 0) {
                finalNumb = finalNumb.substring(0, finalNumb.lastIndexOf(","));
            }
            System.out.println(finalNumb);
        }
    }
}
