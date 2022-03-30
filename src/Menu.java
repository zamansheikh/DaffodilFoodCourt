import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date; 

import java.util.*;

public class Menu {
    public static boolean mainMenu(){
        
        logo();
        stats();
        System.out.println("Main Menu: ");
        System.out.println("\t1. Employee");
        System.out.println("\t2. Food");
        System.out.println("\t3. Order");
        System.out.println("\t4. Statistics");
        System.out.println("\t0. Exit");
        System.out.println("\tPlease enter your choice: ");
        System.out.print("\t$ ");
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        int c = sc.nextInt();
        if(c == 1){
            boolean eLoop = true;
            while(eLoop)
            {
                Employee.employeeMenu();
                ArrayList<Employee> list = new ArrayList<Employee>();
                int choice = sc.nextInt();
                
                if(choice == 1){
                    System.out.print("\tEnter Employee Name\n\t$ ");
                    String name = sc1.nextLine();
                    System.out.print("\tEnter Employee ID\n\t$ ");
                    String empId = sc1.nextLine();
                    System.out.print("\tEnter Employee Salary\n\t$ ");
                    double salary = sc1.nextDouble();
                    sc.nextLine();
                    try {
                        list = ESaveLoad.loadObj();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    list.add(new Employee(name, empId, salary));
                    try {
                        ESaveLoad.writeObj(list);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (choice == 2){
                    //remove employee
                    System.out.print("\tEnter Employee ID\n\t$ ");
                    String empId = sc1.nextLine();
                    try {
                        list = ESaveLoad.loadObj();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    for(int i = 0; i < list.size(); i++){
                        if(list.get(i).getEmpId().equals(empId)){
                            list.remove(i);
                            System.out.println("\tEmployee removed successfully");
                        }
                        else{
                            System.out.println("\tEmployee not found");
                        }
                    }
                    try {
                        ESaveLoad.writeObj(list);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("\tPress any key to continue...");
                    sc1.nextLine();
                }
                if(choice == 3){
                    //Seach employee
                    System.out.print("\tEnter Employee ID\n\t$ ");
                    String empId = sc1.nextLine();
                    try {
                        list = ESaveLoad.loadObj();
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
                        list = ESaveLoad.loadObj();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    for(Employee e: list){
                        //System.out.println(e);
                        System.out.println("\tEnployee Name: " + e.getName());
                        System.out.println("\tEmployee ID: " + e.getEmpId());
                        System.out.println("\tEmployee Salary: " + e.getSalary());
                    }
                    //wait for press enter
                    System.out.println("\tPress Enter to continue...");
                    sc1.nextLine();
                }
                if(choice == 5){
                    //back
                    eLoop = false;
                }
            }

        } //feature 1
        else if (c == 2); //feature 2
        else if (c == 3);//feature 3
        else if (c == 4);
        else if (c == 0) return false;
        else {
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
        System.out.println("|   Total Employe : 20                                              Total Resturent: 03    |");
        System.out.println("|   Total Food    : 20                                              Total Food Item: 10    |");
        System.out.println("|   Total Order   : 20                                              Total Order Item: 10   |");
        System.out.println("|   Total Revenue : 20                                              Total Revenue: $20.00  |");
        System.out.println("-------------------------------------------------------------------------------------------");
    }
}
