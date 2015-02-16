

/**
 * Created by apricolota on 13/2/2015.
 */
import scala.collection.mutable.ArrayBuffer
import scala.io.Source

object LearnSolving {
  def sum (a: Int, b: Int): Int ={
    a + b
  }
  val scores = scala.collection.mutable.Map(("Alice", 10), ("Bob", 3), ("Cindy", 8))
  scores("Fred") = 10
  scores -=("Alice", "Cindy")


  var countWords = scala.collection.mutable.Map[String, Int]()

  def read() {
    val in = new java.util.Scanner(new java.io.File("C:\\Users\\apricolota\\Desktop\\gitBasic.txt"))
    var i: Int = 1
    while (in.hasNext()) {
      countWords = countWords + (in.next() -> i)


      i = i + 1

    }
    for (v <- countWords.keys) {
      if (v.equals("git")){
        println(v)
      }
    }
    }
   class Counter{
     private var value = 0
     def increment() { value += 1}
     def current() =value
   }
  val myCounter = new Counter
  myCounter.increment()


  class Network {

    class Member(val name: String) {
      val contacts = new ArrayBuffer[Member]
    }

    private val members = new ArrayBuffer[Member]

    def join(name: String) = {
      val m = new Member(name)
      members += m
      m
    }
  }
  val chatter = new Network
  val myFace = new Network





  class Account private (val id: Int, initialBalance: Double) {
    private var balance = initialBalance
  }

    object Account {

      def newUniqueNumber(): Int = 1

      // The companion object
      def apply(initialBalance: Double) =
        new Account(newUniqueNumber(), initialBalance)

    }

    val acct = Account(1000.0)





class MilesToKilometers(miles: Double) {

  val km = tmiles()
    def tmiles(): Double = {
      return miles * 0.621371
    }
  }
  val p1 = new MilesToKilometers(16.0)



  class Person(val name: String, val age: Int) {
    println("Just constructed another person")
    def description = name + " is " + age + " years old"
  }

  val pers = new Person("Alexei", 27)



  object inchesToCentimeters {
    def apply(inches: Double): Double =
     inches * 2.54
    def inchesToCentimeters(inches: Double): Double = {

      return apply(inches)
    }
  }


    val source = Source.fromFile("C:\\Users\\apricolota\\Desktop\\gitBasic.txt", "UTF-8")
    val lineIterator = source.getLines()
    val contents = source.mkString



  def main(args: Array[String]) {
    println(sum(10,15))
    println(scores.getOrElse("Bob", 0))
    println (scores)
    read()
    println(myCounter.current)
    println(new chatter.Member("Wariior"))
    println(myFace)
    println (acct)
    println(p1.km)
    println (pers.description)
    println(inchesToCentimeters(22.0))
    println(contents)


  }


}
