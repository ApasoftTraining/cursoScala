def calcular(operacion:String,numero1: Int, numero2: Int)=
      {
       if (numero2==0) {
            "No se puede dividir por 0"
      }
      else
      {
      operacion match {
         case "+" => numero1+numero2
         case "-" => numero1-numero2
         case "*" => numero1*numero2
         case "/" => numero1/numero1
         case _ => "Operacion Incorrecta"
      }
      }
      }



