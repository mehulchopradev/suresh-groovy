def n = 10

// 0 1 1 2 3 5 8 13

def a = 0
def b = 1

println a
println b


// 3 to n
for (v in 3..n) {
  def c = a + b
  println c
  a = b
  b = c
}

println c