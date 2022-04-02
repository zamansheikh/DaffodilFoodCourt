import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        if(auth()){
            while(Menu.adminMenu());
        }
        else{
            while(Menu.userMenu());
        }
    }
    public static boolean auth(){
        Menu.logo();
        Scanner sc = new Scanner(System.in);
        System.out.print("\tEnter Username: ");
        String username = sc.nextLine();
        System.out.print("\tEnter Password: ");
        String password = sc.nextLine();
        if(username.equals("admin") && password.equals("admin")){
            System.out.println("\tWelcome Admin");
            System.out.println("\tpress any key to continue...");
            sc.nextLine();
            return true;
        }
        else{
            System.out.println("\tYou are logged as a user");
            System.out.println("\tpress any key to continue...");
            sc.nextLine();
            return false;
        }

    }
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
