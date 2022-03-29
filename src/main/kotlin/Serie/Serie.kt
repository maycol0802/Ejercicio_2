package Serie

import Interface.Entregable

class Serie : Entregable{
    var titulo : String = ""
    var numTemporadas : Int = 3
    var entregado : Boolean = false
    var genero : String = ""
    var creador : String = ""

    constructor()

    constructor(titulo : String, creador: String){
        this.titulo = titulo
        this.creador = creador
    }

    constructor(titulo : String, numTemporada : Int, genero : String, creador : String){
        this.titulo = titulo
        this.numTemporadas = numTemporada
        this.genero = genero
        this.creador = creador
    }

    override fun entrega() {
        this.entregado = true
    }

    override fun devolver() {
        this.entregado = false
    }

    override fun isEntregado() : Boolean{
        return entregado
    }


}