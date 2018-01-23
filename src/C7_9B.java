import java.util.Scanner;
public class C7_9B 
{
    public static void main(String[]args)
    {
        //Creates scanner
        Scanner input = new Scanner(System.in);
        
        double[] num = new double[10];
        
        //takes input for array
        System.out.print("Enter ten numbers: ");
        for(int i = 0;i < 10;i++)
        {
            //sets a value of score at i position
            num[i] = input.nextDouble();
        }
        min(num);
    }
    public static void min(double[] array)
    {
        double min = 0;
        for(int x = 0;x < 10;x++)
        {
            if(x == 0)
            {
            min = array[x];
            }
            else if(array[x] < min)
            {
                min = array[x];
            }
        }
        System.out.println("The minimum number is: " + min);
    }
}
