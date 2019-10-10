def pointers = [1, 10, 2, 6, 3, 2, 9, 8]

println 'Even pointers'
// print only the even pointers
/* for (pointer in pointers) {
  if (!(pointer % 2)) {
    println pointer
  }
} */


/* println 'Odd pointers less than 5'
// print all odd pointers less than 5
for (pointer in pointers) {
  if ((pointer % 2) && (pointer < 5)) {
    println pointer
  }
} */


// repitive logic - Higher order function
// 1. Putting a loop on the list
// 1. Putting a loop on the list

// dynamic logic - Lower order functions that need to be passed to the higher order function
// 1. printing even element
// 2. printing odd element less then 5

def forEach(elements, action) {
  for (element in elements) {
    action(element) // callable object
  }
}

// lower order function
/* def printEven(ele) {
  if (!(ele % 2)) {
    println ele
  }
} */

// Functional programming
// forEach(pointers, printEven) // not possible as regular functions are not treated as objects in groovy/java

// Closures (compensate for the above disadvantage)
/* def printEven = {ele ->
  if (!(ele % 2)) {
    println ele
  }
} */

/* def printEven = {
  // implicit parameter 'it'
  // available only when closure takes only 1 parameter
  if (!(it % 2)) {
    println it
  }
}

forEach(pointers, printEven) */

// define and pass the closure object inline
/* forEach(pointers, {
  if (!(it % 2)) {
    println it
  }
}) */

// passing a closure (code) to a function
forEach(pointers) {
  if (!(it % 2)) {
    println it
  }
}


println 'Odd pointers less than 5'

def printOddLessThan5 = {ele ->
  if ((ele % 2) && (ele < 5)) {
    println ele
  }
}
forEach(pointers, printOddLessThan5)

println 'All even elements more than 5'
// higher order function 'each'
pointers.each {
  if (!(it % 2) && (it > 5)) {
    println it
  }
}

// get a new list consiting of only the odd elements from the pointers list (filtering)
println 'New list of odd elements'
def odds = pointers.findAll {it % 2}
println odds

// get a new list consisting of squares of elements from the pointers list (mapping)
println 'New list of squares'
def squares = pointers.collect {it ** 2}
println squares

def has10pointer = pointers.any {it == 10}
println has10pointer

def allPassed = pointers.every {it > 0}
println allPassed

// chaining
println 'Cubes of even pointers greater than 5' // filtering + mapping

def e = pointers.findAll {!(it % 2) && (it > 5)}.collect {it ** 3}
println e

println 'Ascending Sorting'
def so = pointers.sort()
println so

println 'Descending Sorting'
def des = pointers.sort {a, b -> b <=> a} // spaceship operator (compareTo)
println des