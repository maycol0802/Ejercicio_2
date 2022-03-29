import Serie.Serie
import Videojuego.Videojuego

fun main(args: Array<String>) {

    var serie = arrayOf<Serie>()
    var videojuego = arrayOf<Videojuego>()

    val serie1 = Serie("The good doctor", 5, "Drama", "David Shore")
    val serie2 = Serie("SAO", 3, "ficcion de aventura", "Reki Kawahara")
    val serie3 = Serie("Michael Jordan", 3, "Comedia", "Media docena")
    val serie4 = Serie("Grace Anatomy", 18, "Drama", "Shonda Rhimes")
    val serie5 = Serie("Stacion 19", 5, "Accion", "Stacy McKee")

    val juego1 = Videojuego("Fifa 22", 200f, "deportes", "AE sports")
    val juego2 = Videojuego("Fornite", 200f )
    val juego3 = Videojuego("League of Legends", 400f )
    val juego4 = Videojuego("Valorant", 200f )
    val juego5 = Videojuego("TFT", 300f )

    serie = serie.plus(serie1)
    serie = serie.plus(serie2)
    serie = serie.plus(serie3)
    serie = serie.plus(serie4)
    serie = serie.plus(serie5)

    videojuego = videojuego.plus(juego1)
    videojuego = videojuego.plus(juego2)
    videojuego = videojuego.plus(juego3)
    videojuego = videojuego.plus(juego4)
    videojuego = videojuego.plus(juego5)

    serie2.entrega()
    serie4.entrega()

    juego1.entrega()
    juego3.entrega()
    juego5.entrega()


    var cantidadS = 0
    var cantidadV = 0

    for (i in serie.indices){
        if (serie[i].isEntregado() ){
            cantidadS++
        }

        if (videojuego[i].isEntregado()){
            cantidadV++
        }
    }

    println("Series entregadas: " + cantidadS)
    println("Juegos entregadas: " + cantidadV)

}