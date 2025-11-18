package Recrusion.Array;

public class GST {
    static int[] getPricesWithGST(int price[],int index){
        //base case
        if(index==price.length){
            //Price array end
           int gst[] =new int[price.length];// fill with 0
           return gst;
        }
        // GST +18%
        int gst[]=getPricesWithGST(price, index+1);
        gst[index]=price[index]+(int)(price[index]*0.18);
        return gst;
    }
    public static void main(String[] args) {
        int price[]={100,200,430,999,7777};
        int newPrice[]= getPricesWithGST(price, 0);
        for(int p :newPrice){
            System.out.println(p);
        }
    }
    
}
