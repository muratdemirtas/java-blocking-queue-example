import java.util.concurrent.*;

 class main {

    public static void main(String[] args) throws Exception {

        BlockingQueue queue = new ArrayBlockingQueue(1024);

        rxThread tx = new rxThread(queue);
        txThread rx = new txThread(queue);

        new Thread(tx).start();
        new Thread(rx).start();

        Thread.sleep(4000);
    }
}