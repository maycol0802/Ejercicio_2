package Videojuego

import Interface.Entregable

class Videojuego : Entregable {
    var titulo : String = ""
    var horasEstimadas : Float = 10.0f
    var entregado : Boolean = false
    var genero : String = ""
    var compañia : String = ""

    constructor()

    constructor(titulo : String, horasEstimadas : Float){
        this.titulo = titulo
        this.horasEstimadas = horasEstimadas
    }

    constructor(titulo : String, horasEstimadas: Float, genero : String, compañia : String){
        this.titulo = titulo
        this.horasEstimadas = horasEstimadas
        this.genero = genero
        this.compañia = compañia
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