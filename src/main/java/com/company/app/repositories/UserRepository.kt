import com.company.app.models.User

interface UserRepository {
    fun getUsers(): List<User>
}