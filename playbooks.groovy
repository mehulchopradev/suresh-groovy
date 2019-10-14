import com.abc.college.domain.Book

def b1 = new Book()
b1.title = 'Book 1'
b1.pages = 900
b1.price = 1000

println b1.title

// def b2 = new Book(['title': 'Book 2', 'price': 400, 'pages': 800])
def b2 = new Book('title': 'Book 2', 'price': 400, 'pages': 800)
println b2.title
// Internally
// println b2.getTitle()
// b2.title = 'Boooook 2'
// Internally
// b2.setTitle('Boooook 2')
b2.price = -500 // b2.setPrice(-500)

println b2.price // b2.getPrice()

def b3 = new Book('title': 'Book 3', 'price': 400)

b3.price = 650
println b3.title
println b3.price
println b3.pages

def b4 = new Book('price': 900, 'pages':3000, 'title': 'Book 4')
println b4.title
println b4.pages
println b4.price