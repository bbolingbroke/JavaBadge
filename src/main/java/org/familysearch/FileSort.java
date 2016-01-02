package org.familysearch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by bolingbrokeba on 12/31/15.
 */
public class FileSort {
  enum SortOrder {
    Alphabetical,
    Reverse
  }
  ArrayList<String> list;

  public void sort(String srcFile, String destFile, SortOrder order) throws IOException {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    logger.debug("Reading " + srcFile);
    readLines(srcFile);

    //Handle an unchecked nullPointerException
    if (order == null) {
      logger.error("SortOrder parameter cannot be null!");
      return;
    }
    logger.debug("Sorting lines...");
    switch (order) {
      case Alphabetical:
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
        break;
      case Reverse:
        Collections.sort(list, Collections.reverseOrder());
    }

    logger.info("Writing " + destFile);
    writeLines(destFile);
  }

  public void readLines(String fileName) throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader(fileName));
    list = new ArrayList<>(40279); //optimized for size of BofM.txt
    String line;

    while ((line = reader.readLine()) != null) {
      list.add(line);
    }
    reader.close();
  }

  public void writeLines(String fileName) throws IOException {
    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
    for (String line : list) {
      if (line.length() > 0) {
        writer.write(line);
        writer.newLine();
      }
    }
    writer.close();
  }
}
