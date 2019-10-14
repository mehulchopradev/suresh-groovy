package com.xyz.salarylib

// Mixins
trait CalcSal {
  abstract def getNoOfDays()
  abstract def getPerDayCost()

  def calc() {
    // this - subclass object
    def n = this.getNoOfDays()
    def cost = this.getPerDayCost()

    def total = cost * n
    total - (0.1 * total) - 100
  }
}