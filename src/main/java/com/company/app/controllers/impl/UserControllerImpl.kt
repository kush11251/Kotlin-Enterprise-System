import com.company.app.controllers.UserController
import com.company.app.services.UserService

class UserControllerImpl(private val userService: UserService) : UserController(userService) {
    override fun start() {
        super.start()
        println("User Controller Impl started")
    }
}