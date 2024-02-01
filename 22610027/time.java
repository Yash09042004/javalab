import java.util.Scanner;

public class time {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        

        System.out.println("Enter the seconds :" );
        int seconds = sc.nextInt();
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int sec = seconds % 60;
        System.out.println("Hours: "+hours);
        System.out.println("minutes: "+minutes);
        System.out.println("seconds: "+sec);
        
        

    }
}
