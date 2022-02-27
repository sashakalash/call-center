import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class CallsQueue {
    public final Queue<Call> queue = new ConcurrentLinkedQueue<>();

    public void add(Call call) {
        queue.offer(call);
    }

    public Call get() {
        return queue.poll();
    }
}