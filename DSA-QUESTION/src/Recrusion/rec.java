//Stack call
//Stack fall
package Recrusion;

public class rec {
    static void show(int n){
        if(n==0){
            return;
        }
        System.out.println("Akshay "+n);
        //n--;  -->Not maintane state through method
        //show(n);
        show(n-1);
        System.out.println("Yadav "+n);

    }
    public static void main(String[] args) {
        show(5);
    }
}
