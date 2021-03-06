package net.codejava;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
 
public interface UserRepository extends JpaRepository<Users, Integer> {
	
	//method returns a single User object based on username
	@Query("SELECT u FROM Users u WHERE u.USER_NAME = ?1")
	Users findByUserName(String userName);
}