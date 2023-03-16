package Assignment.AdapterBridge;

public class Main {
    public static void main(String[] args) {
        InidianPin i = new InidianPin();
        i.displayPins();
        IndianPinToSocket x = new IndianPinToSocket();
        AmericaSocket a = x.pinToSocketConvertor(i);
        a.displaySocket();
        FrenchPin f = new FrenchPin();
        f.displayPins();
    }

}
