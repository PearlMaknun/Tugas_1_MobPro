package com.pearlmaknun.mobpro.taski;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import de.hdodenhof.circleimageview.CircleImageView;

public class Menu3Activity extends AppCompatActivity {

    @BindView(R.id.judulmakanan)
    TextView judulmakanan;
    @BindView(R.id.profile_image)
    CircleImageView profileImage;
    @BindView(R.id.btnminayam)
    Button btnminayam;
    @BindView(R.id.jml_ayam)
    TextView jmlAyam;
    @BindView(R.id.btnplusayam)
    Button btnplusayam;
    @BindView(R.id.btnminikan)
    Button btnminikan;
    @BindView(R.id.jml_ikan)
    TextView jmlIkan;
    @BindView(R.id.btnplusikan)
    Button btnplusikan;
    @BindView(R.id.btnminnasi)
    Button btnminnasi;
    @BindView(R.id.jml_nasi)
    TextView jmlNasi;
    @BindView(R.id.btnplusnasi)
    Button btnplusnasi;
    @BindView(R.id.makanan)
    LinearLayout makanan;
    @BindView(R.id.judulminuman)
    TextView judulminuman;
    @BindView(R.id.btnmingreen)
    Button btnmingreen;
    @BindView(R.id.jml_green)
    TextView jmlGreen;
    @BindView(R.id.btnplusgreen)
    Button btnplusgreen;
    @BindView(R.id.btnminesteh)
    Button btnminesteh;
    @BindView(R.id.jml_esteh)
    TextView jmlEsteh;
    @BindView(R.id.btnplusesteh)
    Button btnplusesteh;
    @BindView(R.id.btnminkopi)
    Button btnminkopi;
    @BindView(R.id.jml_kopi)
    TextView jmlKopi;
    @BindView(R.id.btnpluskopi)
    Button btnpluskopi;
    @BindView(R.id.minuman)
    LinearLayout minuman;
    @BindView(R.id.aksipesan)
    Button aksipesan;

    int jumlahayam = 0, jumlahikan = 0, jumlahnasi = 0, jumlahgreen = 0, jumlahteh = 0, jumlahkopi = 0, total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu3);
        ButterKnife.bind(this);
    }

    public void getCount() {
        int a,b,c,d,e,f;
        a = Integer.parseInt(jmlAyam.getText().toString());
        b = Integer.parseInt(jmlIkan.getText().toString());
        c = Integer.parseInt(jmlNasi.getText().toString());
        d = Integer.parseInt(jmlGreen.getText().toString());
        e = Integer.parseInt(jmlEsteh.getText().toString());
        f = Integer.parseInt(jmlKopi.getText().toString());

        total = a * 10000 + b * 26000 + c * 16000 + d * 10000 + e * 6000 + f * 15000;
    }

    @OnClick({R.id.btnminayam, R.id.btnplusayam, R.id.btnminikan, R.id.btnplusikan, R.id.btnminnasi, R.id.btnplusnasi, R.id.btnmingreen, R.id.btnplusgreen, R.id.btnminesteh, R.id.btnplusesteh, R.id.btnminkopi, R.id.btnpluskopi, R.id.aksipesan})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnminayam:
                if(Integer.parseInt(jmlAyam.getText().toString()) == 0){

                }else{
                    jumlahayam = jumlahayam - 1;
                    jmlAyam.setText("" + jumlahayam);
                }
                break;
            case R.id.btnplusayam:
                jumlahayam = jumlahayam + 1;
                jmlAyam.setText("" + jumlahayam);
                break;
            case R.id.btnminikan:
                if(Integer.parseInt(jmlIkan.getText().toString()) == 0){

                }else{
                    jumlahikan = jumlahikan - 1;
                    jmlIkan.setText("" + jumlahikan);
                }
                break;
            case R.id.btnplusikan:
                jumlahikan = jumlahikan + 1;
                jmlIkan.setText("" + jumlahikan);
                break;
            case R.id.btnminnasi:
                if(Integer.parseInt(jmlNasi.getText().toString()) == 0){

                }else{
                    jumlahnasi = jumlahnasi - 1;
                    jmlNasi.setText("" + jumlahnasi);
                }
                break;
            case R.id.btnplusnasi:
                jumlahnasi = jumlahnasi + 1;
                jmlNasi.setText("" + jumlahnasi);
                break;
            case R.id.btnmingreen:
                if(Integer.parseInt(jmlGreen.getText().toString()) == 0){

                }else{
                    jumlahgreen = jumlahgreen - 1;
                    jmlGreen.setText("" + jumlahgreen);
                }
                break;
            case R.id.btnplusgreen:
                jumlahgreen = jumlahgreen + 1;
                jmlGreen.setText("" + jumlahgreen);
                break;
            case R.id.btnminesteh:
                if(Integer.parseInt(jmlEsteh.getText().toString()) == 0){

                }else{
                    jumlahteh = jumlahteh - 1;
                    jmlEsteh.setText("" + jumlahteh);
                }
                break;
            case R.id.btnplusesteh:
                jumlahteh = jumlahteh + 1;
                jmlEsteh.setText("" + jumlahteh);
                break;
            case R.id.btnminkopi:
                if(Integer.parseInt(jmlKopi.getText().toString()) == 0){

                }else{
                    jumlahkopi = jumlahkopi - 1;
                    jmlKopi.setText("" + jumlahkopi);
                }
                break;
            case R.id.btnpluskopi:
                jumlahkopi = jumlahkopi + 1;
                jmlKopi.setText("" + jumlahkopi);
                break;
            case R.id.aksipesan:
                getCount();
                //Toast.makeText(getApplicationContext(), "" + total, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), TotalActivity.class);
                intent.putExtra("total", total);
                startActivity(intent);
                break;
        }
    }
}
