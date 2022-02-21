package pkg;

/**
 * <h1>Student</h1>
 * <br>
 * Inherits from {@link Person}.
 * <br>
 * Contains instance variable classStatus of type enum, with labels limited to : freshman, sophomore, junior, senior.
 * <br>
 * Contains constructor which takes a name of type String as parameter.
 * <br>
 * Contains an overridden toString() method printing the class (Student), along with name.
 */

public class Student extends Person {
  enum Status {
    freshman, sophomore, junior, senior;
  }

  Status classStatus;

  public Student(String name) {
    super(name);
  }

  @Override
  public String toString() {
    return "Class: Student, Name: " + name;
  }
}
