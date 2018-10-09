package com.pearlmaknun.mobpro.taski;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TotalActivity extends AppCompatActivity {

    @BindView(R.id.total)
    TextView tvtotal;

    @BindView(R.id.pesan)
    Button pesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total);
        ButterKnife.bind(this);

        Intent i = getIntent();

        Integer total = i.getIntExtra("total", 0);
        tvtotal.setText("" + total);
    }

    @OnClick(R.id.pesan)
    public void onViewClicked() {
        Intent intent = new Intent(TotalActivity.this, ThankYou.class);
        startActivity(intent);
    }
}
