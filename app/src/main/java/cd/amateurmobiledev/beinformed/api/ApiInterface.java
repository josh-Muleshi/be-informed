package cd.amateurmobiledev.beinformed.api;

import cd.amateurmobiledev.beinformed.models.News;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("everything")
    Call<News> getNews(
            @Query("q") String q,
            @Query("apiKey") String apiKey
    );
}
