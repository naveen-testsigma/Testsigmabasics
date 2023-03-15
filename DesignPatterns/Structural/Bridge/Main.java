package DesignPatterns.Structural.Bridge;

public class Main {
    static void testDevice(Device d){
        d.display();
    }

    public static void main(String[] args) {
        testDevice(new Tv());
        Radio r = new Radio();
        r.volume();r.channel();r.setEnable();
        testDevice(r);

    }
}

