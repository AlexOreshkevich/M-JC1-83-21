package by.academy.jc.ht.akbarova.ht10;


public class SpyException extends Exception implements Thread.UncaughtExceptionHandler {

    private String className;

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String getMessage() {
        Register.getInstance().notify(className);
        return super.getMessage();
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        setClassName(e.getClass().toString());
        getMessage();
    }
}
