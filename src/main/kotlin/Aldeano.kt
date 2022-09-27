class Aldeano(var civilizacion:String = "", var rey:String = "", var salud:Int = 100) {


    override fun toString(): String {
        return "Aldeano(civilizacion='$civilizacion', rey='$rey', salud=$salud)"
    }

    fun extraer(m:Mina):String{
        var cad = ""
        var alm:Int
        if (m.cantera > 0){
            m.cantera--
            cad = "${this.civilizacion} sacando items"
        }else{
            cad = "La cantera está seca, no hay nada más"
        }

        return cad
    }

    fun sumarAlmacen(a:Int):Int{
        var al:Int
        al = a + 1
        return al
    }

    fun convertir(e:Aldeano){
        e.civilizacion = "Bizantino"
        e.rey = "Constantino II"
        e.salud = 250
    }
}