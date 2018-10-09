package com.pearlmaknun.mobpro.taski;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ThankYou extends AppCompatActivity {

    @BindView(R.id.home)
    Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank_you);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.home)
    public void onViewClicked() {
        Intent intent = new Intent(ThankYou.this, MainActivity.class);
        startActivity(intent);
    }
}
