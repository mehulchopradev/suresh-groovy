List.metaClass.evens = {
  delegate.findAll {!(it % 2)}
}


def nos = [5, 6, 3, 4, 8, 10, 1, 3, 5, 9]
// get a new list of even nos from nos list

println nos.evens()