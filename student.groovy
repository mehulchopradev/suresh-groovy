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