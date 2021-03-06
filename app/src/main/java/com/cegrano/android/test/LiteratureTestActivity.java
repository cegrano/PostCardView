package com.cegrano.android.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cegrano.android.postcardview.Literature;
import com.cegrano.android.postcardview.LiteratureView;
import com.cegrano.android.postcardview.R;

import java.util.ArrayList;
import java.util.List;

public class LiteratureTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_literature_test);
        LiteratureView literatureView = (LiteratureView) findViewById(R.id.view_literature);
        List<Literature> literature = new ArrayList<>();
        Literature.sid = 0;
        literature.add(new Literature());
        literature.add(new Literature());
        literature.add(new Literature());
        literature.add(new Literature());
        literature.add(new Literature());
        literature.add(new Literature());
        literature.add(new Literature());
        literature.add(new Literature());
        literature.add(new Literature());
        literatureView.setLiteratureList(literature);
//        literatureView.setMidBackground(((BitmapDrawable) getResources().getDrawable(R.mipmap.text_bg)).getBitmap());
        literatureView.setMidBackground(R.mipmap.text_bg);
        literatureView.notifyDateChange();
    }
}
