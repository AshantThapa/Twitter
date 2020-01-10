package ashant.twitter.api;

import java.util.List;

import ashant.twitter.model.Posts;
import ashant.twitter.server_response.ImageResponse;
import coventry.aashish.twitter.model.Posts;
import coventry.aashish.twitter.server_response.ImageResponse;
import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface PostAPI {
    @GET("posts")
    Call<List<Posts>> getPosts();

    @Multipart
    @POST("upload")
    Call<ImageResponse> uploadImage(@Part MultipartBody.Part img);

    @POST("posts/add")
    Call<Void> addPosts(@Body Posts posts);

}
