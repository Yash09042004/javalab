import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        
        System.out.println("Enter the number you want factorial of: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long fact = 1;
        for(int i=n;i>0;i--){
            fact*=i;
        }

        System.out.println("Factorial of "+n+" is"+": "+ fact);

    }
}
