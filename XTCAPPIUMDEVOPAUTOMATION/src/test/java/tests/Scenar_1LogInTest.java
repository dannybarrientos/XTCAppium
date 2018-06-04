package tests;

import global.BaseTestFixture;
import org.junit.Test;
import pages.LoginPage;

/**
 * Created by matisseh on 2/8/17.
 */
public class Scenar_1LogInTest extends BaseTestFixture{

    @Override
    public void beforeEachTest()
    {
        start();
    }

    @Test
    public void testLogInWithFakeCredentials() {
        new LoginPage()
                .enterCredentials("xtc@xamarin.com", "fake")
                .tapSignInButton();
    }

    @Test
    public void testLogInWithCredentials() {
        new LoginPage()
                .enterCredentials("xtc@xamarin.com", "fake")
                .tapSignInButton();
    }
    @Test
    public void testLogInCredentialsFake() {
        new LoginPage()
                .enterCredentials("xtc@xamarin.com", "fake")
                .tapSignInButton();
    }
}
