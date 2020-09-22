package guru.springframework.msscbeerservice.repository;

import guru.springframework.msscbeerservice.model.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
