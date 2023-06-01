package ra.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ra.model.Customer;

public interface ICustomerRepository extends PagingAndSortingRepository<Customer,Long> {
}
