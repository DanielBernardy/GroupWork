import java.util.Scanner;
public class C7_1B {
    public static void main(String[]args)
    {
        //Creates scanner
        Scanner input = new Scanner(System.in);
        
        int max = 0;
        
        //takes input
        System.out.print("Enter the number of students: ");
        int studentNum  = input.nextInt();
        
        //initializes array
        int[] score = new int[studentNum];
        String[] grade = new String[studentNum];
        
        //takes input for array
        System.out.print("Enter " + studentNum +" scores: ");
        for(int i = 0;i < studentNum;i++)
        {
            //sets a value of score at i position
            score[i] = input.nextInt();
            
            //finds max
            if(i == 0)
            {
            max = score[i];
            }
            else if(score[i] > max)
            {
                max = score[i];
            }
            
        }
        //goes through each score
        for(int x = 0;x < studentNum; x++)
        {
            
            //determines grade
            if(score[x] >= (max - 10))
            {
                grade[x] = "A"; 
            }
            else if(score[x] >= (max - 20))
            {
                grade[x] = "B"; 
            }
            else if(score[x] >= (max - 30))
            {
                grade[x] = "C"; 
            }
            else if(score[x] >= (max - 40))
            {
                grade[x] = "D"; 
            }
            else 
            {
                grade[x] = "F";
            }
            
            //makes output
            System.out.println("Student " + x + " score is " + score[x] + " and grade is " + grade[x]);
        }
    }
}