//> using scala "3.2.1"
//> using lib "io.bullet::borer-derivation:1.10.1"

import io.bullet.borer.Json
import io.bullet.borer.derivation.MapBasedCodecs
import io.bullet.borer.Decoder

sealed trait Base

case class A(x: Int) extends Base
case class B()       extends Base
case object C        extends Base

implicit lazy val baseCodecs: Decoder[Base] = MapBasedCodecs.deriveAllDecoders

val jsonA =
  """
    |{"A":{"x":100, "extra": "should be ignored"}}
    |""".stripMargin

val jsonB =
  """
    |{"B":{"extra": "should be ignored"}}
    |""".stripMargin

val jsonC =
  """
    |{"C":{"extra": "should be ignored"}}
    |""".stripMargin


println(Json.decode(jsonA.getBytes).to[Base].value) // A(100)
println(Json.decode(jsonB.getBytes).to[Base].value) // error as below
println(Json.decode(jsonC.getBytes).to[Base].value) // error as below

