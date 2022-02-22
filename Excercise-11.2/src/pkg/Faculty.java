package pkg;

/**
 * Outlines an object which describes a Faculty. Inherits from the {@link Employee} class.
 * <p>
 * Contains instance variables of type String: officeHours, rank.
 */
public class Faculty extends Employee {
  String officeHours, rank;

  /**
   * Constructor that takes a name as an argument. Only takes name because its the only variable
   * needed to make the program work.
   * 
   * @param name : String
   */
  public Faculty(String name) {
    super(name);
  }

  /**
   * Overridden method which returns the class (Faculty) and name as a String
   */
  @Override
  public String toString() {
    return "Class: Faculty, Name: " + name;
  }
}
