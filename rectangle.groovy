def areaRectangle(length, breadth) {
  length * breadth
}

def perimeterRectangle(length, breadth) {
  2 * (length + breadth)
}

def l = 5
def b = 3


def a = areaRectangle l, b
def p = perimeterRectangle l, b

println a
println p