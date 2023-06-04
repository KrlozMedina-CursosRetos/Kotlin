// Declaramos los valores de nuestras respuestas
const val RESPUESTA_AFIRMATIVA = "✅"
const val RESPUESTA_NEGATIVA = "❌"
const val RESPUESTA_DUDOSA = "？"

// Unimos las respuestas con los valores
val respuesta = mapOf<String, String>(
    "Si" to RESPUESTA_AFIRMATIVA,
    "Es cierto" to  RESPUESTA_AFIRMATIVA,
    "Totalmente" to RESPUESTA_AFIRMATIVA,
    "Sin duda" to RESPUESTA_AFIRMATIVA,
    "Pregunta en otro momento" to RESPUESTA_DUDOSA,
    "No puedo decirte en este momento" to RESPUESTA_DUDOSA,
    "Puede que si o puede que no" to RESPUESTA_DUDOSA,
    "No va a suceder" to RESPUESTA_NEGATIVA,
    "No cuente con ello" to RESPUESTA_NEGATIVA,
    "Definitivamente no" to RESPUESTA_NEGATIVA,
    "No lo creo" to RESPUESTA_NEGATIVA
)

var isGamming : Boolean = true

fun main(args: Array<String>) {
    println("Hola, soy tu bola ocho magica")
    do {
        println("-----------------------------------------------")
        println("Cual de las siguientes opciones desea realizar?")
        println("  1. Realizar una pregunta")
        println("  2. Revisar todas las respuestas")
        println("  3. Salir")

        when(readlnOrNull()) {
            "1" -> realizarPregunta()
            "2" -> mostrarRespuestas()
            "3" -> salir()
            else -> mostrarError()
        }
    } while (isGamming)
}

fun realizarPregunta() : Unit {
    println("Cual es su pregunta?")
    readlnOrNull()
    print("Asi que esa era tu pregunta ... Tu respuesta es ")
    println(respuesta.keys.random())
}

fun mostrarRespuestas() : Unit {
//    respuesta.forEach{respuesta -> println("  $respuesta")}
    println("selecciona una opcion")
    println("  1. Revisar todas las respuestas")
    println("  2. Revisar las respuestas afirmativas")
    println("  3. Revisar las respuestas dudosas")
    println("  4. Revisar las respuestas negativas")

    mostrarRespuestaPorTipo(tipoRespuesta = when(readlnOrNull()) {
            "1" -> "TODOS"
            "2" -> RESPUESTA_AFIRMATIVA
            "3" -> RESPUESTA_DUDOSA
            "4" -> RESPUESTA_NEGATIVA
            else -> "NULL"
        }
    )
}

fun mostrarRespuestaPorTipo(tipoRespuesta: String = "TODOS") {
    when(tipoRespuesta) {
        "TODOS" -> respuesta.forEach { respuesta -> println(respuesta.key + respuesta.value) }
        RESPUESTA_AFIRMATIVA -> respuesta.filterValues { value -> value == RESPUESTA_AFIRMATIVA }
            .forEach() { respuestaAfirmativa -> println(respuestaAfirmativa.key + respuestaAfirmativa.value) }
        RESPUESTA_DUDOSA -> respuesta.filterValues { value -> value == RESPUESTA_DUDOSA }
            .forEach() { respuestaDudosa -> println(respuestaDudosa.key + respuestaDudosa.value) }
        RESPUESTA_NEGATIVA -> respuesta.filterValues { value -> value == RESPUESTA_NEGATIVA }
            .forEach{ respuestaNegativa -> println(respuestaNegativa.key + respuestaNegativa.value) }
        "NULL" -> println("Respuesta no valida, adios")
    }
}

fun salir() : Unit {
    println("Hasta luego")
    isGamming = false;
}

fun mostrarError() : Unit {
    println("Ingrese un datos valido")
}