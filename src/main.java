import java.text.SimpleDateFormat;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(formatter.format(new Date()));
    }
}
