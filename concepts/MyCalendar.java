package concepts;

import java.util.Arrays;
import java.util.Calendar;

class MyCalendar {
    private String[] WeekDays = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    private String[] Days = new String[35];
    private Calendar cld = Calendar.getInstance();
    private int year;
    private int month;
    private int day;
    MyCalendar(int year, int month, int day){
        this.cld.set(year, month, day);
        this.year = cld.get(Calendar.YEAR);
        this.month = cld.get(Calendar.MONTH);
        this.day = cld.get(Calendar.DAY_OF_MONTH);
    }
    MyCalendar(Calendar calendar){
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }
    void renderDays(){
        int days = this.getDaysOfMonth(this.month, this.year);
        int startDay = this.dateOfDay(1);
        System.out.println("Year:"+ this.year + ", Month:"+ (this.month+1));
        System.out.println("start from: "+ this.WeekDays[startDay]);
        int flag = 0;
        System.out.println(Arrays.toString(WeekDays));
        for(; flag <startDay; flag++){
            System.out.print("  .  ");
        }
        for (int i = 1; i < days + 1; i++) {
            String _day = "  " + i + " ";
            if(i<10){
                _day = " " + _day;
            }
            System.out.print(_day);
            flag++;
            if (flag % 7==0){
                System.out.println();
            }
        }
    }
    void newRender(){
       int days = this.getDaysOfMonth(this.month, this.year);
       int firstDay = this.dateOfDay(1);
       for(int i=0;i<days; ++i){
           if(i>firstDay){
               this.Days[i] = ""+i;
           }
       }
       System.out.println(Arrays.toString(this.Days));
       for(int i=0;i<30;i+=7){
           System.out.println(Arrays.toString(Arrays.copyOfRange(this.Days, i, i+7)));
       }
    }
    private int dateOfDay(int date){
        Calendar c = Calendar.getInstance();
        c.set(this.year, this.month, date);
        int indexOfDay =  c.get(Calendar.DAY_OF_WEEK);
        return indexOfDay-1;
    }
    private int getDaysOfMonth(int month, int year){
        int _month = month +1;
        if (_month == 2){
            return isLeapYear(year) ? 29 : 28;
        }
        if(_month == 4 || _month == 6 || _month ==9 || _month == 11){
            return 30;
        }
        return 31;
    }
    private static boolean isLeapYear(int year){
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return year % 100 != 0;
        }
    }
}
