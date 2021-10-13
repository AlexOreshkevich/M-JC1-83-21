package by.academy.jc.ht.zhabko;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class SpyRegister implements Thread.UncaughtExceptionHandler {

    private Map<Class <? extends Throwable>, Integer> registerMap;

    private static SpyRegister INSTANCE;

    private static final Logger LOGGER = Logger.getLogger (SpyRegister.class.getName());

    private SpyRegister() {registerMap = new HashMap<>();
    }

    public static SpyRegister getInstance() {
        if (INSTANCE == null) {
            synchronized (SpyRegister.class) {
                INSTANCE = new SpyRegister();
            }
        }
        return INSTANCE;
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        LOGGER.warning("uncaught Exception from thread " + t.getName() + ": " + e.getMessage());

        Class<? extends Throwable> exceptionType = e.getClass();
        registerMap.put(
                exceptionType,
                registerMap.computeIfAbsent(exceptionType, aClass -> 0) + 1
        );
    }
}
