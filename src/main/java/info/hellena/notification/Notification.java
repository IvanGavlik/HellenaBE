package info.hellena.notification;

import java.time.LocalDateTime;

public interface Notification {

    LocalDateTime getTimestamp();

    void setTimestamp(LocalDateTime timestamp);

    String getHtml();

    void setHtml(String html);

}
