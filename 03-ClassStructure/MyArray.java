public class MyArray{
    static double even(int[] array){
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                count++;
            }
        }
        return count;
    }
    
    
}