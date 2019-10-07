def n = 10

// branches
// if - else

/* if (n % 2) { // the condition can be any groovy truthy expression
  println('It is odd')
} else {
  println('It is even')
} */

// ternary operators - groovy truths
def ans = n % 2 ? 'It is odd' : 'It is even'
println ans