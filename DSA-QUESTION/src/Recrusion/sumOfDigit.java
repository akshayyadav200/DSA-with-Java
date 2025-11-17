package Recrusion;

public class sumOfDigit {
    static int SumOfDigit(int num){
        if(num==0){
            return 0;
        }
        return SumOfDigit(num/10)+num%10;
        // int sum =SumOfDigit(num/10);
        // return sum+num%10;

    }
    // static void SumOfDigit(int num,int sum){
    //   if(num==0){
    //     System.out.println(sum);
    //     return;
    //   }
    //      int lastDigit=num%10;
    //      SumOfDigit(num/10,sum+lastDigit);
         
    // }
    public static void main(String[] args) {
        // SumOfDigit(123,0);

        int r= SumOfDigit(123);
        System.out.println(r);
    }
    
}
