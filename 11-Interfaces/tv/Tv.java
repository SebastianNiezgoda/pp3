


class Tv implements CanOnOff,Channel{
    private boolean status;
    private int channel;
    private int volume;
    private String[] chn = {"tvp1","tvp2","tvp3","tvn","polsat","hbo","canal+"};

    public void showStatus(){
        if(status==true){
            System.out.println("Telewizor wlaczony");
        }
        else if(status == false){
            System.out.println("Telewizor wylaczony");
        }
    }

    public void on(){
        this.status = true;
        this.volume = 1;
    }
    public void off(){
        this.status = false;
    }

    public void channelUp(){
        channel++;
    }
    public void channeldown(){
        channel--;
    }
    public void channelset(int n){
        this.channel = n;
    }

    public void showChannel(){
        System.out.println("obecny program to "+ channel);
    }

    public void volumeUp(){
        if(status==true && volume<10){
            volume++;
        }
    }
    public void volumeDown(){
        if(status == true && volume>1){
            volume--;
        }
    }
    public void showvolume(){
    System.out.println(volume);
    }

    public void pokazkanal(){
        System.out.println("nr kanalu to " + channel + " czyli " + chn[channel]);
    }

}