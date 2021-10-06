package by.academy.jc.ht.klimakhovich;

public class SpyException extends Exception {
    public SpyException(String str) {
        super(str);
        StackTraceElement[] stackElements = Thread.currentThread().getStackTrace();

        String name = stackElements[0].getClassName();

        Storage.setInformation(name);
    }
}