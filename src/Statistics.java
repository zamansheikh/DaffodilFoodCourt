import java.util.ArrayList;

public class Statistics {
    public static int eNumberCount(){
        ArrayList<Employee> estats = new ArrayList<Employee>();
        estats = Main.loadObj();
        int eNumberCount = estats.size();
        return eNumberCount;

    }
    
}
