import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateHandler {
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public LocalDate stringToDate(String date) {
        return LocalDate.parse(date, formatter);
    }
}
