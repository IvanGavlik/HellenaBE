package info.hellena.provider;

import java.time.LocalDateTime;

public interface Provider {

    String getUserId();

    void setUserId(String userId);

    String getProvider();

    void setProvider(String provider);

    String getProviderId();

    void setProviderId(String providerId);

    LocalDateTime getCreatedAt();

    void setCreatedAt(LocalDateTime createdAt);

}
