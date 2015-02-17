

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
    val in = new java.util.Scanner(new java.io.File("C:\\Users\\apricolota\\Desktop\\DESKTOP\\gitBasic.txt"))
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


    val source = Source.fromFile("C:\\Users\\apricolota\\Desktop\\DESKTOP\\gitBasic.txt", "UTF-8")
    val lineIterator = source.getLines()
    val contents = source.mkString

  def formatResult(name: String, n: Int,  f: Int => Int) ={
    val msg = "The %s of %d is %d."
    msg.format(name, n, f(n))
  }

  def factorial(n: Int): Int = {
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n-1, n*acc)
    go(n, 1)
  }

  def abs(n: Int): Int = {
    if (n < 0) -n
    else n
  }


  val decodeString : String = "DECODE THIS!"
  val dec: Array[Char] = decodeString.toCharArray()
  val encodedString : String = "DO TEE!ISCDH"
  for(i <- 1 to 26){

  }
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray()
  def getLetterIndex(a: Char): Int = {
    alphabet.indexOf(a)
  }

   var message :Array[Char] = new Array(decodeString.size)
   message(0) = dec(0)
   var i: Int  = 0
   var t  = message.iterator
   while (i < decodeString.size){

     if (getLetterIndex(i) )
     message(getLetterIndex(message(i))) = dec(i+1)

     i += i


   }
   message(getLetterIndex(message(0))) = dec(1)





 /* def putCharAtPlace(a: Char ): Array[Int] ={
    for (x <- dec) {
     message(0) =  getLetterIndex(x)
    }
  }*/





 // val s: Int => Char = alphabet








  def main(args: Array[String]) {
    println(sum(10,15))
    println(scores.getOrElse("Bob", 0))
    println (scores)
    read()
    //println(myCounter.current)
    println(new chatter.Member("Wariior"))
    println(myFace)
    println (acct)
    println(p1.km)
    println (pers.description)
    println(inchesToCentimeters(22.0))
    println(contents)
    println(formatResult("absolute value", -42, abs))
    println(formatResult("factorial", 5, factorial))
    println(getLetterIndex(selectIndexes(dec)))

  }


}
