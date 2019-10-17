import com.abc.college.domain.Book
import com.abc.college.domain.Author
import com.abc.college.domain.Contact

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

/* def b5 = new Book(title: 'Book 5', pages: 900, price: 560, authors: [
  new Author(name: 'mehul', gender: 'm', ratings: 5, contact: new Contact(email: 'mehul@abc.com', mobile:  '8678868587')),
  new Author(name: 'jane', gender: 'f', ratings: 2, contact: new Contact(email: 'jane@abc.com', mobile:  '986868578'))
]) */


// using the builder pattern for building complex object graphs
def o = new ObjectGraphBuilder(classLoader: getClass().classLoader, classNameResolver: 'com.abc.college.domain')

def b = o.book(title: 'Book 5', pages: 900, price: 560) {
  author(name: 'mehul', gender: 'm', ratings: 5) {
    contact(email: 'mehul@abc.com', mobile:  '8678868587')
  }
  author(name: 'jane', gender: 'f', ratings: 2) {
    contact(email: 'jane@abc.com', mobile:  '986868578')
  }
}

println b.authors