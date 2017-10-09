package descansoApp.herramientas;

import java.util.Calendar;

public class Utilidades {

    public static Calendar soloFecha(final Calendar calendar) {
        calendar.set(Calendar.HOUR, 0);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        return calendar;
    }
    
    public static boolean fechasIguales(final Calendar calendar1,final Calendar calendar2){
        if ((calendar1 == null) && (calendar2 != null)) return false;
        if ((calendar1 != null) && (calendar2 == null)) return false;
        
        if ((calendar1.get(Calendar.DAY_OF_MONTH) == calendar2.get(Calendar.DAY_OF_MONTH)) &&
                (calendar1.get(Calendar.MONTH) == calendar2.get(Calendar.MONTH)) &&
                (calendar1.get(Calendar.YEAR) == calendar1.get(Calendar.YEAR)))
                    return true;
        
        return false;
    }
}
