package controller

import models.Contenedor
import mu.KotlinLogging
import org.jetbrains.kotlinx.dataframe.api.schema
import org.jetbrains.kotlinx.dataframe.api.toDataFrame
import storage.ContenedorStorageCsv
import java.io.File

object ContenedorController {
    private val logger = KotlinLogging.logger {}

    fun procesarData() {
        logger.info("Procesando los datos...")
        var file = System.getProperty("user.dir") + File.separator + ("src") +
                File.separator + ("main") +
                File.separator + ("resources") + File.separator + ("contenedores_varios.csv")

        val contenedores: List<Contenedor> = ContenedorStorageCsv.loadDataFromCsv(File(file))
        val dataFrame = contenedores.toDataFrame()
        println(dataFrame.schema())
    }
}