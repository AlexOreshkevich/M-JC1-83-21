package by.academy.jc.ht.akbarova.ht10;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) throws Exception {
        SpyException spyException = new SpyException();
        Thread.setDefaultUncaughtExceptionHandler(spyException);
        Thread t1 = new Thread(() -> {
            double a = 10 / 0;
        });
        Thread t2 = new Thread(() -> {
            double a = 20 / 0;
        });
        Thread t3 = new Thread(() -> {
            LocalDateTime hello = LocalDateTime.parse("hello");
        });
        t1.start();
        Thread.sleep(1000);
        t2.start();
        Thread.sleep(1000);
        t3.start();
        Thread.sleep(1000);
        System.out.println(Register.getInstance().getInfo());
    }
}
