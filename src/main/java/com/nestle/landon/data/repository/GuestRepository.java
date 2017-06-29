package  com.nestle.landon.data.repository;
import  com.nestle.landon.data.entity.Guest;
import org.springframework.data.repository.PagingAndSortingRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {

}