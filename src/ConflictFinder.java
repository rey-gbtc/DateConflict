import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;


public class ConflictFinder {
    public static void main(String[] args) {
        SampleCourse cswp = new SampleCourse();
        cswp.startDate = LocalDate.of(2021, 11, 9);
        cswp.startTime = LocalTime.of(18, 0);
        cswp.endDate = LocalDate.of(2021, 11, 25);
        cswp.endTime = LocalTime.of(21,0);

        // Create list of LocalDateTimes, marking the start and end time for each date from the selected range





        System.out.println(cswp.getSlashFormatDate(cswp.getStartDateTime()) + " " + cswp.getStartDateTime().getDayOfWeek());
        System.out.println(cswp.getSlashFormatDate(cswp.getEndDateTime()) + " " + cswp.getEndDateTime().getDayOfWeek());

        boolean works = cswp.getEndDateTime().getDayOfWeek() == DayOfWeek.valueOf("thursday".toUpperCase());
        System.out.println(works);
    }
}
