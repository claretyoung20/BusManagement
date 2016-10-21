package Bus;


public class BusNode {
        Bus info;
        BusNode next;

    public BusNode(Bus info, BusNode next) {
        this.info = info;
        this.next = next;
    }
    public BusNode(Bus info) {
        this.info = info;
        this.next = null;
    }
}
