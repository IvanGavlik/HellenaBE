package info.hellena.referral;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "referral_contests")
public class ReferralContestsEntity implements ReferralContests {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "start_at")
    private LocalDateTime startAt;

    @Column(name = "end_at")
    private LocalDateTime endAt;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public LocalDateTime getStartAt() {
        return startAt;
    }

    @Override
    public void setStartAt(LocalDateTime startAt) {
        this.startAt = startAt;
    }

    @Override
    public LocalDateTime getEndAt() {
        return endAt;
    }

    @Override
    public void setEndAt(LocalDateTime endAt) {
        this.endAt = endAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReferralContestsEntity that = (ReferralContestsEntity) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
