package info.hellena.source;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "source_feed")
public class SourceFeedEntity implements SourceFeed {

    @Id
    @Column(name = "feed")
    private String feed;

    @Column(name = "sourceId")
    private String sourceId;

    @Override
    public String getFeed() {
        return feed;
    }

    @Override
    public void setFeed(String feed) {
        this.feed = feed;
    }

    @Override
    public String getSourceId() {
        return sourceId;
    }

    @Override
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SourceFeedEntity that = (SourceFeedEntity) o;
        return Objects.equals(feed, that.feed) && Objects.equals(sourceId, that.sourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feed, sourceId);
    }
}
