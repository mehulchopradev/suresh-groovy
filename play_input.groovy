println 'Program starts....'

def sc = new Scanner(System.in)

try {
  def n = sc.nextInt()
  println (n % 2 ? 'Odd': 'Even')
} catch (InputMismatchException e) {
  // println e
  e.printStackTrace()
  // explicitly want to catch InputMismatchException
} catch (e) {
  // catch all exceptions
}


println 'Program ends...'