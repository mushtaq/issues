//> using scala "3.2.1"
//> using repository "jitpack"
//> using lib "com.github.mushtaq.enumeratum::enumeratum:be1c8d6"

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
