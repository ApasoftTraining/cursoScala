def calcularMuchos(operacion:String,numeros: Int*)=
      {
       if (numeros.length<2) {
            "No se puede calcular con solo un numero"
      }
      else
      {
      var total:Double=0
      if (operacion=="+" || operacion=="-")  total=0 else  total=1
     
      operacion match {
         case "+" => {numeros.foreach(x=>total=total+x)
                      total}
         case "-" => {numeros.foreach(x=>total=total-x)
		      total
			}
         case "*" => {numeros.foreach(x=>total=total*x)
		      total}
         case "/" => {numeros.foreach(x=>total=total/x)
                      total}
         case _ => "Operacion Incorrecta"
      }
      }
      }
