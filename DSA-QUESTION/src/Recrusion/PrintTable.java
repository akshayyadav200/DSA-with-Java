package Recrusion;

public class PrintTable {
    static void printtable(int num,int range,String result){
        if(range==0){
            System.out.println(result);
            return;
        }
    
        
    }
    static void printtable(int num,int range){
        if(range==0){
            return;
        }
        printtable(num, range-1);
        System.out.println(num+"X"+range+"="+(num*range));
    }
    public static void main(String[] args) {
        printtable(5, 10);
    }
    
}
