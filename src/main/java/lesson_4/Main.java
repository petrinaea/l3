package lesson_4;

public class Main {
    static Object mon = new Object();
    static volatile char startLetter = 'A';

    static class WaitNotify implements Runnable {

        private char currentLetter;
        private char nextLetter;

        public WaitNotify(char currentLetter, char nextLetter) {
            this.currentLetter = currentLetter;
            this.nextLetter = nextLetter;
        }

        @Override
        public void run() {
            synchronized (mon) {
                for (int i = 0; i < 5; i++) {
                    while (startLetter != currentLetter) {
                        try {
                            mon.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.print(currentLetter);
                    startLetter = nextLetter;
                    mon.notifyAll();
                }
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new WaitNotify('A', 'B')).start();
        new Thread(new WaitNotify('B', 'C')).start();
        new Thread(new WaitNotify('C', 'A')).start();

    }


}
