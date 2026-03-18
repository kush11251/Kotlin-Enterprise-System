import java.util.logging.Logger

object Logger {
    private val logger = Logger.getLogger(Logger::class.java.name)

    fun log(message: String) {
        logger.info(message)
    }
}