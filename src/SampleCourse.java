import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class SampleCourse {
    String courseName;
    LocalDate startDate;
    LocalTime startTime;

    LocalDate endDate;
    LocalTime endTime;

    /* getters and setters */

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    /* additional methods */
    public LocalDateTime getStartDateTime(){
        return LocalDateTime.of(startDate, startTime);
    }

    public LocalDateTime getEndDateTime(){
        return LocalDateTime.of(endDate, endTime);
    }

    public String getSlashFormatDate(LocalDateTime localDateTime){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return localDateTime.format(formatter);
    }

    public ArrayList<LocalDateTime> getDateRanges(ArrayList<DayOfWeek> meetingDays){
        ArrayList<LocalDateTime> courseDateTimes = new ArrayList<>();

        // Create day 1 and add to array list
        LocalDateTime dayOneStart = LocalDateTime.of(startDate, startTime);
        LocalDateTime dayOneEnd = LocalDateTime.of(startDate, endTime);

        // Create day 2 to identify pattern
        LocalDateTime dayTwoStart = dayOneStart.plusDays(1);
        System.out.println(dayOneStart);
        System.out.println(dayTwoStart);

        // change, duh
        return null;
    }

}
