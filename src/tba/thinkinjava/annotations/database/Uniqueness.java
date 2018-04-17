//: annotations/database/Uniqueness.java
// Sample of nested annotations
package tba.thinkinjava.annotations.database;

public @interface Uniqueness {
  Constraints constraints()
    default @Constraints(unique=true);
} ///:~
