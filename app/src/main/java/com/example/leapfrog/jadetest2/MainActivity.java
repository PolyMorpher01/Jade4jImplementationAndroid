package com.example.leapfrog.jadetest2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import de.neuland.jade4j.Jade4J;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

  Button btnRol, btnAob;

  private final static String SIGNATURE_IMAGE_WIDTH = "25%";
  private final static String JADE_FILE_PATH_ROL = "file:///android_asset/rol.jade";
  private final static String JADE_FILE_ROL = "rol.jade";
  private final static String JADE_FILE_AOB = "aob.jade";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    btnRol = findViewById(R.id.btn_1);
    btnAob = findViewById(R.id.btn_2);

    btnRol.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {

        String htmlRender = getRenderHtmlRol(getJadeModelRol());

        startActivity(WebViewActivity.getIntent(MainActivity.this, htmlRender));
      }
    });

    btnAob.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        String htmlRender = getRenderHtmlAob(getJadeModelAob());

        startActivity(WebViewActivity.getIntent(MainActivity.this, htmlRender));
      }
    });
  }

  private String getRenderHtmlRol(Map<String, Object> model) {
    try {
      //return Jade4J.render(getAssetFile(JADE_FILE_PATH_ROL), model);
      return Jade4J.render(getAssetFile(JADE_FILE_ROL), model);
    } catch (IOException e) {
      e.printStackTrace();

      Log.e("File", e.getLocalizedMessage());
    }
    return "";
  }

  private String getRenderHtmlAob(Map<String, Object> model) {
    try {
      return Jade4J.render(getAssetFile(JADE_FILE_AOB), model);
    } catch (IOException e) {
      e.printStackTrace();

      Log.e("File", e.getLocalizedMessage());
    }
    return "";
  }

  @NonNull private Map<String, Object> getJadeModelRol() {

    Map<String, Object> model = new HashMap<>();

    String backgroundImage = "file:///android_asset/rol.png";

    String signatureImage = "file:///android_asset/signature_customer.svg";

    DocumentRol documentRol =
        new DocumentRol("Semi Electric Bed", "12/19/2018", backgroundImage, signatureImage,
            signatureImage);

    model.put("documentRol", documentRol);
    model.put("signatureImageWidth", SIGNATURE_IMAGE_WIDTH);

    return model;
  }

  private Map<String, Object> getJadeModelAob() {
    Map<String, Object> model = new HashMap<>();

    String backgroundImage = "file:///android_asset/aob_1.png";

    String signatureImage = "file:///android_asset/signature_customer.svg";

    String crossImage = "file:///android_asset/cross.png";

    String checkImage = "file:///android_asset/check.png";

    DocumentAob documentAob =
        new DocumentAob(false, true, true,
            signatureImage, backgroundImage, "Spouse", "12/19/2018");

    model.put("documentAob", documentAob);
    model.put("signatureImageWidth", SIGNATURE_IMAGE_WIDTH);
    model.put("cross", crossImage);
    model.put("check", checkImage);

    return model;
  }

  private String getAssetFile(String assetFileName) {

    File f = new File(getCacheDir() + assetFileName);
    try {

      InputStream is = getAssets().open(assetFileName);
      int size = is.available();
      byte[] buffer = new byte[size];
      is.read(buffer);
      is.close();

      FileOutputStream fos = new FileOutputStream(f);
      fos.write(buffer);
      fos.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

    return f.getPath();
  }
}
