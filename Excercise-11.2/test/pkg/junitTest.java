package pkg;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class junitTest {

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {}

  @Test
  public void testPerson() {
    Person p = new Person("Sam");
    assertEquals("Person class is not working", p.toString(), "Class: Person, Name: Sam");
  }

  @Test
  public void testStudent() {
    Student s = new Student("Ali");
    assertEquals("Student class is not working", s.toString(), "Class: Student, Name: Ali");
  }

  @Test
  public void testEmployee() {
    Employee e = new Employee("Sarah");
    assertEquals("Employee class is not working", e.toString(), "Class: Employee, Name: Sarah");
  }

  @Test
  public void testFaculty() {
    Faculty f = new Faculty("David");
    assertEquals("Faculty class is not working", f.toString(), "Class: Faculty, Name: David");
  }

  @Test
  public void testStaff() {
    Staff s = new Staff("Natalie");
    assertEquals("Staff class is not working", s.toString(), "Class: Staff, Name: Natalie");
  }
}
