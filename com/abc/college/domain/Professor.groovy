package com.abc.college.domain

import com.xyz.salarylib.CalcSal

// IS-A test
// Professor IS-A CollegeUser

// Multiple inheritance
class Professor extends CollegeUser implements CalcSal {
  List subjects
  Float costPerDay
  Integer noOfDaysInMonth

  def getNoOfDays() {
    this.noOfDaysInMonth
  }
  
  def getPerDayCost() {
    this.costPerDay
  }

  def leftShift(subject) {
    // this - current object
    if (this.subjects == null) {
      this.subjects = []
    }

    this.subjects.add(subject)
    this
  }

  def isCase(subject) {
    this.subjects.contains(subject)
  }

  // can have its own set of methods too
}