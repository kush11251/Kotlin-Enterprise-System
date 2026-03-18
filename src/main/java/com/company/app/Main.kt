import com.company.app.controllers.UserController
import com.company.app.services.UserService

fun main() {
    val userService = UserService()
    val userController = UserController(userService)
    userController.start()
}