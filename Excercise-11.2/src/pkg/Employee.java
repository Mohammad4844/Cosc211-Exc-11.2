package pkg;

/**
 * Outlines an object which describes a Employee. Inherits from the {@link Person} class.
 * <p>
 * Contains instance variables of type String: office; type double: salary; type {@link MyDate}:
 * dateHired.
 */
public class Employee extends Person {
  String office;
  double salary;
  MyDate dateHired;

  /**
   * Constructor that takes a name as an argument. Only takes name because its the only variable
   * needed to make the program work.
   * 
   * @param name : String
   */
  public Employee(String name) {
    super(name);
  }

  /**
   * Overridden method which returns the class (Employee) and name as a String
   */
  @Override
  public String toString() {
    return "Class: Employee, Name: " + name;
  }
}
