package info.hellena.referral;

public interface ReferralParticipant {

    String getContestId();

    void setContestId(String id);

    String getUserId();

    void setUserId(String userId);

    int getReferrals();

    void setReferrals(int referrals);

    boolean isEligible();

    void setEligible(boolean eligible);
}
