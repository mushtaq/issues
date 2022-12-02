//> using scala "2.13.10"
//> using lib "com.beachape::enumeratum:1.7.0"

import enumeratum.{Enum, EnumEntry}
import scala.collection.immutable

sealed trait Base extends EnumEntry

object Base extends Enum[Base] {
  class Derived extends Base

  override def values: immutable.IndexedSeq[Base] = findValues

  case object E1 extends Derived
  case object E2  extends Derived
}

object Demo {
  def main(args: Array[String]): Unit = {
    println(Base.values) // prints empty vector
  }
}
