import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    public static void main(String[] args){
        LocalDateTime dt=LocalDateTime.now();
        System.out.println("Dan: " + dt.getDayOfMonth());
        System.out.println("Mjesec: "+dt.getMonth());
        System.out.println("Sat: "+dt.getHour());
        System.out.println("Minute: "+dt.getMinute());

    }

}
