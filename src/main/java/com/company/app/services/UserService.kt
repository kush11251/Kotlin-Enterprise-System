import com.company.app.models.User
import com.company.app.repositories.UserRepository

class UserService(private val userRepository: UserRepository) {
    fun getUsers(): List<User> {
        return userRepository.getUsers()
    }
}