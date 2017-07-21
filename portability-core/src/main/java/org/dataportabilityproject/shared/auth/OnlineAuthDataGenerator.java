package org.dataportabilityproject.shared.auth;

import java.io.IOException;

/** Methods to generate AuthData for online */
public interface OnlineAuthDataGenerator {
  /**
   * Provide a authUrl to redirect the user to authenticate. In the Oauth2 case,
   * this is the authorization code authUrl.
   *  @param id is a client supplied identifier
   */
  AuthFlowInitiator generateAuthUrl(String id) throws IOException;

  /**
   * Generate auth data given the code, identifier, and, optional, initial auth data that was
   * used for earlier steps of the authentication flow.
   * @param authCode The authorization code or oauth verififer after user authorization
   * @param id is a client supplied identifier
   * @param initialAuthData optional data resulting from the initial auth step
   * @param extra optional additional code, password, etc.
   */
  public AuthData generateAuthData(String authCode, String id, AuthData initialAuthData, String extra) throws IOException;
}
