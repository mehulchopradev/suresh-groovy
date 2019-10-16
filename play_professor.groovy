import com.abc.college.domain.Professor

def p = new Professor(name: 'mehul', gender: 'm', costPerDay: 1000, noOfDaysInMonth: 22)

// println p.calc()
// p.subjects.add('Phsyics')

// operator overloading
p << 'Physics'
p << 'Chemistry' << 'Maths'

println 'Chemistry' in p // membership operator (isCase)