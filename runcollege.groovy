import com.abc.college.domain.Student
import com.abc.college.domain.Professor

def i = 90
def s = new Student(name: 'mehul', roll: 10, gender: 'm' as Character, marks: 90)
/*println s.name
println s.gender
println s.roll*/
// println s.getDetails()
// Student.getDetails(s)

def p = new Professor(name: 'jane', gender: 'f' as Character, subjects: ['Physics', 'Maths'])
// println p.getDetails()
/*println p.name
println p.subjects*/

println i
// Internally
// println i.toString()


println s
// Internally
// println s.toString()

println p