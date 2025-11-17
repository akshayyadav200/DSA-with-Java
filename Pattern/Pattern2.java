package Pattern;

public class Pattern2 {
    public static void main(String[] args) {
        int n=4;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=4;col++){
                if(row>=col){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for(int rows=1;rows<=n;rows++){
            for(int col=1;col<4;col++){
                if(rows<=col){
                    System.out.print("*");
            
                }
            }
            System.out.println();
        }

    }
}
