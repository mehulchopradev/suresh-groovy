def marks = 76

/*
>= 70 - A
>= 60 - B
>= 40 - C
< 40 - F

> 100 or < 0 - I
*/

/* def getGrade(marks) {
  // if - else if - else if - else if - else
  if (marks > 100 || marks < 0) {
    'I'
  } else if (marks >= 70) {
    'A'
  } else if (marks >= 60) {
    'B'
  } else if (marks >= 40) {
    'C'
  } else {
    'F'
  }
} */

def getGrade(marks) {
  switch(marks) {
    case 70..100: return 'A'
    case 60..<70: return 'B'
    case 40..<60: return 'C'
    case 0..<40: return 'F'
    default: return 'I'
  }
}

println(getGrade(marks))