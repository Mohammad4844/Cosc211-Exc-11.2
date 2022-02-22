package pkg;

/**
 * Outlines an object which describes a Person, to be used as a parent class for others.
 * <p>
 * Contains instance variables of type String: name, address,phone, email.
 */
public class Person {
  String name, address, phone, email;

  /**
   * Constructor that takes a name as an argument. Only takes name because its the only variable
   * needed to make the program work.
   * 
   * @param name : String
   */
  public Person(String name) {
    this.name = name;
  }

  /**
   * Overridden method which returns the class (Person) and name as a String
   */
  @Override
  public String toString() {
    return "Class: Person, Name: " + name;
  }
}
