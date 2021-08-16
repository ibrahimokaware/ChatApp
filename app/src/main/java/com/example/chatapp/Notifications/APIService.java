package com.example.chatapp.Notifications;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAA6x1P-ZU:APA91bE24lB7jYHOUgIVz32M8vDnFmIUOMFjEthqisJVH1jUieDdvBPbXQhTffWEUp_qAWEJogIDxbREOp7FNREcHV49Ux2tqi8mX9vkvx-1fZqvEG-SVS9QeeSi4kUFKZseRTec_k-A"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
