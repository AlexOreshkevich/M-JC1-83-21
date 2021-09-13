package by.academy.jc.zhabko;


import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoPeriod;
import java.time.chrono.Chronology;
import java.time.chrono.IsoChronology;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;

public class MayanLocalDate implements ChronoLocalDate {



    private final int kin;
    private final int winal;
    private final int tun;
    private final int katun;
    private final int baktun;

    public MayanLocalDate(int baktun, int katun, int tun, int winal, int kin) {
        this.kin = kin;
        this.winal = winal;
        this.tun = tun;
        this.katun = katun;
        this.baktun = baktun;
    }

    public static MayanLocalDate create (int baktun, int katun, int tun, int winal, int kin) {
        return new MayanLocalDate (baktun,katun,tun,winal,kin);
    }

    public static MayanLocalDate of (int baktun, int katun, int tun, int winal, int kin) {
        return create (baktun,katun,tun,winal,kin);
    }

    @Override
    public MayanChronology getChronology() {
          return MayanChronology.INSTANCE;
    }

    @Override
    public int lengthOfMonth() {
        return 20;
    }

    @Override
    public long until(Temporal endExclusive, TemporalUnit unit) {
        return 0;
    }

    @Override
    public ChronoPeriod until(ChronoLocalDate endDateExclusive) {
        return null;
    }

    @Override
    public long getLong(TemporalField field) {
        return 0;
    }
}
