package Pattern;

public class Pattern3 {
    public static void main(String[] args) {
        int n=7;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if((row+n)/2>=col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
    
}
