package homedoctor.medicine.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class MethodTestCode {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss", Locale.KOREA);
        Date d1 = f.parse("01:08:07");
        Date d2 = f.parse("01:05:07");
        long diff = d1.getTime() - d2.getTime();
        long sec = diff / 1000;
        System.out.println("test");
        System.out.println(sec);
    }
}
