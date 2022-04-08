public class Food {
    final int MaxCapacity = 10;
    private String name;
    private double price;
    private int inStock;
    private int sold;

    public Food(String name, double price) {
        this.name = name;
        this.price = price;
        this.inStock = 
        this.sold = sold;
    }
    

    public static void foodMenu(){
		System.out.println("Employee Menu: ");
		System.out.println("\t1. Add Food");
		System.out.println("\t2. Remove Food");
		System.out.println("\t3. Search Food");
		System.out.println("\t4. Display Food");
		System.out.println("\t5. Back");
		System.out.print("\tEnter your choice: ");
	}
}
