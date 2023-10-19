public class Height{
    int heightincm;
    

    void heightcheck(){
        float heightinln = (heightincm % 30)/2.54f;
        int heightinft= heightincm / 30;
        int heightininch= (int) heightinln;

        System.out.println("I am " + heightincm + " cm tall or "  + heightinft + " feet and " + heightininch +  " inches tall");
    }

}
