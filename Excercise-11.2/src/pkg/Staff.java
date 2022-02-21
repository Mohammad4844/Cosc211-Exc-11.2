package pkg;

/**
 * <h1>Faculty</h1>
 * <br>
 * Inherits from {@link Employee}.
 * <br>
 * Contains instance variable title of type String.
 * <br>
 * Contains constructor which takes a name of type String as parameter.
 * <br>
 * Contains an overridden toString() method printing the class (Staff), along with name.
 */

public class Staff extends Employee {
  String title;

  public Staff(String name) {
    super(name);
  }

  @Override
  public String toString() {
    return "Class: Staff, Name: " + name;
  }
}
