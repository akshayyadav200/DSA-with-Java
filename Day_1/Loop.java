package Day_1;
class Loop {
    public static void main(String[] args) {
    //    int num =17;
    //    int factor =0;
    //    for(int i=0;i<=num;i++){
    //     if (num%2==0){
    //         factor++;
    //     }
    //    } 
    //    if(factor==2){
    //     System.out.println("Prime number");
    //    }else{
    //     System.out.println("Not");
    //    }

    //leadcode count prime 204

    int num=17;
    for(int i=2;i*i<=num;i++){
        if(num%2==0){
            System.out.println("Prime");
            return;
        }
    }System.out.println("not");
    }
}
