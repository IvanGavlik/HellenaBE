package info.hellena.settings;

import java.util.List;

public interface FeedAdvancedSettings {

    String getFeedId();

    void setFeedId(String feedId);

    String getAdvancedSettingsId();

    void setAdvancedSettingsId(String advancedSettingsId);

    boolean isEnabled();

    void setEnabled(boolean enabled);
}
