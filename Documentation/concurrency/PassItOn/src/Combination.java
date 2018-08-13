public class Combination {

    public static void main(String[] args) {
        System.out.println("begin");
        (new ReadInventoryThread()).start();
        (new Thread(() -> {
            System.out.println("hi, this is a lambda");
        })).start();
        (new ReadInventoryThread()).start();
        System.out.println("end");
    }

}
