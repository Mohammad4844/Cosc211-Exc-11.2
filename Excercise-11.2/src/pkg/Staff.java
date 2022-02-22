package pkg;

/**
 * Outlines an object which describes a Staff. Inherits from the {@link Employee} class.
 * <p>
 * Contains instance variables of type String: title.
 */
public class Staff extends Employee {
  String title;

  /**
   * Constructor that takes a name as an argument. Only takes name because its the only variable
   * needed to make the program work.
   * 
   * @param name : String
   */
  public Staff(String name) {
    super(name);
  }

  /**
   * Overridden method which returns the class (Staff) and name as a String
   */
  @Override
  public String toString() {
    return "Class: Staff, Name: " + name;
  }
}
