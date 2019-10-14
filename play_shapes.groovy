import com.abc.geometry.Square
import com.abc.geometry.Rectangle
import com.xyz.geomstats.GeomStats

def s1 = new Square(side: 5)

// println s1.area()
// println s1.perimeter()
GeomStats.printGeomStats s1

def r1 = new Rectangle(length: 7, breadth: 3)

GeomStats.printGeomStats r1