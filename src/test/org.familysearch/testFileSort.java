package org.familysearch;

import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.*;

@Test
public class TestFileSort {

  public void testSort() throws IOException {
    FileSort sort = new FileSort();
    sort.readLines("test.txt");
    assertEquals(sort.list.size(), 4);
  }
}