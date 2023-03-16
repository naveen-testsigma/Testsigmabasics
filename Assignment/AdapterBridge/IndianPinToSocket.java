package Assignment.AdapterBridge;

public class IndianPinToSocket implements Pinner{
    private AmericaSocket americaSocket;

    public IndianPinToSocket() {
        this.americaSocket = new AmericaSocket();
    }

    @Override
    public void displayPins() {
    }
    public AmericaSocket pinToSocketConvertor(InidianPin i){
        return americaSocket;
    }
}
