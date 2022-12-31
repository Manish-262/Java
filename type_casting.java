import java.util.*;
public class type_casting{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float a=25.12f;
        //without f it takes value as a double
        int b = (int) a;
        System.out.println(b);
        float i=56.5f;
        int j=(int) i;
        System.out.println(j);

    }
}