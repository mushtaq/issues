//> using scala "3.2.1"
//> using repository "jitpack"
//> using lib "com.github.mushtaq.enumeratum::enumeratum:be1c8d6"
//> using platform "jvm", "scala-js"

import enumeratum.{Enum, EnumEntry}

import scala.collection.immutable.IndexedSeq

sealed class Base extends EnumEntry 

object Base extends Enum[Base] {
  def values: IndexedSeq[Base] = findValues ++ Derived.values

  case object E1 extends Base
}

sealed abstract class Derived extends Base  

object Derived extends Enum[Derived] {
  def values: IndexedSeq[Derived] = findValues

  case object E2 extends Derived
  case object E3 extends Derived
}

object Main {
  def main(args: Array[String]): Unit = {
    println(Base.values)
    println(Derived.values)
  }
}
