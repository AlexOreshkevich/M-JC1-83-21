package by.academy.jc.ht.zhabko;

public class SpyException extends Exception{
    public SpyException() {

        StackTraceElement[] traceElements = Thread.currentThread().getStackTrace();

        String className = traceElements[2].getClassName();

        SpyStorage.getInstance().setInformation(className);
    }
}
