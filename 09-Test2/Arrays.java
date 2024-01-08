public class Arrays{

    static boolean arr(int[]a , int[] b){
        boolean result=true;
        int counta = 0;
        int countb = 0;
        for (int i=0;i<a.length;i++){
            if (a[i]>=10 & a[i]<=99){
                counta++;
            }

        }
        for (int x=0;x<b.length;x++){
             if (b[x]>=10 & b[x]<=99){
                countb++;
            }

        }
        if(counta == countb){
            result = true;
        }
        else {
            result = false;
        }


        return result;
    }
}