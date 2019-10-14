import com.abc.bank.Account
import com.abc.bank.MinBalNotMaintainedException

def a = new Account(name: 'mehul', accNo: 1234, balance: 10000)

println a.withdraw(900)

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