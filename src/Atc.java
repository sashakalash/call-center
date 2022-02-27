import java.util.Date;
import java.util.Queue;

public class Atc {
    private final int CALL_GENERATE_DELAY = 1000;
    private final int CALLS_QUANTITY = 60;
    public CallsQueue queue;

    public Atc(CallsQueue queue) {
        this.queue = queue;
    }

    public void generateCalls() {
        System.out.printf("%s начала прием звонков\n", Thread.currentThread().getName());
        try {
            while (true) {
                createCalls();
                System.out.printf("%s приняла звонки\n", Thread.currentThread().getName());
                Thread.sleep(CALL_GENERATE_DELAY);
            }
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void createCalls() {
        for(int i = 1; i <= CALLS_QUANTITY; i++) {
            queue.add(new Call("call-" + Math.random(), new Date()));
        }
    }
}