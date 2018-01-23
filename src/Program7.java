import java.util.*;

public class Program7 {
    public static void main(String[]args)
    {
        //Creates scanner
        Scanner input = new Scanner(System.in);
    
        //takes input
        System.out.print("How many numbers will be read: ");
        int a = input.nextInt();
        int[] b = new int[a];
        
        System.out.print("\nEnter " + a + " elements: ");
        input(b,input);
        
        //determines and outputs the average
        System.out.println("\nThe average is " + avg(b));
        
        //displays the array
        System.out.print("\nThe contents of the array: ");
        display(b);
    }
    
    //inputs values for the array
    public static void input(int [] b, Scanner input)
    {
        for(int i = 0; i < b.length; i++)
        {
            b[i] = input.nextInt();
        }
        
    }
    
    //produces the avarage of an array
    public static double avg(int[] b)
    {
        double sum = 0;
        
        for(int i = 0;i < b.length;i++)
        {
            sum += b[i];
        }
        
        double avg = sum / b.length;
        return avg;
    }
    
    public static void display(int[] b)
    {
        System.out.println(Arrays.toString(b));
    }
}
