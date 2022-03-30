import java.io.*;
import java.util.*;

public class ESaveLoad {
    public static void writeObj(ArrayList<Employee> list) throws Exception{
        File file = new File("lib\\Employee.txt");
        ObjectOutputStream oos = null;
        oos = new ObjectOutputStream( new FileOutputStream(file));
        oos.writeObject(list);
        oos.close();

    }
    public static void writeObjA(ArrayList<Employee> list) throws Exception{
        File file = new File("lib\\Employee.txt");
        ObjectOutputStream oos = null;
        oos = new ObjectOutputStream( new FileOutputStream(file, true));
        oos.writeObject(list);
        oos.close();

    }
    public static ArrayList<Employee> loadObj(){
        try {
            File file = new File("lib\\Employee.txt");
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Employee> list = (ArrayList<Employee>) ois.readObject();
            ois.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
        
    }


    
}
