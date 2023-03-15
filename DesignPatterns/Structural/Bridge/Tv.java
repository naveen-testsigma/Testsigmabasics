package DesignPatterns.Structural.Bridge;

public class Tv implements Device{
    int volume=10,channel=3;
    boolean setEnable = false;
    @Override
    public void volume() {
       this.volume += 30;
    }

    @Override
    public void setEnable() {
        if(setEnable==false){
            this.setEnable = true;
        }
        else {
            this.setEnable = false;
        }
    }

    @Override
    public void channel() {
    this.channel += 1;
    }

    @Override
    public void display() {
        System.out.println("Enabled/Channel/Volume: "+setEnable+"/"+channel+"/"+volume);
    }
}
