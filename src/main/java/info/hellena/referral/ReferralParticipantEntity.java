package info.hellena.referral;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "referral_participants")
public class ReferralParticipantEntity implements ReferralParticipant {

    @Id
    @Column(name = "contest_id")
    private String contestId;

    @Column(name = "user_id", nullable = false)
    private String userId;

    @Column(name = "referrals")
    private int referrals;

    @Column(name = "eligible")
    private boolean eligible;

    @Override
    public String getContestId() {
        return contestId;
    }

    @Override
    public void setContestId(String id) {
        this.contestId = id;
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
    public int getReferrals() {
        return referrals;
    }

    @Override
    public void setReferrals(int referrals) {
        this.referrals = referrals;
    }

    @Override
    public boolean isEligible() {
        return eligible;
    }

    @Override
    public void setEligible(boolean eligible) {
        this.eligible = eligible;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReferralParticipantEntity that = (ReferralParticipantEntity) o;
        return contestId.equals(that.contestId) && userId.equals(that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contestId, userId);
    }
}
