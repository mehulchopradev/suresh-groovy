package com.abc.college.domain

// IS-A test
// Student IS-A CollegeUser

// Student -> CollegeUser -> Object : Multilevel inheritance
// sub class/child class/concrete class
class Student extends CollegeUser {
  Integer roll
  Float marks

  // method overriding
  String getDetails() {
    "${super.getDetails()}\nRoll: ${this.roll}"
  }

  // can have its own set of methods too
}