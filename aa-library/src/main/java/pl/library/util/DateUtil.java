package pl.library.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static final DateFormat Y_M_D_FORMATTER = new SimpleDateFormat("yyyy-MM-dd");

	public static String formatTo_Y_M_D_date(Date date) {
		if (date != null) {
			return Y_M_D_FORMATTER.format(date);
		}
		return null;
	}

	public static Date parse_Y_M_D_date(String string) {
		try {
			return Y_M_D_FORMATTER.parse(string);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
