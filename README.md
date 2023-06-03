# Kotlin

## Operaciones con los tipos de datos en Kotli

En Kotlin las operaciones son traducidas a funciones interiormente por el
compilador. La operación val tercerValor = primerValor + segundoValor es lo
mismo que decir tercerValor = primerValor.plus(segundoValor).

En la siguiente tabla te voy a dejar las operaciones que vas a poder
realizar con los distintos tipos de datos y si te encuentras con alguno
que no permita realizar esa operación puedes crearla por tu cuenta.
Recuerda que Kotlin te permite extender el lenguaje para aprovechar estas
funcionalidades.

### Operaciones más utilizadas

Expresion | Funcion     | Operator Fun
----------|-------------|-------------
a + b   | c = a + b   | public operator fun plus(other: Int): Int
a - b   | c = a - b   | public operator fun minus(other: Int): Int
a * b   | c = a * b   | public operator fun times(other: Int): Int
a / b   | c = a / b   | public operator fun div(other: Int): Int
a % b   | c = a % b   | public operator fun rem(other: Int): Int
a++     | c = a++     | public operator fun inc(): Int
a–      | c = a–      | public operator fun dec(): Int
a > b   | c = a > b   | public override operator fun compareTo(other: Int): Int
a < b   | c = a < b   | public override operator fun compareTo(other: Int): Int
a >= b  | c = a >= b  | public override operator fun compareTo(other: Int): Int
a <= b  | c = a <= b  | public override operator fun compareTo(other: Int): Int
a != b  | c = a != b  |	public open operator fun equals(other: Any?): Boolean

Dependiendo del tipo de dato que tengas podrás utilizar todos o solamente
algunas de estas operaciones, por ejemplo si tienes una variable del tipo
de dato String no vas a poder dividirla, a menos que tú crees esa función.
Sin embargo, sí vas a poder sumar dos variables del tipo de dato String
para obtener el valor de dicha suma.

Con esto espero que hayas obtenido una idea sobre cómo funcionan las
operaciones, queda de parte de ti si prefieres utilizar la versión larga
del operator fun o el operador directamente.

Ten en cuenta que si las operator fun se inventaron para que puedas reducir
tu código a operaciones con símbolos ¿por algo será, no?