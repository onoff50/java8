package com;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.magic.ShapeModule;
import com.rest.StudentService;
import com.rest.dto.Student;
import com.shape.DrawShape;
import com.shape.Shape;
import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;

import java.util.Date;
import java.util.List;

/**
 * Created by neerajsi on 22/03/15.
 */
public class MyMain {


//    public static void main(String[] args) {
//    /*
//     * Guice.createInjector() takes your Modules, and returns a new Injector
//     * instance. Most applications will call this method exactly once, in their
//     * main() method.
//     */
//        Injector injector = Guice.createInjector(new ShapeModule());
//
//        DrawShape sh = injector.getInstance(DrawShape.class);
//
//        sh.draw();
//    }


    private static final String API_URL = "http://127.0.0.1:8080";

    public static void main(String... args) {
// Create a very simple REST adapter which points the GitHub API endpoint.
        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(API_URL).setConverter(getGsonCovertor()).build();

// Create an instance of our GitHub API interface.
        StudentService service = restAdapter.create(StudentService.class);

// Fetch and print a list of the contributors to this library.
        List<Student> students = service.getAllStudents();

        for (Student s : students) {
            System.out.println(s);
        }
    }

    public static GsonConverter getGsonCovertor() {

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .registerTypeAdapter(Date.class, new DateTypeAdapter())
                .create();

        return new GsonConverter(gson);
    }
}

