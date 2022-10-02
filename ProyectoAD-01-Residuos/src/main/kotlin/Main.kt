import controller.ContenedorController
import controller.ResiduoController
import kotlin.system.exitProcess

/**
 * Función main principal
 * @author Daniel Carmona y Jeremy Ramos
 * @version V0.1
 * @param args Argumentos necesarios que se pasaran por consola.
 */
fun main(args: Array<String>) {
//    init(args)
    ResiduoController.procesarData()
    ContenedorController.procesarData()
}

/**
 * Función para comprobar los parámetros indicados y permitir la
 * funcionalidad del programa.
 * @param args Argumentos necesarios que se reciben del main.
 */
fun init(args: Array<String>) {
    if (args.isNotEmpty()) {
        if (args[0].equals("parser")) println("Esto es el parser")
        else if (args[0].equals("resumen")) println("Esto es el resume")
        else {
            println("Parámetros incorrectos")
            exitProcess(0)
        }

    } else {
        println("Opción incorrecta.")
        exitProcess(0)
    }
}