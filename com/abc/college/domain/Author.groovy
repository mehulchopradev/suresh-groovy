package com.abc.college.domain

class Author {
  String name
  Character gender
  Integer ratings
  Contact contact

  String toString() {
    "Name: ${this.name}\nGender: ${this.gender}\nContact: ${this.contact}"
  }
}