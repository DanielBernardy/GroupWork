import java.util.Scanner;
public class C7_26B 
{
     public static void main(String[]args)
     {
        //Creates scanner
        Scanner input = new Scanner(System.in);
       
        int l1LenDet, l2LenDet;
        
        //takes input for array
        System.out.print("Enter list1: ");
        l1LenDet = input.nextInt();
        
        int[] l1 = new int[l1LenDet];
        
        for(int i = 0;i < l1LenDet;i++)
        {
            //sets a value of score at i position
            l1[i] = input.nextInt();
        }
        
        //takes input for array
        System.out.print("Enter list2: ");
        l2LenDet = input.nextInt();
        
        int[] l2 = new int[l2LenDet];
        
        for(int j = 0;j < l2LenDet;j++)
        {
            //sets a value of score at i position
            l2[j] = input.nextInt();
        }
        
        //test for arrays being inputed properly
        /**for(int k = 0; k < l1.length;k++)
        {
        System.out.print(l1[k] + " ");
        }
        System.out.println(" ");
        for(int l = 0; l < l1.length;l++)
        {
        System.out.print(l2[l] + " ");
        }*/
        
        //System.out.println(equals(l1,l2));
        
        if(equals(l1,l2))
        {
            System.out.println("Two lists are strictly identicle");
        }
        else
            System.out.println("Two lists are not strictly identicle");
        
        
     }
     
     public static boolean equals(int[] list1, int[] list2)
     {
        
        if(list1.length != list2.length)
        {
            return false;
        }
            
        for(int m = 0;m < list1.length;m++)
        {
            if(list1[m] != list2[m])
            {
                return false;
            }
        }
        return true;
        
     }
}
