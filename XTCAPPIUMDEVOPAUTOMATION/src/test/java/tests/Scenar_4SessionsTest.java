package tests;

import global.BaseTestFixture;
import org.junit.Test;
import pages.FeedPage;
import pages.SessionsPage;

/**
 * Created by ethand on 1/10/17.
 */
public class Scenar_4SessionsTest extends BaseTestFixture {

    @Test
    public void testNavigateToSessions() {
        new FeedPage()
                .selectMenuItem("Sessions");

        new SessionsPage();
    }

    @Test
    public void testSearchForSession() {
        new FeedPage()
                .selectMenuItem("Sessions");

        new SessionsPage()
            .search("xaml")
            .verifyTopResult("Mastering XAML in Xamarin.Forms");
    }


    @Test
    public void testNavigateToSessionswithSesscion() {
        new FeedPage()
                .selectMenuItem("Sessions");

        new SessionsPage();
    }

    @Test
    public void testSearchForSessionWithXAML() {
        new FeedPage()
                .selectMenuItem("Sessions");

        new SessionsPage()
                .search("xaml")
                .verifyTopResult("Mastering XAML in Xamarin.Forms");
    }
}
