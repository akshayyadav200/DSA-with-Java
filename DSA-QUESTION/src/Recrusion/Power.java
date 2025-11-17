package Recrusion;

public class Power {
    static void power(int num,int pow,int result){
        if(pow==0){
            System.out.println(result);
          return;
        }
       power(num, pow-1, result*num); 
    }
    public static void main(String[] args) {
        power(2, 5, 1);
    }
    
}
