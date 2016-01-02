package org.familysearch;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * By Bruce Bolingbroke
 */
public class JavaBadge {

  public static void main(String[] args) throws IOException {
    //Sort the lines in the Guttenburg version of the Book of Mormon
    try {
      new FileSort().sort("BofM.txt", "BofM-sorted.txt", FileSort.SortOrder.Alphabetical); //Uses enum for sort order
      new FileSort().sort("BofM.txt", "BofM-reversed.txt", FileSort.SortOrder.Reverse);
    }
    //Handle a checked exception
    catch (FileNotFoundException e) {
      System.out.println("Required BofM.txt file was not found!");
    }

    //Handle an unchecked exception (NPE)
    new FileSort().sort("BofM.txt", "BofM-sorted.txt", null);

    //Count how many strings can be added to an array
//    new StringTest().run();
  }
}
