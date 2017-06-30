import java.util.concurrent.*;

public class txThread implements Runnable{

    protected BlockingQueue queue = null;

    public txThread(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            queue.put("this message from tx thread: 1");
            Thread.sleep(1000);
            queue.put("this message from tx thread: 2");
            Thread.sleep(1000);
            queue.put("this message from tx thread: 3");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}