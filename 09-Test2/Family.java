import java.util.Arrays;

public class Family{
    Person[] persons;
    
    public Family(Person[] n){
        this.persons = n;
        
    }

    public int adults(){
        int result = 0;
        for(int i = 0 ; i<persons.length;i++){
            if(persons[i].getAge()>=18){
                result++;
            }
        }
        return result;
    }
}