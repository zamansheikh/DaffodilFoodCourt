import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean repeat = true;
        while(repeat){
            FoodCourtLogo.paste();
            Statistics.show();
            MainMenu.paste();
            int choice = 0;
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    //feature 1
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
                case 5:
                    repeat = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        }

    }
}
