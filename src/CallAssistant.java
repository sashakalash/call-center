import java.util.Date;

public class CallAssistant {
    private final int CALL_RESOLVING_DELAY = 3000;
    public CallsQueue queue;

    public CallAssistant(CallsQueue queue) {
        this.queue = queue;
    }

    public void takeCall() {
        System.out.printf("%s подключился к АТС\n", Thread.currentThread().getName());
        try {
            while (true) {
                Call call = this.queue.get();
                if (call != null) {
                    System.out.printf("%s принял вызов %s в %tT%n\n", Thread.currentThread().getName(), call.getTitle(), call.getDate());
                    Thread.sleep(CALL_RESOLVING_DELAY);
                    System.out.printf("%s закончил обрабатывать вызов в %tT%n\n", Thread.currentThread().getName(), new Date());
                }
            }
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }

    }
}