public class Points{
    

    static float score(int[] pkt){
        
        float score=0;
        float max= pkt[0];
        float min = pkt[0];
        for(int i=0;i<pkt.length;i++){
            score+=pkt[i];
            if(pkt[i]>=max){
                max=pkt[i];
            }
            if(pkt[i]<min){
                min=pkt[i];
            }

        }
        score-=max;
        score-=min;
        float wynik=score/3;
        return wynik;


    }
}