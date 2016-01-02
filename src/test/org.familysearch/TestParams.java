package org.familysearch;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by bolingbrokeba on 12/31/15.
 */
@Test
public class TestParams {
  public void test() {
    int size = 7;
    Integer length = 10;
    String name = "Thomas S. Monson";

    //Call the method that alters the params
    StaticClass.alterParams(size, length, name);

    //Verify the expected values
    assertEquals(7, size);
    assertEquals((Integer)10, length);
    assertEquals(name, "Thomas S. Monson");
  }
}
