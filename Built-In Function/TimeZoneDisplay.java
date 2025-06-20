
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZoneDisplay {

    public static void displayTime(String zoneName, String zoneId) {
        ZonedDateTime time = ZonedDateTime.now(ZoneId.of(zoneId));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        System.out.println(zoneName + ": " + time.format(formatter));
    }

    public static void main(String[] args) {
        System.out.println("Current Time in Different Time Zones:");

        displayTime("GMT (Greenwich Mean Time)", "GMT");
        displayTime("IST (Indian Standard Time)", "Asia/Kolkata");
        displayTime("PST (Pacific Standard Time)", "America/Los_Angeles");
    }
}
