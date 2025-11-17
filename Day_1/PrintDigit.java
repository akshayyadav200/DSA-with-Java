package Day_1;
public class PrintDigit {
    public static void main(String[] args) {
       int num=34231;
       int copy=num;
       int count =0;
       while(num>0){
       num=num/10; 
       count++;
       }
       int pow = (int) Math.pow(10, count - 1);
       num = copy;
       while(num>0){
       int FirstDigit=num/pow;
       System.out.println(FirstDigit);
       num = num%pow;
       pow =pow/10;
       }
    }
    
}
