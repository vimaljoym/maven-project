package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * For showing the greeting message
   * @param someone
   * @return greeting string 
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
