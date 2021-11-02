package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Service.BASE_URL)
                .addConverterFactory
                        (GsonConverterFactory.create(new Gson())).build();
        Service service = retrofit.create(Service.class);

        Call<EmployeeData> employeeData = service.getEmpDetails();
        employeeData.enqueue(new Callback<EmployeeData>() {
            @Override
            public void onResponse(Call<EmployeeData> call, Response<EmployeeData> response) {
                List<Data> list = new ArrayList<Data>(response.body().getData());
                for (Data data: list)
                {
                    Log.d("data_class","emp_id: "+data.getId()+", "+
                            "emp_name: "+data.getEmployeeName()+", "+
                            "emp_age: "+data.getEmployeAge()+", "+
                            "emp_salary: "+data.getEmployeeSalary());
                }
            }

            @Override
            public void onFailure(Call<EmployeeData> call, Throwable t) {

            }
        });

    }
}