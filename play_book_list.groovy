import com.abc.college.domain.Book

def bl1 = new BookList(books: [
  new Book(title: 'Book 1', pages: 900, price: 4500),
  new Book(title: 'Book 2', pages: 450, price: 1000),
  new Book(title: 'Book 3', pages: 900, price: 500)
])

// a friendly dsl (domain specific language) that can be applied on BookList object
// the dsl would depend on the type of object that BookList is holding
// eg.
// find all books by pages - bl1.findAllByPages(900)
// find all books by price - bl1.findAllByPrice(500)
// findAllBy<<object Attribute Name CamelCase>>(<<value>>)
// dynamic function

// println bl1.findAllByPages(900)
println bl1.findAllByPrice(4500)
// println bl1.findAllByPagesAndPrice(900, 500)
// println bl1.findAllByPriceGt(600)


class MyBook {
  String title
  Integer pa
  Float cost

  String toString() {
    "Title: ${this.title}\nPages: ${this.pa}\nPrice: ${this.cost}"
  }
}

def bl2 = new BookList(books: [
  new MyBook(title: 'Book 1', pa: 900, cost: 4500),
  new MyBook(title: 'Book 2', pa: 450, cost: 1000),
  new MyBook(title: 'Book 3', pa: 900, cost: 1000)
])

// find all books by pages
// println bl2.findAllByPa(450)

// find all books by price
println bl2.findAllByCost(1000)
