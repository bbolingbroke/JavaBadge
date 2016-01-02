package org.familysearch;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.*;

/**
 * Created by bolingbrokeba on 12/31/15.
 */
public class BadEncapsulation {
  Date date;

  public BadEncapsulation() throws ParseException {
    date = DateFormat.getDateInstance(DateFormat.SHORT).parse("12/31/2015");
  }

  public Date getDate() {
    return date; //Returning the date object allows a caller to modify the internals of this class
  }
}
