package com.example.infs3634assignment.activities;

import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import androidx.appcompat.app.AppCompatActivity;

import com.example.infs3634assignment.R;
import com.google.gson.Gson;

public class FlashcardRecyclerActivity extends AppCompatActivity {

    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flashcard);

        title = findViewById(R.id.flashcardTitle);

        final RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());

        String url = "curl -G https://images-api.nasa.gov/search\n" +
                "--data-urlencode \"q=apollo 11\"\n" +
                "--data-urlencode \"description=moon landing\"\n" +
                "--data-urlencode \"media_type=image\" |\n" +
                "python -m json.tool";
   //     Response.Listener<String> responseListener = new Response.Listener<String>() {
//            @Override
//            public void onResponse(String response) {
//                Gson gson = new Gson();
//                FlashcardResponse
//            }
////        }
//
//        title.setText("a");
   }
}
