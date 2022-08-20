package info.hellena.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "users")
public class UserEntity implements User {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "image")
    private String image;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "updated_at")
    private LocalDateTime updatedAt = LocalDateTime.now();

    @Column(name = "company")
    private String company;

    @Column(name = "title")
    private String title;

    @Column(name = "info_confirmed")
    private boolean infoConfirmed;

    @Column(name = "premium")
    private boolean premium;

    @Column(name = "referral", nullable = true)
    private String referral;

    @Column(name = "accepted_marketing")
    private boolean acceptedMarketing;

    @Column(name = "reputation", nullable = true)
    private int reputation;

    @Column(name = "username", unique = true, nullable = true)
    private String userName;

    @Column(name = "bio", unique = true, nullable = true)
    private String bio;

    @Column(name = "twitter", unique = true, nullable = true)
    private String twitter;

    @Column(name = "github", unique = true, nullable = true)
    private String gitHub;

    @Column(name = "portfolio", nullable = true)
    private String portfolio;

    @Column(name = "hashnode", unique = true, nullable = true)
    private String hashnode;

    @Column(name = "timezone")
    private String timezone;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getImage() {
        return image;
    }

    @Override
    public void setImage(String image) {
        this.image = image;
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
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String getCompany() {
        return company;
    }

    @Override
    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean isInfoConfirmed() {
        return infoConfirmed;
    }

    @Override
    public void setInfoConfirmed(boolean infoConfirmed) {
        this.infoConfirmed = infoConfirmed;
    }

    @Override
    public boolean isPremium() {
        return premium;
    }

    @Override
    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    @Override
    public String getReferral() {
        return referral;
    }

    @Override
    public void setReferral(String referral) {
        this.referral = referral;
    }

    @Override
    public boolean isAcceptedMarketing() {
        return acceptedMarketing;
    }

    @Override
    public void setAcceptedMarketing(boolean acceptedMarketing) {
        this.acceptedMarketing = acceptedMarketing;
    }

    @Override
    public int getReputation() {
        return reputation;
    }

    @Override
    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public void setUserName(String username) {
        this.userName = username;
    }

    @Override
    public String getBio() {
        return bio;
    }

    @Override
    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String getTwitter() {
        return twitter;
    }

    @Override
    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    @Override
    public String getGitHub() {
        return gitHub;
    }

    @Override
    public void setGitHub(String github) {
        this.gitHub = github;
    }

    @Override
    public String getPortfolio() {
        return portfolio;
    }

    @Override
    public void setPortfolio(String portfolio) {
        this.portfolio = portfolio;
    }

    @Override
    public String getHashnode() {
        return hashnode;
    }

    @Override
    public void setHashnode(String hashnode) {
        this.hashnode = hashnode;
    }

    @Override
    public String getTimezone() {
        return timezone;
    }

    @Override
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return id.equals(that.id) && referral.equals(that.referral) && userName.equals(that.userName) && twitter.equals(that.twitter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, referral, userName, twitter);
    }
}
