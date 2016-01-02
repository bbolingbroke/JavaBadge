package org.familysearch;

/**
 * Created by bolingbrokeba on 12/31/15.
 */
public class Overload {
  double d = 0;

  public Overload(double d) {
    this.d = d;
  }

  public Overload(int i) {
    d = i;
  }

  public Overload(float f) {
    d = f;
  }

  public double increment(double d) {
    return ++d;
  }

  public int increment(int i) {
    return ++i;
  }

  public float increment(float f) {
    return ++f;
  }
}
