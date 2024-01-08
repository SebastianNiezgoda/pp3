abstract class Mesage{
    String mesage;
    public Mesage(){

    }

    public Mesage(String msg){
        this.mesage = msg;
    }

    public String getMesage(){
        return mesage;
    }
    public void setMesage(String msg){
        this.mesage=msg;
    }

    public int charNumber(){
        int number=0;
        for(int i=0;i<mesage.length();i++){
            if(mesage.charAt(i)!=' '){
                number++;

            }
        }
        return number;
    }

    public void sendMesage(){
        System.out.println(mesage);
    }
}