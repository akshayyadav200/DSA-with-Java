package Recrusion;

public class countEvenOdd {
    static void CountEvenOdd(int range,int countOdd,int countEven){
        if(range==1){
            System.out.println(" Even count "+countEven+" Odd Count "+countOdd);
            return;
        }
        if(range%2==0){
          countEven++;
        }else{
           countOdd++;
        }
          CountEvenOdd(range-1,countEven,countOdd);
    }
    public static void main(String[] args) {
        CountEvenOdd(100, 0, 0);
    }
    
}
