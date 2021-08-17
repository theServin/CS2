/**
 * Program Name:
 *               ServinAngryException.java
 *  Description: 
 *               Program demonstrates how to create a unique Exception class by extending the Exception class.
 *       Output:
 *               
 *       Author:
 *               Christian Servin, Ph.D.
 *      Contact:
 *               dr.christian.servin@gmail.com
 *               Copyright 2019, Christian Servin
 *               Version 1.0
 * */
public class ServinAngryException extends Exception{          // class header extending Exception class
  public ServinAngryException(String s){                      // class constructor
    super(s);                                                 // String passed to superclass constructor
  }                                                           // close constructor
}                                                             // close class