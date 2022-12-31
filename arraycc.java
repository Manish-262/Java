import java.util.*;
public class arraycc{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[100];
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println("Physics = " + marks[0] + " Chemistry = " + marks[1] + " Maths = " + marks[2]);
        int percentage=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage = " + percentage + "%" );
        System.out.println("Length of array = " +marks.length);
       // marks[2]=marks[2]+1;
        //System.out.println("Maths = " + marks[2]);
    }
} 