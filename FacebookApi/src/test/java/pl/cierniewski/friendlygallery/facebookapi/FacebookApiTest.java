package pl.cierniewski.friendlygallery.facebookapi;

import org.junit.Test;

import javax.inject.Inject;

import pl.cierniewski.friendlygallery.facebookapi.model.GetAlbumsResponse;
import pl.cierniewski.friendlygallery.facebookapi.model.GetFriendsResponse;
import pl.cierniewski.friendlygallery.facebookapi.model.GetPhotosResponse;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;


public class FacebookApiTest extends BaseApiTest {

    @Inject
    FacebookApi mFacebookApi;

    @Test
    public void testGetFriends() throws Exception {
        final GetFriendsResponse getFriendsResponse = mFacebookApi.getFriends("me", 1000).execute();
        assertThat(getFriendsResponse, is(notNullValue()));
    }

    @Test
    public void testPhotos() throws Exception {
        final GetPhotosResponse getPhotosResponse = mFacebookApi.getPhotos("10202936452027406", 100).execute();
        assertThat(getPhotosResponse, is(notNullValue()));
    }

    @Test
    public void testAlbums() throws Exception {
        final GetAlbumsResponse getAlbumsResponse = mFacebookApi.getAlbums("10202929462052661", 100).execute();
        assertThat(getAlbumsResponse, is(notNullValue()));
    }
}


