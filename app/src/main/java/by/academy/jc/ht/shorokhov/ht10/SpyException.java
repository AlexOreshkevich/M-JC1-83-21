package by.academy.jc.ht.shorokhov.ht10;

public class SpyException extends Exception {
        public SpyException(String message) {
                super(message);

                StackTraceElement[] stack = Thread.currentThread().getStackTrace();
                String name = stack[0].getClassName();
                SpyStorage.setInfo(name);


        }
}





