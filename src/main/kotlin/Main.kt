import kotlin.random.Random

fun main(args: Array<String>) {
    var m = Factoria.minaOro()
    var cont = 1
    var cadena:String
    var alEsp = 0
    var alBiz = 0
    var p:Int
    var convertido:Boolean

    do {
        m.aldeanos.forEach(){aldeano ->
            cadena = aldeano.extraer(m)
            if (aldeano.civilizacion.equals("Español")){
                if(m.cantera > 0) {
                    alEsp = aldeano.sumarAlmacen(alEsp)
                }
            }else{
                if(m.cantera > 0) {
                    alBiz = aldeano.sumarAlmacen(alBiz)
                }
            }
            println(cadena)
        }
        if (cont % 2 == 0){
            p = Random.nextInt(0,101)
            if(p <= 40){
                m.aldeanos.add(Factoria.aldeanoEspanol())
                println("Un español ha entrado en la mina")
            }
            if(p >= 80){
                m.aldeanos.add(Factoria.aldeanoBizantino())
                println("Un bizantino ha entrado en la mina")
            }
        }
        if(cont % 5 == 0){
            convertido = false
            m.aldeanos.forEach(){aldeano ->
                if(!convertido){
                    if (aldeano.civilizacion.equals("Español")){
                        /*
                        m.aldeanos.add(Factoria.aldeanoBizantino())
                        m.aldeanos.remove(aldeano)
                        */
                        aldeano.convertir(aldeano)
                        println("Un cura bizantino ha convertido a un español, ahora está con ellos")
                        convertido = true
                    }
                }
            }
            println("La simulación va por $cont segundos")
        }
        println("Almacen español $alEsp")
        println("Almacen bizantino $alBiz")
        cont++
    }while (cont <60)


}