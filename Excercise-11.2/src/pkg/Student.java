package pkg;

/**
 * Outlines an object which describes a Student. Inherits from the {@link Person} class.
 * <p>
 * Contains instance variables of type enum Status: classStatus.
 */
public class Student extends Person {

  /**
   * An enumeration used for classStatus. Restricts the options for classStatus to just the required
   * ones: freshman, sophomore, senior, junior.
   */
  enum Status {
    freshman, sophomore, junior, senior;
  }

  Status classStatus;

  /**
   * Constructor that takes a name as an argument. Only takes name because its the only variable
   * needed to make the program work.
   * 
   * @param name : String
   */
  public Student(String name) {
    super(name);
  }

  /**
   * Overridden method which returns the class (Student) and name as a String
   */
  @Override
  public String toString() {
    return "Class: Student, Name: " + name;
  }
}
