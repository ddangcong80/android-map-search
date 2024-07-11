package campus.tech.kakao.map.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object KakaoLocalObject {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://dapi.kakao.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(KakaoLocalService::class.java)
}