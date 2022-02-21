package pkg;

/**
 * <h1>Faculty</h1>
 * <br>
 * Inherits from {@link Employee}.
 * <br>
 * Contains instance variables of type String: officeHours & rank.
 * <br>
 * Contains constructor which takes a name of type String as parameter.
 * <br>
 * Contains an overridden toString() method printing the class (Faculty), along with name.
 */


public class Faculty extends Employee {
  String officeHours, rank;

  public Faculty(String name) {
    super(name);
  }

  @Override
  public String toString() {
    return "Class: Faculty, Name: " + name;
  }
}
