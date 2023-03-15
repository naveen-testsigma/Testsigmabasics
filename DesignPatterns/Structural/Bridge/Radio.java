package DesignPatterns.Structural.Bridge;

public class Radio implements Device{
    int volume=10,channel=2;
    boolean setEnable = false;
    @Override
    public void volume() {
        this.volume += 20;
    }

    @Override
    public void setEnable() {
        if(this.setEnable==false){
            this.setEnable = true;
        }
        else {
            this.setEnable = false;
        }
    }

    @Override
    public void channel() {
        this.channel += 4;
    }

    @Override
    public void display() {
        System.out.println("Enabled/Channel/Volume: "+setEnable+"/"+channel+"/"+volume);
    }
}
