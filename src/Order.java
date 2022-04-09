import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    String name;
    int quantity;

    public Order(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public static void orderLoad(ArrayList<Order> f) throws IOException {
        File file = new File("lib//Order.txt");
        file.createNewFile();
        Scanner s = new Scanner(file);

        for(int i=0; s.hasNext(); i++){
            f.add(new Order(s.nextLine(),
                    Integer.parseInt(s.nextLine())));
        }
    }

    public static void orderSave(ArrayList<Order> f) throws IOException {
        FileWriter file = new FileWriter("lib//Order.txt");
        for (Order e : f) {
            String temp = e.name + "\n" + e.quantity + "\n";
            file.write(temp);
        }
        file.close();
    }
}
