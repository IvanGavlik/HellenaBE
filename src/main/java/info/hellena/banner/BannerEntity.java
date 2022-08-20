package info.hellena.banner;

import info.hellena.banner.Banner;

import java.time.LocalDateTime;

public class BannerEntity implements Banner {

    private LocalDateTime timestamp;
    private String title;
    private String subtitle;
    private String cta;
    private String url;
    private String theme;

    @Override
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
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
    public String getSubtitle() {
        return subtitle;
    }

    @Override
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    @Override
    public String getCta() {
        return cta;
    }

    @Override
    public void setCta(String cta) {
        this.cta = cta;
    }

    @Override
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String getTheme() {
        return theme;
    }

    @Override
    public void setTheme(String theme) {
        this.theme = theme;
    }
}
