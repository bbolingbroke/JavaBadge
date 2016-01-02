package org.familysearch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bolingbrokeba.
 * Loads strings of 0-9 until it runs out of memory
 */
public class StringTest {
  public void run() {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    logger.debug("Running String test...");
    List<String> stringList = new ArrayList<>();
    for (int i = 0; i < Integer.MAX_VALUE; ++i) {
      try {
        stringList.add(createString());
      }
      //Handle the OutOfMemory error
      catch (Exception | OutOfMemoryError e) {
        logger.debug("Number of lists: " + stringList.size());
        throw new IllegalStateException("Number of runs - " + i, e);
      }
    }
  }

  private String createString() {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < 10; ++i) {
      stringBuilder.append(i);
    }
    return stringBuilder.toString();
  }
}
