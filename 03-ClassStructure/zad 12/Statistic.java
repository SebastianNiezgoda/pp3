public class Statistic{
    static int nofitems(int a, int b){
        int count=0;
        int x = a;
        while(x<=b){
            count++;
            x++;
        }
        return count;
    }

    static int sum(int a, int b){
        int sum=0;
        int x = a;
        while (x<=b){
            sum+=x;
            x++;
        }
        return sum;
    }

    static double mean(int a, int b){
        double count=0;
        double x=a;
        double sum=0;
        while(x<=b){
            count++;
            sum+=x;
            x++;

        }
        double mean1=sum/count;
        mean1*=100;
        mean1=Math.round(mean1);
        mean1=mean1/100;

        return mean1;
    }


}