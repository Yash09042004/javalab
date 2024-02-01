// import java.util.Scanner;  

// class Student{


//     // Student()
//   public static void main(String[] args) {
//     Scanner myObj = new Scanner(System.in);  
//     System.out.println("Enter Student name, PRN, Email: ");


//     String userName = myObj.nextLine(); 
//     String userEmail = myObj.nextLine();
//     int userPRN = myObj.nextInt();


//     System.out.println("Student name is: " + userName); 
//     System.out.println("Student email is: "+userEmail);
//     System.out.println("Student PRN is: "+userPRN);
//   }
// }
import java.util.Scanner;  

class Student{

  private String name;
  private int prn;
  private String email;


  public Student(){

  }
  public Student(String n, int p, String e) {
         name = n;
         prn = p;
         email = e;
  }
  public Student(Student s){
    this.name = s.name;
    this.prn = s.prn;
    this.email = s.email;
  }

  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
    System.out.println("Enter Student name, PRN, Email: ");

    String userName = sc.nextLine(); 
    int userPRN = sc.nextInt();
    sc.nextLine(); 
    String userEmail = sc.nextLine();

    
    Student student = new Student(userName, userPRN, userEmail);
    Student student2 = student;
    System.out.println("\nStudent details are as follows:\n");

    System.out.println("Student name is: " + student.name); 
    System.out.println("Student PRN is: "+student.prn);
    System.out.println("Student email is: "+student.email);

    System.out.println("The copied name: "+student2.name);
    
  }


}