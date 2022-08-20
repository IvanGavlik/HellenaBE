package info.hellena.token;

public interface TokenDomain {

    void refreshToken(String token) throws RuntimeException;

}
