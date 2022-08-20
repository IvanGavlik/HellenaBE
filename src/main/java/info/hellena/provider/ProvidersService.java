package info.hellena.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProvidersService implements ProviderDomain {

    private ProviderRepository repository;

    @Autowired
    public ProvidersService(ProviderRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(Provider p) {
    }

    @Override
    public List<Provider> getAll() {
        return this.repository.findAll().stream()
                .map(el -> (Provider) el)
                .collect(Collectors.toList());
    }
}
