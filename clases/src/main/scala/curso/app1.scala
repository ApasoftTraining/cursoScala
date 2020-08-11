package curso

class Alumno ( nombre: String,  apellidos:String)
{
  var edad:Int=_
  def visualizar(): Unit =
  {
    println(nombre)
    println(apellidos)
    println(edad)
  }

}



object Principal
{
  def main(args: Array[String]): Unit = {

    var alumno1=new Alumno("alberto","Perez")
    print(alumno1)
    println(alumno1.toString)
    alumno1.edad=10
    println(alumno1.edad)
    alumno1.visualizar()
    alumno1.


  }



}



