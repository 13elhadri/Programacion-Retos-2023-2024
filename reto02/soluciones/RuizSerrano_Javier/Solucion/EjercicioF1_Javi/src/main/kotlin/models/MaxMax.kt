package org.example.models

class MaxMax: RedBull() {
    private val posAccidente=5
    override var nombre ="Max Verstappen"
    override var posicion= Array(2){0}
    override val fila = 0
    override var columna = 0
    override var vuelta=0
    override var pit1=(1..3).random()
    override var pit2=(1..3).random()
    override var pit3=(1..3).random()
    val totalPits =(pit1 +pit2 + pit3)
}