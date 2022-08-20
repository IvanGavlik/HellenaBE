package info.hellena.api.dto;

public record RemoteSettings(boolean openNewTab,
                             boolean showOnlyUnreadPosts,
                             String theme, // 'darcula' | 'bright' | 'auto';
                             String spaciness, // 'eco' | 'roomy' | 'cozy';
                             boolean insaneMode,
                             boolean showTopSites,
                             boolean sidebarExpanded,
                             boolean companionExpanded,
                             boolean sortingEnabled,
                             boolean optOutWeeklyGoal,
                             boolean optOutCompanion,
                             boolean autoDismissNotifications,
                             String[] customLinks
                             ) {
}
