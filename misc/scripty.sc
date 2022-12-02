//> using scala "3.2.0"
//> using lib "com.lihaoyi::os-lib:0.7.8"
//> using lib "org.scalameta::munit:1.0.0-M1"

def filesByExtension(extension: String, dir: os.Path = os.pwd): Seq[os.Path] =
  os.walk(dir).filter { f =>
    f.last.endsWith(s".$extension") && os.isFile(f)
  }

def se() = "scriscri"

def lambda(f: Int => Any) =
  f(100)

lambda { input =>
  println(input * 8)
}
