package info.hellena.provider;

import java.util.List;

public interface ProviderDomain {

    void save(Provider p);

    List<Provider> getAll();

}
