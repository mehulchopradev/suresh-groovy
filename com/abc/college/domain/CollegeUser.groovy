package com.abc.college.domain

// super class/parent class/base class
// CollegeUser - Object : Single inheritance
class CollegeUser { // every class in java implicitly extends from the class Object
  String name
  Character gender

  String getDetails() {
    // this - Student / Professor / sub class object of CollegeUser
    "Name: ${this.name}\nGender: ${this.gender}"
  }

  String toString() {
    "Name: ${this.name}\nGender: ${this.gender}"
  }
}