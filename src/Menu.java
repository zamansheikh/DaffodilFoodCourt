import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date; 

import java.util.*;

public class Menu {
    public static boolean adminMenu() throws IOException {
        
        logo();
        stats();
        System.out.println("Main Menu: ");
        System.out.println("\t1. Employee Management");
        System.out.println("\t2. Food Management");
        System.out.println("\t3. Check Orders");
//        System.out.println("\t4. Statistics");
        System.out.println("\t0. Exit");
        System.out.println("\tPlease enter your choice: ");
        System.out.print("\t$ ");
        Scanner sc = new Scanner(System.in);
        
        int c = sc.nextInt();
        sc.nextLine();
        if(c == 1){
            boolean eLoop = true;
            while(eLoop)
            {
                logo();
                Employee.employeeMenu();
                ArrayList<Employee> list = new ArrayList<Employee>();
                int choice = sc.nextInt();
                sc.nextLine();
                if(choice == 1){
                    System.out.print("\tEnter Employee Name\n\t$ ");
                    String name = sc.nextLine();
                    System.out.print("\tEnter Employee ID\n\t$ ");
                    String empId = sc.nextLine();
                    System.out.print("\tEnter Employee Salary\n\t$ ");
                    double salary = sc.nextDouble();
                    sc.nextLine();
                    try {
                        list = Main.loadObj();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    list.add(new Employee(name, empId, salary));
                    try {
                        Main.writeObj(list);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (choice == 2){
                    //remove employee
                    System.out.print("\tEnter Employee ID\n\t$ ");
                    String empId = sc.nextLine();
                    try {
                        list = Main.loadObj();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    for(int i = 0; i < list.size(); i++){
                        if(list.get(i).getEmpId().equals(empId)){
                            list.remove(i);
                            System.out.println("\tEmployee removed successfully");
                            break;
                        }
                        if(i==list.size()-1){
                            System.out.println("\tEmployee not found!");
                        }
                    }
                    try {
                        Main.writeObj(list);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("\tPress any key to continue...");
                    sc.nextLine();
                }
                if(choice == 3){
                    //Seach employee
                    System.out.print("\tEnter Employee ID\n\t$ ");
                    String empId = sc.nextLine();
                    try {
                        list = Main.loadObj();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    for(Employee e : list){
                        if(e.getEmpId().equals(empId)){
                            System.out.println(e);
                        }
                    }

                }
                if(choice == 4){
                    try {
                        list = Main.loadObj();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.printf("\t%-5s%-20s%-10s\n", "ID", "Name", "Salary");
                    for(Employee e: list){
                        System.out.printf("\t%-5s%-20s%-10s\n", e.getEmpId(), e.getName(), e.getSalary());
                    }
                    //wait for press enter
                    System.out.println("\tPress Enter to continue...");
                    sc.nextLine();
                }
                if(choice == 0){
                    //back
                    eLoop = false;
                }
            }

        } //feature 1
        else if (c == 2){
            int choice;
            ArrayList<Food> list = new ArrayList<>();
            Food.foodLoad(list);
            do {
                logo();
                Food.foodMenu();
                choice = sc.nextInt();
                sc.nextLine();
                if (choice == 1) {
                    System.out.print("\tEnter Food Name\n\t$ ");
                    String name = sc.nextLine();
                    System.out.print("\tEnter Food Price\n\t$ ");
                    double price = sc.nextDouble();
                    System.out.print("\tEnter Food Stock\n\t$ ");
                    int inStock = sc.nextInt();
                    list.add(new Food(name, price, inStock));
                } else if (choice == 2) {
                    System.out.print("\tEnter Food Name\n\t$ ");
                    String name = sc.nextLine();
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getName().equals(name)) {
                            list.remove(i);
                            System.out.println("\tFood removed successfully");
                            break;
                        }
                        if (i == list.size() - 1) {
                            System.out.println("\tFood not found!");
                        }
                    }
                    System.out.println("\tPress any key to continue...");
                    sc.nextLine();
                } else if (choice == 3) {
                    System.out.printf("\t%-15s%-10s%-10s\n", "Name", "Price", "Stock");
                    for (Food e : list) {
                        System.out.printf("\t%-15s%-10s%-10s\n", e.getName(), e.getPrice(), e.getInStock());
                    }
                    //wait for press enter
                    System.out.println("\tPress Enter to continue...");
                    sc.nextLine();
                }
                Food.foodSave(list);
            }while(choice!=0);
        } //feature 2
        else if (c == 3){
            ArrayList<Order> o = new ArrayList<>();
            Order.orderLoad(o);
            int i=1;
            logo();
            if(o.size()==0){
                System.out.println("\tNo Order has been Recorded!");
            }else {
                System.out.printf("\t%-7s%-15s%-7s\n", "Serial", "Name", "Quantity");
                for (Order e : o) {
                    System.out.printf("\t%-7s%-15s%-7s\n", i, e.name, e.quantity);
                    i++;
                }
                System.out.println();
            }
            System.out.println("\tPress Enter to continue...");
            sc.nextLine();
        }//feature 3
        else if (c == 0) return false;
        else {
            System.out.println("\tInvalid choice!");
            return true;
        }
        return true;
    }

    //user Menu static method is under maintenance
    public static boolean userMenu(ArrayList<Order> o) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Food> list = new ArrayList<>();
        Food.foodLoad(list);
        logo();
        stats();
        Order.orderSave(o);
        System.out.println("Main Menu: ");
        System.out.println("\t1. Take Order");
        System.out.println("\t2. View Orders");
        System.out.println("\t3. Remove Order");
        System.out.println("\t0. Exit");
        System.out.println("\tPlease enter your choice: ");
        System.out.print("\t$ ");
        int choice = sc.nextInt();
        sc.nextLine();

        if(choice==1){
            logo();
            System.out.println("Order Menu: ");
            System.out.printf("\t%-7s%-20s%-10s%-10s\n", "Serial", "Name", "Price", "Stock");
            int i=1;
            for(Food e: list){
                System.out.printf("\t%-7s%-20s%-10s%-10s\n", i++, e.getName(), e.getPrice(), e.getInStock());
            }
            System.out.println();
            System.out.print("\tEnter Order no: ");
            int order = sc.nextInt();
            System.out.print("\tEnter Quantity: ");
            int quan = sc.nextInt();
            if(order <= list.size()){
                o.add(new Order(list.get(order-1).getName(), quan));
                Order.orderSave(o);
            }else {
                System.out.println("\tInvalid Order!");
            }
        }else if(choice==2){
            logo();
            int i=1;
            if(o.size()==0){
                System.out.println("\tNo Order has been Recorded!");
            }else {
                System.out.println("Orders: ");
                System.out.printf("\t%-7s%-15s%-7s\n", "Serial", "Name", "Quantity");
                for (Order e : o) {
                    System.out.printf("\t%-7s%-15s%-7s\n", i, e.name, e.quantity);
                    i++;
                }
                System.out.println();
            }
            System.out.println("\tPress Enter to continue...");
//            Order.orderSave(o);
            sc.nextLine();
        }else if(choice==3){
            logo();
            System.out.println("Removing Order: ");
            int i=1;
            if(o.size()==0){
                System.out.println("\tNo Order has been Recorded!");
            }else {
                System.out.printf("\t%-7s%-15s%-7s\n", "Serial", "Name", "Quantity");
                for (Order e : o) {
                    System.out.printf("\t%-7s%-15s%-7s\n", i, e.name, e.quantity);
                    i++;
                }
                System.out.println();
                System.out.print("\tEnter the Order no: ");
                int del = sc.nextInt();
                if(del <= o.size()){
                    System.out.println("\tOrder no "+ del +" has been removed");
                    o.remove(del-1);
                }else{
                    System.out.println("\tWrong input");
                }
                System.out.println("\tPress Enter to continue...");
//                Order.orderSave(o);
                sc.nextLine();
            }
        }else if(choice==0){
            return false;
        }else{
            System.out.println("\tInvalid choice!");
            return true;
        }

        return true;
    }

    public static void logo(){
        Date date = Calendar.getInstance().getTime();
        DateFormat timeView = new SimpleDateFormat("hh:mm a");
        DateFormat dateView = new SimpleDateFormat("EEEE, dd MMMM yyyy");
        String day =  dateView.format(date);
        String time = timeView.format(date);  
        System.out.print("\033[H\033[2J");        
        System.out.println("    ___       __  __           _ _ _       ___               _   ___                 _   ");
        System.out.println("   /   \\__ _ / _|/ _| ___   __| (_) |     / __\\__   ___   __| | / __\\___  _   _ _ __| |_ ");
        System.out.println("  / /\\ / _` | |_| |_ / _ \\ / _` | | |    / _\\/ _ \\ / _ \\ / _` |/ /  / _ \\| | | | '__| __|");
        System.out.println(" / /_// (_| |  _|  _| (_) | (_| | | |   / / | (_) | (_) | (_| / /__| (_) | |_| | |  | |_ ");
        System.out.println("/___,' \\__,_|_| |_|  \\___/ \\__,_|_|_|___\\/   \\___/ \\___/ \\__,_\\____/\\___/ \\__,_|_|   \\__|");
        System.out.println("                                   |_____|                                               ");
        System.out.println("===========================================================================================");
        System.out.println(" Now Time: " + time  + "                                         Date: " + day);
        System.out.println("===========================================================================================");
    }

    public static void stats(){
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("|   Total Employe : "+ Statistics.eNumberCount() +"                                               Total Resturent: 03    |");
        System.out.println("|   Total Food    : 20                                              Total Food Item: 10    |");
        System.out.println("|   Total Order   : 20                                              Total Order Item: 10   |");
        System.out.println("|   Total Revenue : 20                                              Total Revenue: $20.00  |");
        System.out.println("-------------------------------------------------------------------------------------------");
    }
}
