package info.hellena.provider;


import info.hellena.provider.ProviderEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProviderRepository extends CrudRepository<ProviderEntity, String> {
    List<ProviderEntity> findAll();
}
