import com.abc.bank.Account
import com.abc.bank.MinBalNotMaintainedException

def a = new Account(name: 'mehul', accNo: 1234, balance: 10000)

// println a.deposit(500)
println a + 500 // operator overloading groovy way!
// Internally
// println a.plus(500)
// println Account.plus(a, 500)

// println a.withdraw(900)
println a - 900
// println a.minus(900)
// println Account.minus(a, 900)

/* try {
  println a.withdraw(9500)
} /* catch (IllegalStateException e) {
  println e
} */ /* catch(MinBalNotMaintainedException e) {
  println e
}
catch (e) {
  println e
} */