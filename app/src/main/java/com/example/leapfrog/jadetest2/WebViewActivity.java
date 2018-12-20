package com.example.leapfrog.jadetest2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {

  private static final String EXTRA_TEMPLATE = "extra_template";
  WebView webView;

  public static Intent getIntent(Context context, String htmlTemplate) {
    Intent intent = new Intent(context, WebViewActivity.class);
    intent.putExtra(EXTRA_TEMPLATE, htmlTemplate);
    return intent;
  }

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_webview);

    webView = findViewById(R.id.web_view);
    webView.getSettings().setBuiltInZoomControls(true);
    webView.getSettings().setDisplayZoomControls(true);

    String htmlTemplate = getIntent().getStringExtra(EXTRA_TEMPLATE);

    Log.i("TEMPLATE", htmlTemplate);

    webView.loadDataWithBaseURL("", htmlTemplate, "text/html", "utf-8", "");
    //webView.loadData( htmlTemplate, "text/html", "utf-8");

  }
}
