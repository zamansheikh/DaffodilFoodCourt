import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean repeat = true;
        Scanner sc = new Scanner(System.in);
        while(repeat){
            FoodCourtLogo.paste();
            Statistics.show();
            MainMenu.paste();
            int choice = -1;
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    MainMenu.control(1);
                    break;
                case 2:
                    MainMenu.control(2);
                    break;
                case 3:
                    MainMenu.control(3);
                    break;
                case 4:
                    MainMenu.control(4);
                    break;
                case 0:
                    repeat = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        }
        sc.close();

    }
}
