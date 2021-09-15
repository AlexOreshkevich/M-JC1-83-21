package by.academy.jc.zhabko;

import java.time.LocalDateTime;


public class SimplClock {

    private LocalDateTime currentDateTime;
    private DateFormatter dateFormatter;

    private SimplClock(){
            };
    private static SimplClock INSTANCE;
    public static SimplClock getSimpleClock(){
        if (INSTANCE==null) {
            INSTANCE = new SimplClock();
        }
        return INSTANCE;
    }

    public void setFormatter (DateFormatter dateFormatter) {
        this.dateFormatter = dateFormatter;
    }

    public String displayTime(){
        currentDateTime = LocalDateTime.now();
        return DateFormatter.dateFormat(currentDateTime);
    }



}
