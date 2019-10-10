/*def slist = [
  new Student('mehul', 'm' as Character, 10, 90),
  new Student('jane', 'f' as Character, 12, 80),
  new Student('suresh', 'm' as Character, 5, 95)
]

def search = 5 // taken as user input

def result = slist.find {it.roll == search}
if (result) {
  println result.getDetails()
} else {
  println 'Not found'
} */

def smap = [
  10: new Student('mehul', 'm' as Character, 10, 90),
  12: new Student('jane', 'f' as Character, 12, 80),
  5: new Student('suresh', 'm' as Character, 5, 95)
]

def search = 1000
def result = smap[search]
if (result) {
  println result.getDetails()
} else {
  println 'Not found'
}

// get a new map of all the students that are males (filtering)
def males = smap.findAll {it.value.gender == 'm'}
println males

// get a new map of all the students who have scoreed below 95 marks (filtering)
def lessThan95 = smap.findAll {roll, student ->
  println roll
  student.marks < 95
}
println lessThan95

// get a new map of all the students from smap; but where key is roll and value is name of the student (mapping)
def rollnames = smap.collectEntries {roll, student -> 
  println roll
  [roll: student.name]
}
println rollnames