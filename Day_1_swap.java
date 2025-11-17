public class Day_1_swap {
    public static void main(String[] args) {
        int num=15324;
        int position=0;
        int sum=0; //count==position

        position++;
        int lastDigit=num%10;
        sum=sum+position*(int)Math.pow(10, lastDigit-1);
       
    }
}
//num=72456
// swap last and first digit
