import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Food {
    private String name;
    private double price;
    private int inStock;
    private int sold;

    public Food(String name, double price, int inStock) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.sold = 0;
    }
    

    public static void foodMenu(){
		System.out.println("Employee Menu: ");
		System.out.println("\t1. Add Food");
		System.out.println("\t2. Remove Food");
		System.out.println("\t3. Display Food");
		System.out.println("\t0. Back");
		System.out.print("\tEnter your choice: ");
	}

    public static void foodLoad(ArrayList<Food> f) throws IOException {
        File file = new File("lib//Food.txt");
        file.createNewFile();
        Scanner s = new Scanner(file);

        for(int i=0; s.hasNext(); i++){
            f.add(new Food(s.nextLine(),
                    Double.parseDouble(s.nextLine()),
                    Integer.parseInt(s.nextLine())));
        }
    }

    public static void foodSave(ArrayList<Food> f) throws IOException {
        FileWriter file = new FileWriter("lib//Food.txt");
        for (Food e : f) {
            String temp = e.getName() + "\n" + e.getPrice() + "\n" + e.getInStock() + "\n";
            file.write(temp);
        }
        file.close();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }
}
