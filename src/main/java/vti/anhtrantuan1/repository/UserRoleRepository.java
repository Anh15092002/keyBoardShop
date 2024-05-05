package vti.anhtrantuan1.repository;

import vti.anhtrantuan1.domain.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long>{
	
	@Query(value = "select top 1 * from user_role where customer_id = ?", nativeQuery = true)
	Optional<UserRole> findByCustomerId(Long customerId);
}
