import com.company.app.models.User
import com.company.app.services.UserService

class UserController(private val userService: UserService) {
    fun start() {
        val users = userService.getUsers()
        users.forEach { println(it) }
    }
}