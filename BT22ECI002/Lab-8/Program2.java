class SharedResource {
    synchronized void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        notify(); // Notify waiting thread
    }

    synchronized void printLetters() {
        try {
            wait(); // Wait for the other thread to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println(Thread.currentThread().getName() + ": " + c);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class InterthreadCommunicationDemo {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread thread1 = new Thread(() -> sharedResource.printNumbers());
        Thread thread2 = new Thread(() -> sharedResource.printLetters());

        thread1.setName("Number Thread");
        thread2.setName("Letter Thread");

        thread1.start();
        thread2.start();
    }
}
