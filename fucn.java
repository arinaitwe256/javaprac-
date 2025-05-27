import java.util.Scanner;
class options
{
      String name;
      int studentno;
      String course;
      String semmester;
     Scanner sc=new Scanner(System.in);

    void input()
  {
   System.out.println("Enter student name:");
   name=sc.nextLine();
   System.out.println("Enter student number:");
   studentno=sc.nextInt();
   System.out.println("Enter course name:");
   course=sc.next();
   System.out.println("Enter semester:");
   semmester=sc.next();
  }

      void display()
       {
       System.out.println("The student name is \t:"+name+"\nThe student number is \t:"+studentno+"\nThe course name is\t:"+course+"\nThe semmester offered\t:"+semmester);
      
       } 


  public static void main( String args[] )
      {
     options my=new options();
     my.input();
      my.display();
       }

}