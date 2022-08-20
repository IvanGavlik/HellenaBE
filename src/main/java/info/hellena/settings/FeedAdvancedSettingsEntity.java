package info.hellena.settings;

import javax.persistence.*;
import java.util.Objects;

// TODO feed
/*
   @ManyToOne(() => Feed, {
    lazy: true,
    onDelete: 'CASCADE',
  })
  feed: Promise<Feed>;
* */
@Entity
@Table(name = "feed_advanced_settings")
public class FeedAdvancedSettingsEntity implements FeedAdvancedSettings {

    @Id
    @Column(name = "feedId")
    private String feedId;

    @Column(name = "advancedSettingsId")
    private String advancedSettingsId;

/*
  TODO
  @ManyToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.REMOVE
    )
    @JoinColumn(name = "id")
    private Set<AdvancedSettingsEntity> advancedSettings;

 */

    @Column(name = "enabled")
    private boolean enabled;

    @Override
    public String getFeedId() {
        return feedId;
    }

    @Override
    public void setFeedId(String feedId) {
        this.feedId = feedId;
    }

    @Override
    public String getAdvancedSettingsId() {
        return advancedSettingsId;
    }

    @Override
    public void setAdvancedSettingsId(String advancedSettingsId) {
        this.advancedSettingsId = advancedSettingsId;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FeedAdvancedSettingsEntity that = (FeedAdvancedSettingsEntity) o;
        return feedId.equals(that.feedId) && advancedSettingsId.equals(that.advancedSettingsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feedId, advancedSettingsId);
    }
}
