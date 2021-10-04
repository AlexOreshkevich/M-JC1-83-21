package by.academy.jc.ht.dubautsova;

public class SpyException extends Exception {
    public SpyException(String message) {
        super(message);
        SpyCounter.add(getStackTrace()[0].getClassName());
    }
}
