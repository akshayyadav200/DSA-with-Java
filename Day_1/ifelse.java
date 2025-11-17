package Day_1;
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd number:");
        int b=sc.nextInt();
        System.out.println("Enter the 3rd number:");
        int c=sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a);
            }else{
                System.out.println(c);
            }

        }else{
            if(b>c){
            System.out.println(b);
            }else{
                System.out.println(c);
            }
          }
        }
    }

