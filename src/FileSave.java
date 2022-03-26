import java.io.*;
import java.util.ArrayList;
//import java.util.*;
public class FileSave {
    public static void write(String fileName, String content) {
        try {
            FileWriter fw = new FileWriter(fileName);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(content);
            fw.close();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeA(String fileName, String content) {
        try {
            FileWriter fw = new FileWriter(fileName, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(content);
            fw.close();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String read(String fileName, ArrayList<String> lines) {
        String content = "";
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                lines.add(line);
                content += line + "\n";
            }
            fr.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
        
    }
    
}
