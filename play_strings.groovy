// Metaprogramming in groovy
// metaClass
// static property which is available to every class in groovy
String.metaClass.csv = {
  // println delegate // very much like 'this'
  result = ''
  for(ch in delegate) {
    result += ch + ','
  }

  result
}



def fullName = 'mehul chopra'
// String object
// java.lang

// inject a function in an existing class
println fullName.csv()
println "welcome to india".csv()

def n1 = 'mehul'

def n2 = 'mehu' + 'l'

println n1 == n2
println n1.is(n2)