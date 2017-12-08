package com.solitudeycq.diycode.ui;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.widget.TextView;

import com.solitudeycq.diycode.BuildConfig;
import com.solitudeycq.diycode.R;

import java.io.IOException;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.textView);
        TokenFetch token = new TokenFetch();
        token.execute();
    }

    class TokenFetch extends AsyncTask<Void, Void, String> {

        @Override
        protected String doInBackground(Void... params) {
            OkHttpClient client = new OkHttpClient();
            RequestBody formBody = new FormBody.Builder()
                    .add("client_id", BuildConfig.DIYCODE_APPLICATION_ID)
                    .add("client_secret", BuildConfig.DIYCODE_PRIVATE_KEY)
                    .add("grant_type", "password")
                    .add("password", "solitude1")
                    .add("username", "solitudeycq")
                    .build();
            Request request = new Request.Builder()
                    .url("https://www.diycode.cc/oauth/token")
                    //.addHeader("content-type","application/x-www-form-urlencoded")
                    .post(formBody)
                    .build();
            try {
                Response response = client.newCall(request).execute();
                if (response.isSuccessful()) {
                    return response.body().string();
                } else {
                    return response.code() + "";
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            if (s != null && s.length() != 0) {
                mTextView.setText(s);
            }
        }
    }
}
