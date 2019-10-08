// utility functions

def getDetails(name, roll, gender, marks) {
  // 'Name: ' + name + '\nRoll: ' + roll + '\nGender: ' + gender + '\nMarks: ' + marks
  "Name: ${name}\nRoll: ${roll}\nGender: ${gender}\nMarks: ${marks}" // string interpolate
}

def getGrade(marks) {
  switch(marks) {
    case 70..100: return 'A'
    case 60..<70: return 'B'
    case 40..<60: return 'C'
    case 0..<40: return 'F'
    default: return 'I'
  }
}


def name = 'mehul'
def roll = 10
def gender = 'm'
def marks = 45

println getDetails(name, roll, gender, marks)
println getGrade(marks)