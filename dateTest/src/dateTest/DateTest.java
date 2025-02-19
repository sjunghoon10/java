package dateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTest {
   public static void main(String[] args) {
      Date date = new Date();
//      SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
      SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
      
      simpleDateFormat.format(date);
      
      System.out.println(date);
      System.out.println(simpleDateFormat.format(date));
      
      try {
         Date day = simpleDateFormat.parse("1900년 12월 4일");
         System.out.println(day);
      } catch (ParseException e) {
         e.printStackTrace();
      }
   }
}


