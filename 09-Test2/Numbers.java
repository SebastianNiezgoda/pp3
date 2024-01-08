public class Numbers{
    int num1;
    int num2;
    int num3;
    int num4;
    int num5;
    boolean result;
    public Numbers(int num1,int num2,int num3,int num4,int num5){
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
        this.num4=num4;
        this.num5=num5;
    }

    public boolean different(){
        
        int[] array = {num1,num2,num3,num4,num5};
        for (int i=0;i<array.length;i++){
            for(int x=0;x<array.length;x++){
                if(x!=i){
                    if(array[i]==array[x]){
                        return false;
                    }
                    else{
                        this.result=true;
                    }
                }
            }
        }
        return result;



        
    }
}