package info.hellena.settings;

public interface AdvancedSettings {

    String getId();

    void setId(String id);

    String getTitle();

    void setTitle(String title);

    String getDescription();

    void setDescription(String description);

    boolean isDefaultEnabledState();

    void setDefaultEnabledState(boolean defaultEnabledState);

}
