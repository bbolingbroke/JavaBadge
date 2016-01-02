package org.familysearch;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.*;

/**
 * Created by bolingbrokeba on 12/31/15.
 */
public class GoodEncapsulation {
  Date date = makeDate(2015, 12, 31);
  Date earliest = makeDate(2015, 1, 1);
  Date latest = makeDate(2015, 12, 31);

  public static Date makeDate(int year, int month, int day) {
    try {
      return DateFormat.getDateInstance(DateFormat.SHORT).parse(month + "/" + day + "/" + year);
    } catch (ParseException e) {
      return new Date();
    }
  }

  public Date getDate() {
    return (Date) date.clone(); //Clone the object so that the caller cannot modify the original
  }

  public void setDate(Date newDate) {
    if (newDate.before(earliest) || newDate.after(latest)) {
      throw new IllegalArgumentException("Date must be in the year 2015!");
    }
    date = newDate;
  }
}
