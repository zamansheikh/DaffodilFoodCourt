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
		System.out.println("\t1. Add Employee");
		System.out.println("\t2. Remove Employee");
		System.out.println("\t3. Search Employee");
		System.out.println("\t4. Display Employee");
		System.out.println("\t5. Back");
		System.out.print("\tEnter your choice: ");
	}
}
