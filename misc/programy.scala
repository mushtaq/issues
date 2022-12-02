//> using scala "3.2.0"
//> using lib "com.lihaoyi::os-lib:0.7.8"
//> using lib "org.scalameta::munit:1.0.0-M1"

def filesByExtension(extension: String, dir: os.Path = os.pwd): Seq[os.Path] =
  os.walk(dir).filter { f =>
    f.last.endsWith(s".$extension") && os.isFile(f)
  }

//class TestSuite extends munit.FunSuite {
//  test("hello") {
//    val expected = Seq("files.scala", "files.test.scala")
//    val obtained = filesByExtension("scala").map(_.last)
//    assertEquals(obtained, expected)
//  }
//}

@main
def run(): Unit =
  Class
//    .forName("Xyz$")
    .forName("scripty$")
    .getField("MODULE$")
//    .getDeclaredConstructor()
    .get(null)
    .asInstanceOf[scripty.type]
    .se()
//    .main(Array.empty)
