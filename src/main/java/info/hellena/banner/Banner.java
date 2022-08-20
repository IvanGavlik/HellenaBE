package info.hellena.banner;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface Banner {

    LocalDateTime getTimestamp();

    void setTimestamp(LocalDateTime timestamp);

    String getTitle();

    void setTitle(String title);

    String getSubtitle();

    void setSubtitle(String subtitle);

    String getCta();

    void setCta(String cta);

    String getUrl();

    void setUrl(String url);

    String getTheme();

    void setTheme(String theme);
}
