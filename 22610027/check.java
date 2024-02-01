import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        int[] array = new int[10];  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");  
    for(int i=0; i<10; i++)  
    {  
     
        array[i]=sc.nextInt();  
    }
        System.out.println(checking(array));
    }

    public static boolean checking(int[] array) {
        int flag = 0;
        for (int number : array) {
            if (number == 10) {
               flag =1;
                break;
            }
        }
        if(flag == 1){
            return true;
        }else{
            return false;
        }
    }
}