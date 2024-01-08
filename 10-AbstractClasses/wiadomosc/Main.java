public class Main{
    public static void main(String[] args) {
        SMS s1 = new SMS(729646436);
        s1.setMesage("Lubie placki");
        s1.sendMesage();
        System.out.println(s1.charNumber());
        
        Email s2 = new Email("Lubie duze placki","upodobanie" , "Janek");
        s2.sendMesage();

    }
    
}