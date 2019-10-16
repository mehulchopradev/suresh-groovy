package com.abc.bank

class Account {
  String name
  Integer accNo
  Float balance
  static Integer minBalance = 1000

  def deposit(amt) {
    this.balance += amt
  }

  def withdraw(amt) {
    println 'Transaction starts'

    try {
      if (amt <= 0) {
        throw new IllegalArgumentException('Amt to withdraw cannnot be 0 or negative')
      }

      if (this.balance - amt < Account.minBalance) {
        // exceptional condition
        // throw new IllegalStateException("Balance going below ${Account.minBalance}")
        throw new MinBalNotMaintainedException("Balance going below ${Account.minBalance}")
      }

      this.balance -= amt
    } finally {
      // that will execute irrespective of whether an exception has or has not occuredd in the corresponding try block
      println 'Transaction ends'
    }
  }

  def plus(amt) {
    this.balance += amt
  }

  def minus(amt) {
    this.withdraw(amt)
  }
}