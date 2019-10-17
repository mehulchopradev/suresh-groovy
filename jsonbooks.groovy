// JSOBuilder with no arguments does not refer to any existing data structure
def builder = new groovy.json.JsonBuilder()
def root = builder.people {
    person {
        firstName 'Guillame'
        lastName 'Laforge'
        // Named arguments are valid values for objects too
        address(
                city: 'Paris',
                country: 'France',
                zip: 12345,
        )
        married true
        // a list of values
        conferences 'JavaOne', 'Gr8conf'
    }
}

println builder.toString()

// Existing data structure
def o = new ObjectGraphBuilder(classLoader: getClass().classLoader, classNameResolver: 'com.abc.college.domain')
def b = o.book(title: 'Book 5', pages: 900, price: 560) {
  author(name: 'mehul', gender: 'm', ratings: 5) {
    contact(email: 'mehul@abc.com', mobile:  '8678868587')
  }
  author(name: 'jane', gender: 'f', ratings: 2) {
    contact(email: 'jane@abc.com', mobile:  '986868578')
  }
}

def authors = b.authors
def jsonBuilder = new groovy.json.JsonBuilder()
jsonBuilder(authors) {
  gens it.gender
  ratings it.ratings
  name it.name
}

println jsonBuilder.toString()
