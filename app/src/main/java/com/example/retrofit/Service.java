package com.example.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    String BASE_URL =
            "https://dummy.restapiexample.com/api/v1/";
    @GET("employees")
    Call<EmployeeData> getEmpDetails();
}
