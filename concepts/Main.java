package concepts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Input your Date String in yyyyMMdd format:");
        String dateStr = sc.nextLine();
        Date date;
            date = sdf.parse(dateStr);
        Calendar cld = Calendar.getInstance();
        cld.setTime(date);
        System.out.println(date);
        MyCalendar mycld = new MyCalendar(cld);
        mycld.renderDays();
//        mycld.newRender();
   }
}
