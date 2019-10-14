package com.abc.geometry

// Developer Y
class Rectangle extends Shape {
  Float length
  Float breadth

  def area() {
    this.length * this.breadth
  }

  def perimeter() {
    2 * (this.length + this.breadth)
  }
}