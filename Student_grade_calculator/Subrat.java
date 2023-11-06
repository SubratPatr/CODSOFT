import java.util.Scanner;

public class Subrat
{
    public static void main(String args[])
    {
    	
        int marks[] = new int[6];
        int i;
        float total=0, avg;
        Scanner sc = new Scanner(System.in);
        for(i=0; i<6; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = sc.nextInt();
           total = total + marks[i];
           System.out.println("the total mark of student is: "+ total);
        }
        avg = total/6;
        System.out.println("the average mark of student is: "+ avg);
        System.out.print("The student Grade is: ");
        if(avg>=80)
        {
            System.out.print("A");
        }
        else if(avg>=60 && avg<80)
        {
           System.out.print("B");
        } 
        else if(avg>=40 && avg<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}