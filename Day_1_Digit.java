class Day_1_Digit {
    public static void main(String[] args) {
        int num=12345;
        int copy =num;
        int count =0;
        // Count the digit
        while (num>0){
            num=num/10;
            count++;
        }
        int pow =(int)Math.pow(10, count-1);
        num=copy;
        while(num>0){
            int FirstDigit=num/pow;
            System.out.println(FirstDigit);
            num=num%pow;
            
        }

        
    }
}
