package info.hellena.tabCategory;

import java.time.LocalDateTime;

public interface TabCategory {

    String getId();

    void setId(String id);

    String getEmoji();

    void setEmoji(String emoji);

    String getTitle();

    void setTitle(String title);

    LocalDateTime getCreatedAt();

    void setCreatedAt(LocalDateTime createdAt);

    LocalDateTime getUpdatedAt();

    void setUpdatedAt(LocalDateTime updatedAt);

    String getTags();

    void setTags(String tags);

}
