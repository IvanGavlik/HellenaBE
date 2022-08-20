package info.hellena.provider;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "providers")
public class ProviderEntity implements Provider {

    @Id
    @Column(name = "provider_id", nullable = false, unique = true)
    private String providerId;

    @Column(name = "provider", nullable = false, unique = true)
    private String provider;

    @Column(name = "user_id", nullable = false, unique = true)
    private String userId;

    @Column(name = "created_at")
    private LocalDateTime createdAt;


    @Override
    public String getProviderId() {
        return providerId;
    }

    @Override
    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    @Override
    public String getProvider() {
        return provider;
    }

    @Override
    public void setProvider(String provider) {
        this.provider = provider;
    }

    @Override
    public String getUserId() {
        return userId;
    }

    @Override
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProviderEntity that = (ProviderEntity) o;
        return providerId.equals(that.providerId) && provider.equals(that.provider) && userId.equals(that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providerId, provider, userId);
    }
}
