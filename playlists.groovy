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