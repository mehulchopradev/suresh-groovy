package com.abc.college.domain

// groovy bean (higher version of java bea)
class Book {
  String title
  Integer pages
  Float price

  // every groovy bean along with the no arg constructor, gets a constructor that takes in a Map
  // every groovy bean gives us java bean convention style getters/setters for each of the object attributes

  // on demand encapsulation in groovy
  def setPrice(Float price) {
    // this
    if (price <= 0) {
      this.price = null
    } else {
      this.price = price
    }
  }
}