package pkg;

/**
 * <h1>Employee</h1>
 * <br>
 * Inherits from {@link Person}.
 * <br>
 * Contains instance variables: office of type String, salary of type double, dateHired of type {@link MyDate}.
 * <br>
 * Contains constructor which takes a name of type String as parameter.
 * <br>
 * Contains an overridden toString() method printing the class (Employee), along with name.
 */

public class Employee extends Person {
  String office;
  double salary;
  MyDate dateHired;

  public Employee(String name) {
    super(name);
  }

  @Override
  public String toString() {
    return "Class: Employee, Name: " + name;
  }
}
