class BookList {
  List books

  // called by groovy if trying to call a method that does not exist in the class
  def methodMissing(String methodName, args) {
    // println methodName
    // println args

    // methodName confirm to the DSL
    if (methodName.startsWith('findAllBy')) {
      def attributeName = methodName['findAllBy'.size()..methodName.size()-1]
      def objAttributeName = attributeName[0].toLowerCase() + attributeName[1..attributeName.size()-1]

      return this.books.findAll {it[objAttributeName] == args[0]}
    }

    throw new UnsupportedOperationException("We do not support ${methodName} at the moment")
  }
}