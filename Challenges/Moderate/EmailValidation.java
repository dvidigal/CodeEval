// Diogo Vidigal, 27/05/2015, CodeEval
/*
You are given several strings that may/may not be valid emails. You should write a regular
expression that determines if the email id is a valid email id or not. 
You may assume all characters are from the english language.
*/
import java.io.*;
import java.util.regex.Pattern;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String patternChar =
                "^[_A-Za-z0-9-\\.\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$|" +
                "^\"[_A-Za-z0-9-\\.\\+@]+(\\.[_A-Za-z0-9-]+)*\"@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
         
        Pattern pattern = Pattern.compile(patternChar);
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            System.out.println(pattern.matcher(line.matches());
        }
    }
}
