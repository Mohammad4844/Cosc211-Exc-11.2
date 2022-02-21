package pkg;

/**
 * <h1>Person</h1>
 * <br>
 * Contains instance variables of type String: name, address,phone, email.
 * <br>
 * Contains constructor which takes a name of type String, as parameter.
 * <br>
 * Contains an overridden toString() method printing the class (Person), along with name.
 */

public class Person {
  String name, address, phone, email;

  public Person(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Class: Person, Name: " + name;
  }
}
