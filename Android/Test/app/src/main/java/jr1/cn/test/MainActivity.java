package jr1.cn.test;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import jr1.cn.test.view.ClipImageLayout;

public class MainActivity extends AppCompatActivity {

    private ClipImageLayout mClipImageLayout;

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mClipImageLayout = (ClipImageLayout) findViewById(R.id.clip_image_layout);

        mTextView = (TextView) findViewById(R.id.text);

//        mClipImageLayout.setImage(R.mipmap.lss);

        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

                startActivityForResult(intent, 1);

            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == Activity.RESULT_OK) {
            Bundle bundle = data.getExtras();
            Bitmap bitmap = (Bitmap) bundle.get("data");
//            File file = getFilesDir();
//            String filename = (new SimpleDateFormat("yyyyMMddHHmmss")).format(new Date());

//            File file1 = new File(getExternalFilesDir(Environment.DIRECTORY_PICTURES), filename);
//            Log.d("---",
//                    file1.getAbsolutePath());
//            FileOutputStream fileOutputStream = null;
//            try {
//                fileOutputStream = new FileOutputStream(file1);
//                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
//            } catch (Exception e) {
//                Log.d("---", "11111");
//                e.printStackTrace();
//            } finally {
//                try {
//                    fileOutputStream.flush();
//                    fileOutputStream.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//            }
//
//            mClipImageLayout.clearImage();
//
//            mClipImageLayout.invalidate();

            mClipImageLayout.setImage(bitmap);


        }
    }
}
