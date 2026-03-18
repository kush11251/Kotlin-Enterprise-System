import com.company.app.models.User
import com.company.app.repositories.UserRepository

class UserRepositoryImpl : UserRepository {
    override fun getUsers(): List<User> {
        // Simulating data retrieval
        return listOf(User(1, "John Doe"), User(2, "Jane Doe"))
    }
}