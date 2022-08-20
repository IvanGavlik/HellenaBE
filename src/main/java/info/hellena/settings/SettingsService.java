package info.hellena.settings;

import info.hellena.api.dto.IFlags;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SettingsService {

    private AdvancedSettingsRepository advancedSettingsRepository;

    @Autowired
    public SettingsService(AdvancedSettingsRepository advancedSettingsRepository) {
        this.advancedSettingsRepository = advancedSettingsRepository;
    }

    public List<AdvancedSettings> getFeatureAdvancedSettings(boolean loggedIn) {
        IFlags userFeatures = IFlags.defaultIFlags(); // TODO
        List<AdvancedSettings> advancedSettings = new ArrayList<>();

                /*this.advancedSettingsRepository.findAll().stream()
                .sorted(Comparator.comparing(AdvancedSettings::getTitle))
                .collect(Collectors.toList());*/
        return getFeatureAdvancedSettings(userFeatures, advancedSettings);
    }

    private List<AdvancedSettings> getFeatureAdvancedSettings(IFlags userFeatures, List<AdvancedSettings> advancedSettings) {
        // TODO export const getFeatureAdvancedSettings = (
        if (advancedSettings.isEmpty()) {
            advancedSettings.add(new AdvancedSettings() {
                @Override
                public String getId() {
                    return "5";
                }

                @Override
                public void setId(String id) {

                }

                @Override
                public String getTitle() {
                    return "Community";
                }

                @Override
                public void setTitle(String title) {

                }

                @Override
                public String getDescription() {
                    return "Show posts that are recommende";
                }

                @Override
                public void setDescription(String description) {

                }

                @Override
                public boolean isDefaultEnabledState() {
                    return true;
                }

                @Override
                public void setDefaultEnabledState(boolean defaultEnabledState) {

                }
            });
        }
        return advancedSettings;
    }
}
