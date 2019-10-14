package com.abc.geometry

// Developer X

class Square extends Shape {
  Float side

  def area() {
    this.side ** 2
  }

  def perimeter() {
    4 * this.side
  }
}