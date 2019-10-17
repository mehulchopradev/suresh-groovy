package com.abc.college.domain

class Contact {
  String email
  String mobile

  String toString() {
    "Email: ${this.email}\nMobile: ${this.mobile}"
  }
}