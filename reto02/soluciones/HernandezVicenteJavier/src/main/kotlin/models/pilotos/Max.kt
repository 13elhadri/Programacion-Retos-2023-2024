package org.example.models.pilotos

import org.example.models.escuderias.RedBull

/**
 * Max Verstappen, piloto de RedBull
 * @property probVueltaRapida probabilidad de realizar una vuelta rápida
 */
class Max(nombre: String = "Verstappen", override val probVueltaRapida: Int = 10) :
    RedBull(nombre, fila = 0, columna = 0, probAccidente = 1){
}