def abc() {
  def i = 3
  def k = 4

  // emulates a pattern of defining a function inside another function
  def c = {
    println i // closure can access the variables from the enclosing scope
    def j = 10
    println j

    k = k + 10 // modifying the enclosing scope variable. Avoid this pattern
    println k // 14
  }

  c()
  // println j // cannot be used outside the closure
  println k // 14
}

abc()


def pqr(i) {
  j = 10

  def xyz = { (i + j + it) ** 2 }

  // emulates a pattern of a function returning another function
  return xyz
}

p = pqr(15)
println p(4)



def rty(f) {
  def rr = 10
  f(rr)
}

// emulate a patter where we pass a function as an argument to another function
// callback functions
def ans = rty {
  it + 20
}

println ans

