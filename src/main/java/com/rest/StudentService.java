package com.rest;

import com.rest.dto.Student;
import retrofit.http.GET;
import retrofit.http.Headers;

import java.util.List;

/**
 * Created by neerajsi on 22/03/15.
 */
public interface StudentService {


    @GET("/student")
    @Headers({
            "User-Agent: Retrofit-Sample-App"
    })
    List<Student> getAllStudents();
}
