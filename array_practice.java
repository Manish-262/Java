import java.util.*;
public class array_practice{
    public static void arrays(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]+=1;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks[]={98,98};
        arrays(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}