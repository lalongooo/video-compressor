package com.lalongooo.videocompressor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.lalongooo.videocompressor.video.MediaController;


public class MainActivity extends Activity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText);
    }

    public void compress(View v) {
        MediaController.VideoConvertRunnable.runConversion(editText.getText().toString());
    }
}
