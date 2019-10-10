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