import java.util.Scanner;

import java.util.*;
public class MainMenu {
    FileSave f = new FileSave();
    String fileName = "lib\\Employee.txt";
    public static void paste(){
        System.out.println("Main Menu: ");
        System.out.println("\t1. Employee");
        System.out.println("\t2. Food");
        System.out.println("\t3. Order");
        System.out.println("\t4. Statistics");
        System.out.println("\t0. Exit");
        System.out.println("\tPlease enter your choice: ");
        System.out.print("\t$ ");
    }
    public static void control(int choice){
        Scanner sc = new Scanner(System.in);
        switch(choice){
            case 1:
                Boolean repeat = true;
                while(repeat){
                    FoodCourtLogo.paste();
                    System.out.println("You choose Employee Management");
                    System.out.println("-----------------------------------------");
                    
                    System.out.println("You have following options: \n");
                    System.out.println("\t1. Insert New Employee");
                    System.out.println("\t2. Remove Existing Employee");
                    System.out.println("\t3. Show All Employees");
                    System.out.println("\t4. Search an Employee");
                    System.out.println("\t5. Go Back");
                    System.out.println("\tPlease enter your choice: ");
                    System.out.print("\t$ ");
                    ArrayList<Employee> e = new ArrayList<Employee>();
                    int choice1 = sc.nextInt();
                    switch(choice1){
                        case 1:
                            if(true){
                                System.out.println("\tEmployee Inserted Successfully");
                                System.out.println("\tPress Enter to continue...");
                                sc.nextLine();
                                sc.nextLine();
                            }
                            else{
                                System.out.println("\tEmployee Insertion Failed");
                            }
                            break;
                        case 2:
                            //e.remove();
                            break;
                        case 3:
                            //e.show();
                            break;
                        case 4:
                            //e.search();
                            break;
                        case 5:
                            repeat = false;
                            break;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }
                }

                break;
            case 2:
                //feature 2
                break;
            case 3:
                //feature 3
                break;
            case 4:
                //feature 4
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        //sc.close();
    }
    
}
