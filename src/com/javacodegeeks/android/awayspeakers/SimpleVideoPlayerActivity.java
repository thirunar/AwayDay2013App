package com.javacodegeeks.android.awayspeakers;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SimpleVideoPlayerActivity extends Activity {

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.video);
            Button video1 = (Button)findViewById(R.id.button);
            Button video2 = (Button)findViewById(R.id.button1);
            Button video3 = (Button)findViewById(R.id.button2);

            video1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View arg0) {
                    Intent viewIntent =
                            new Intent("android.intent.action.VIEW",
                                    Uri.parse("http://www.youtube.com/watch?v=Ex2hEG5mwM4"));
                    startActivity(viewIntent);
                }
            });

            video2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View arg0) {
                    Intent viewIntent =
                            new Intent("android.intent.action.VIEW",
                                    Uri.parse("http://www.youtube.com/watch?v=QcIQa2VDwEw"));
                    startActivity(viewIntent);
                }
            });

            video3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View arg0) {
                    Intent viewIntent =
                            new Intent("android.intent.action.VIEW",
                                    Uri.parse("https://www.youtube.com/watch?v=Zb3MsrpEJDM"));
                    startActivity(viewIntent);
                }
            });
        }
}