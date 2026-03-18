import com.company.app.repositories.UserRepository
import com.company.app.services.UserService

class UserServiceImpl(private val userRepository: UserRepository) : UserService(userRepository) {
    override fun getUsers(): List<User> {
        return super.getUsers()
    }
}