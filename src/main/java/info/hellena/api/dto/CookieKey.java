package info.hellena.api.dto;

import java.util.Optional;

public enum CookieKey {

    DA_S("das", "session"),
    DA_2("da2", "tracking"),
    DA_3("da3", "auth"),
    DA_4("da4", "referral"),
    DA_5("da5", "refreshToken"),
    KRATOS("ory_kratos_session", "kratos");
    private final String id;
    private final String description;

    private CookieKey(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public static Optional<CookieKey> of(String name) {
        if (name.isEmpty()) {

        }
        switch (name) {
            case "das":
                return Optional.of(DA_S);
            case "da2":
                return Optional.of(DA_2);
            case "da3":
                return Optional.of(DA_3);
            case "da4":
                return Optional.of(DA_4);
            case "da5":
                return Optional.of(DA_5);
            case "ory_kratos_session":
                return Optional.of(KRATOS);
            default:
                System.out.println("CookieKey not created of " + name);
                return Optional.empty();
        }
    }
}

