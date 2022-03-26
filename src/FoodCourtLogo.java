import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date; 
public class FoodCourtLogo {
    public static void paste(){
        Date date = Calendar.getInstance().getTime();
        DateFormat timeView = new SimpleDateFormat("hh:mm:ss a");
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
        System.out.println(" Now Time: " + time  + "                                       Date: " + day);
        System.out.println("===========================================================================================");
    }
    
}
