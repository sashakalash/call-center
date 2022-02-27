public class Main {

    public static void main(String[] args) {
        final CallsQueue callsQueue = new CallsQueue();
        Atc atc = new Atc(callsQueue);
        CallAssistant ca = new CallAssistant(callsQueue);

        new Thread(null, atc::generateCalls, "ATC").start();
        new Thread(null, ca::takeCall, "Оператор 1").start();
        new Thread(null, ca::takeCall, "Оператор 2").start();
        new Thread(null, ca::takeCall, "Оператор 3").start();

    }
}