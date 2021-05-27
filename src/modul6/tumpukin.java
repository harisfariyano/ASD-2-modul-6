package modul6;
public class tumpukin {
    public static void main(String[] args) {
        tumpuk tumpuk = new tumpuk(10);
        tumpuk.push(50);
        tumpuk.printData();
        tumpuk.push(100);
        tumpuk.printData();
        tumpuk.pop();
        tumpuk.printData();
        tumpuk.push(60);
        tumpuk.printData();
        tumpuk.push(80);
        tumpuk.printData();
        tumpuk.pop();
        tumpuk.printData();
        long bacaTop = tumpuk.peek();
        System.out.println("nilai top = "+bacaTop);
    }
}
