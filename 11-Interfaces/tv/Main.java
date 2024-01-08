class Main{
    public static void main(String[] args) {
        Tv s1 = new Tv();
        s1.on();
        s1.showvolume();
        for(int i=0;i<7;i++){
            s1.volumeUp();
        }
        s1.showvolume();
        for(int i=0;i<20;i++){
            s1.volumeUp();
        }
        s1.showvolume();

        s1.channelset(4);
        s1.pokazkanal();

        
    }
}