import java.util.concurrent.TimeUnit;

class Multiples extends Thread {
    int num;

    Multiples(int num) {
        this.num = num;
    }

    public void run() {
        long startTime = System.nanoTime();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
        long stopTime = System.nanoTime();
        long executionTime = startTime - stopTime;
        double executionTimeInSeconds = TimeUnit.MILLISECONDS.convert(executionTime, TimeUnit.NANOSECONDS);
        System.out.println(
                Thread.currentThread().getName() + " got executed in " + executionTimeInSeconds / 1000 + " seconds");
    }
}

class Question4 {
    public static void main(String[] args) {
        Multiples t1 = new Multiples(3);
        Multiples t2 = new Multiples(5);
        Multiples t3 = new Multiples(13);
        t1.start();
        t2.start();
        t3.start();
    }
}