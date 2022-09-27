class Mina(var tipo:String = "Oro", var cantera:Int = 500) {

    var aldeanos:ArrayList<Aldeano> = ArrayList()

    override fun toString(): String {
        return "Mina(tipo='$tipo', cantera=$cantera)"
    }
}