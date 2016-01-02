package org.familysearch;

import org.testng.annotations.Test;

import java.text.ParseException;
import java.util.Date;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by bolingbrokeba on 12/31/15.
 */
@Test
public class TestEncapsulation {
  public void testGood() throws ParseException {
    GoodEncapsulation test = new GoodEncapsulation();
    assertEquals(2015, test.date.getYear() + 1900);

    //Call getList and modify the object returned
    Date date = test.getDate();
    date.setYear(2016 - 1900);

    //Verify that the date in our test object did NOT change
    assertEquals(2015, test.date.getYear() + 1900);
  }

  public void testBad() throws ParseException {
    BadEncapsulation test = new BadEncapsulation();
    assertEquals(2015, test.date.getYear() + 1900);

    //Call getList and modify the object returned
    Date date = test.getDate();
    date.setYear(2016 - 1900);

    //Show that the date in our test object DID change
    assertEquals(2016, test.date.getYear() + 1900);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testValidation() {
    GoodEncapsulation test = new GoodEncapsulation();
    //This should throw an IllegalArgumentException
    test.setDate(GoodEncapsulation.makeDate(2012, 7, 24));
  }
}
