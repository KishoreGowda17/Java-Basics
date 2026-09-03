import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("HH:mm:ss");

        while (true) {
            LocalTime time = LocalTime.now();

            System.out.print("\r" + time.format(formatter));

            Thread.sleep(1000);
        }
    }
}