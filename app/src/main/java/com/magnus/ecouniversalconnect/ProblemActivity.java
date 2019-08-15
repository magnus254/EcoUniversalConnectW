package com.magnus.ecouniversalconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ProblemActivity extends AppCompatActivity {

    private ImageView mCameraImage;
    private Button  btCapture;
    private Uri mPhotoUri;
    private static final int TAKE_PICK_REQUEST = 100;
    private String pathToFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem);
        mCameraImage =(ImageView)findViewById(R.id.iv_cameraImage_id);
        btCapture =(Button)findViewById(R.id.bt_buttonCaptureImage_id);
        btCapture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selfie();
            }
        });
    }

    private void selfie() {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE_SECURE);
        startActivityForResult(intent , TAKE_PICK_REQUEST);
    }
}
