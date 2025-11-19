package Recrusion.Pattern;

public class star {
    static void printStar(int numberOfStar){
       if(numberOfStar==0){
        return;
       }
       System.out.print("*");
       printStar(numberOfStar-1);
    }
    static void printLine(int numberOfRow){
      if(numberOfRow==0){
          return;
       }
       printLine(numberOfRow-1);
       printStar(numberOfRow);
       System.out.println();
    }
    public static void main(String[] args) {
        printLine(5);
    }
    
}
