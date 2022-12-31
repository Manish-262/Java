public class hollow_rectangle{
    public static void hollow(int r, int c){
        //inner loop
        for(int i=1;i<=r;i++){
            //outer loop
            for(int j=1;j<=c;j++){
                //individual cell
                if(i==1||i==r||j==1||j==c){
                    System.out.print("*");
                }
                else{
                System.out.print(" ");}
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollow(4,5);
    }
}