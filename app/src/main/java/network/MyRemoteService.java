package network;

import java.util.List;

import model.Item;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Ney Casilla on 8/5/2017.
 * items in terface
 */

public interface MyRemoteService {
    @GET("example/items.json")
    Call<List<Item>> getItems();
    @FormUrlEncoded
    @POST("example/form.php")
    Call<FormResponse> postForm(@Field("name") String name);
}
