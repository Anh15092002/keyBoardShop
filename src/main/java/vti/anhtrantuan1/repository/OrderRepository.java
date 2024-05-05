package vti.anhtrantuan1.repository;


import vti.anhtrantuan1.domain.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{
	@Query(value = "select * from orders where customer_id = ?1 and status = ?2", nativeQuery = true)
	Page<Order> findByCustomerId(int id, int status, Pageable pageable);
	
	@Query(value = "select * from orders where status = ?", nativeQuery = true)
	Page<Order> findByStatus(int status, Pageable pageable);
	
	Page<Order> findByorderId(int id, Pageable pageable);
}
