import java.util.Scanner;

public class Day_2_RoatateNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int num= scanner.nextInt();
        System.out.println("Enter the Number rotation");
        int rotation=scanner.nextInt();

        int copy =num;
        //Step-1 Count the digit
        int count =0;
        

        while(num>0){
            num = num/10; //Make number small
            count++;
        }

        rotation=rotation%count; //within range
        num =copy;
        int RightPart = num% (int)Math.pow(10, rotation);
        int leftPart = num /(int)Math.pow(10, rotation);

        // System.out.println(RightPart+" "+leftPart);

        int result =RightPart*(int)Math.pow(10,count-rotation)+leftPart;
        System.out.println(result);
        scanner.close();
    }
    
}
