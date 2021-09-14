package by.academy.jc.ht.zhabko;





import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoPeriod;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;

public class MayanLocalDate implements ChronoLocalDate {


    //Long date variables
    private final int kin;
    private final int winal;
    private final int tun;
    private final int katun;
    private final int baktun;

    //Tzolkin variables
    private final int tzDayNumber;
    private final int tzDayNameInt;

    //Haab variables
    private final int haabDayNumber;
    private final int haabMonthNameInt;

    enum tzDayNames {
        Imix,
        Ik,
        Akbal,
        Kan,
        Chicchan,
        Cimi,
        Manik,
        Lamat,
        Muluc,
        Oc,
        Cheun,
        Eb,
        Ben,
        Ix,
        Men,
        Cib,
        Caban,
        Etznab,
        Cauac,
        Ahau;

        private static final MayanLocalDate.tzDayNames[] ENUMS = MayanLocalDate.tzDayNames.values();
        public static MayanLocalDate.tzDayNames of (int tzDayName) {
            return ENUMS[tzDayName-1];
        }

    }

    enum haabMonthNames {
        Pop,
        Uo,
        Zip,
        Zotz,
        Tzec,
        Xul,
        Yaxkin,
        Mol,
        Chen,
        Yax,
        Zac,
        Keh,
        Mac,
        Kankin,
        Muwan,
        Pax,
        Kayab,
        Kumku,
        Wayeb;

        private static final MayanLocalDate.haabMonthNames[] ENUMS = MayanLocalDate.haabMonthNames.values();

        public static MayanLocalDate.haabMonthNames of (int haabMonthNamesInt) {
            return ENUMS [haabMonthNamesInt-1];
        }


    }

    private MayanLocalDate(int baktun, int katun, int tun, int winal, int kin, int tzDayNumber, int tzDayNameInt, int haabDayNumber, int haabMonthNameInt) {
        this.kin = kin;
        this.winal = winal;
        this.tun = tun;
        this.katun = katun;
        this.baktun = baktun;
        this.tzDayNumber = tzDayNumber;
        this.tzDayNameInt = tzDayNameInt;
        this.haabDayNumber = haabDayNumber;
        this.haabMonthNameInt = haabMonthNameInt;
    }

    public static MayanLocalDate create (int baktun, int katun, int tun, int winal, int kin, int tzDayNumber, int tzDayNameInt, int haabDayNumber, int haabMonthNameInt) {
        return new MayanLocalDate (baktun,katun,tun,winal,kin,tzDayNumber,tzDayNameInt,haabDayNumber,haabMonthNameInt);
    }

    public static MayanLocalDate of (int baktun, int katun, int tun, int winal, int kin, int tzDayNumber, int tzDayNameInt, int haabDayNumber, int haabMonthNameInt) {
        return create (baktun,katun,tun,winal,kin,tzDayNumber,tzDayNameInt,haabDayNumber,haabMonthNameInt);
    }


    //Convertation from Gregorian to Mayan date. Uses custom correlation.
    public static MayanLocalDate fromLocalDate(LocalDate localDate) {
        LocalDate baseDateISO = LocalDate.of(-3114,
                8,
                12);
        long daysBetween = ChronoUnit.DAYS.between(baseDateISO,localDate);
        return MayanLocalDate.correlationDate().plusDays(daysBetween);
    }

    public static MayanLocalDate correlationDate() {

        return create(0,0,0,0,1,5,2,9,18);
    }

    public static void correlationDateShow() {
        correlationDate().show();
    }

    public MayanLocalDate plusDays (long daysToAdd) {
        int counter = 0;
        int tKin=kin;
        int tWinal=winal;
        int tTun=tun;
        int tKatun=katun;
        int tBaktun=baktun;



        //Long Date loop
        mark: while  (true) {
            if (tBaktun==21) break;
            if (counter!=0) tBaktun++;
            if (counter!=0) tKatun=0;
            for (int i=0; i<20; i++) {
                tKatun++;
                if (tKatun==21) break ;
                if (counter!=0) tTun=0;
                for (int j=0; j<20; j++) {
                    tTun++;
                    if (tTun==21) break ;
                    if (counter!=0) tWinal=0;
                    for (int k=0; k<19; k++) {
                        tWinal++;
                        if (tWinal==20) break;
                        if (counter!=0) tKin=0;
                        for (int e=0; e<21; e++) {
                            // All loops stop condition
                            if (counter==daysToAdd) break mark;
                            tKin++;
                            // Making first kin in loop as "zero"
                            if (e==0&tKin==1) tKin=0;
                            if (tKin==20) break;
                            // Five "Waueb" days condition
                            if (tWinal==19&tKin==5) break;
                            counter++;
                        }
                    }
                }
            }
        }

        //Tzolkin loop
        counter = 0;
        int techTzDayNumber = 0;
        int techTzDayNameInt = 0;

        while (counter<daysToAdd) {
            counter++;
            techTzDayNumber++;
            techTzDayNameInt++;
        }
        techTzDayNumber = (tzDayNumber+techTzDayNumber)%13;
        if (techTzDayNumber==0) techTzDayNumber=13;
        techTzDayNameInt = (tzDayNameInt+techTzDayNameInt)%20;
        if (techTzDayNameInt==0) techTzDayNameInt=20;


        //Haab implementatin
        int techHaabDayNumber = tKin;
        int techHaabDayNameInt = tWinal;


        return new MayanLocalDate(tBaktun, tKatun-1, tTun-1, tWinal-1,tKin,techTzDayNumber,techTzDayNameInt,techHaabDayNumber,techHaabDayNameInt);
    }


    public void show(){
        System.out.print("Long Date is ");
        System.out.print(baktun);
        System.out.print(","+katun);
        System.out.print(","+tun);
        System.out.print(","+winal);
        System.out.print(","+kin+"; ");
        System.out.print("Tzolkin Date is ");
        System.out.print(tzDayNumber);
        System.out.print(" "+ MayanLocalDate.tzDayNames.of(tzDayNameInt)+"; ");
        System.out.print("Haab Date is ");
        System.out.print(+haabDayNumber);
        System.out.print(" "+ MayanLocalDate.haabMonthNames.of(haabMonthNameInt));
        System.out.println();
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
