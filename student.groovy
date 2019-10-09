// Person X

// In the RAM an object is created per class - Class (java)
class Student {
  // object attributes
  String name
  Character gender
  Integer roll
  Float marks

  // class attribute
  // shared by all the Student objects
  // Access using the class name
  static Integer count = 0


  // implicitly defined (defaults)
  /* Student(this) {

  } */

  // called only during object creation (new)
  // It has the same name as that of the class
  // Code inside this will always only initialize the object attributes
  // constructor
  Student(String name, Character gender, Integer roll, Float marks) {
    // this implicit parameter

    Student.count++

    // object attributes have also been initialized
    this.name = name
    this.gender = gender
    this.roll = roll
    this.marks = marks
  }

  // overloaded constructor
  Student() {
    Student.count++
  }

  String getDetails() {
    println this
    "Name: ${this.name}\nRoll: ${this.roll}\nGender: ${this.gender}\nMarks: ${this.marks}"
  }

  Character getGrade() {
    switch(this.marks) {
      case 70.0..100.0: return 'A'
      case 60.0..<70.0: return 'B'
      case 40.0..<60.0: return 'C'
      case 0.0..<40.0: return 'F'
      default: return 'I'
    }
  }

  static Integer getcount() {
    // there is no implicit this parameter
    // static functions
    // println this.count // this in this case is the address of the Class object of Student class
    Student.count
  }

  // Internally
  /* def getDetails(this) {
    // this is implicit
    // this - current object
  } */
}


// Person Y
// println Student.count
println Student.getcount()

def s1 = new Student('mehul', 'm' as Character, 10, 90)
// new - 3003 - Student
// Student('mehul', 'm', 10, 90, 3003)


// 3003 - RAM - Student
// set the object attributes
/* s1.name = 'mehul'
s1.gender = 'm'
s1.roll = 10
s1.marks = 90 */

def s2 = new Student()
// new - 3005 - Student
// Student(3005)


// 3005 - RAM - Student

s2.name = 'jane'
s2.gender = 'f'
s2.roll = 11
s2.marks = 45

println Student.count

// acccess (getting) the object attributes (properties)
/* println s1.name
println s2.name
println s1.roll
println s2.roll */
// println s1.x // no such property defined in the class

println s1.getDetails()
// Internally
// Student.getDetails(s1)


println s2.getDetails()
// Internally
// Student.getDetails(s2)

println s1.getGrade()
// Student.getGrade(s1)

println s2.getGrade()