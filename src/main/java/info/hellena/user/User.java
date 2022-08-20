package info.hellena.user;

import java.time.LocalDateTime;

public interface User {

    String getId();

    void setId(String id);

    String getName();

    void setName(String name);

    String getEmail();

    void setEmail(String email);

    String getImage();

    void setImage(String image);

    LocalDateTime getCreatedAt();

    void setCreatedAt(LocalDateTime createdAt);

    LocalDateTime getUpdatedAt();

    void setUpdatedAt(LocalDateTime updateAt);

    String getCompany();

    void setCompany(String company);

    String getTitle();

    void setTitle(String title);

    boolean isInfoConfirmed();

    void setInfoConfirmed(boolean infoConfirmed);

    boolean isPremium();

    void setPremium(boolean premium);

    String getReferral();

    void setReferral(String referral);

    boolean isAcceptedMarketing();

    void setAcceptedMarketing(boolean acceptedMarketing);

    int getReputation();

    void setReputation(int reputation);

    String getUserName();

    void setUserName(String userName);

    String getBio();

    void setBio(String bio);

    String getTwitter();

    void setTwitter(String twitter);

    String getGitHub();

    void setGitHub(String gitHub);

    String getPortfolio();

    void setPortfolio(String portfolio);

    String getHashnode();

    void setHashnode(String hashnode);

    String getTimezone();

    void setTimezone(String timezone);
}
