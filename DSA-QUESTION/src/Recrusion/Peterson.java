package Recrusion;

public class Peterson {
    // static int peterson(int num,int org){

    // }
    static void peterson(int num , int sum,int org){
        if(num==0){
            System.out.println(org==sum ? "Peterson":"not Peterson");
            return;
        }
        peterson(num, sum, org);
    }
    public static void main(String[] args) {
        // int org =145;
        // int r =peterson(org, org);
        // System.out.println(org==r ?"Peterson Number":" Not Peterson number");
        peterson(145, 0, 145);
        
    }
    
}
