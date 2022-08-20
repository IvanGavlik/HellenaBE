package info.hellena.notification;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Objects;

//@Entity
// @Table(name = "notification")
public class NotificationEntity implements Notification {

    @Id
    @Column(name = "timestamp")
    private LocalDateTime timestamp;

    @Column(name = "html")
    private String html;

    @Override
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String getHtml() {
        return html;
    }

    @Override
    public void setHtml(String html) {
        this.html = html;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotificationEntity that = (NotificationEntity) o;
        return timestamp.equals(that.timestamp) && html.equals(that.html);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, html);
    }
}
