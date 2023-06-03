const val PI = 3.1415;

fun main(args: Array<String>) {
    println("Hello World! " + PI)

    var dinero1 : Int = 10;
    var dinero2 = 20;
    println(dinero1);
    dinero1 = dinero2;
    println(dinero1);

    var nombre = "Krloz";
//    nombre = "Alidio";    val es unicamente de lectura
    println(nombre);

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val boolean : Boolean = true;
    val numeroLargo : Long = 1234567890123456789;
    val double : Double = 2.7689;
    val float : Float = 1.1f;

    val primerValor = 20;
    println(primerValor.compareTo(30))

    nombre = "Carlos"
    val apellido = "Medina"

    println("Mi nombre es $nombre $apellido")

    if (nombre.isNotEmpty()) println("El tamano del nombre es ${nombre.length}") else println("el nombre es nulo")

    val cadena : String = if (nombre.length > 4) {
        "Tu nombre es largo"
    } else {
        "Tu nombre es corto"
    }

    println(cadena)

    val nombreColor = "Cyan"

    when(nombreColor) {
        "Amarillo" -> println("El color del sol")
        "Azul", "Cyan" -> println("El color del cielo")
        else -> println("Sin color :(")
    }

    val code = 200
    val msg = when(code) {
        in 200..299 -> "OK"
        in 400 .. 499 -> "No encontrado"
        in 500 .. 599 -> "Server error"
        else -> "Codigo desconocido"
    }
    println(msg)
}