package com.example.dee.penilaianta;

import android.app.ActionBar;
import android.content.Intent;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.constraint.ConstraintSet;
import android.support.constraint.ConstraintLayout;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Dee on 6/24/2017.
 */

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnBack;
    Button btnNext;
    TextView t1, t2, t3, t4, t5, t6;
    int page;
    ConstraintLayout constraintLayout;
    ConstraintSet constraintSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        constraintLayout = (ConstraintLayout) findViewById(R.id.activity_second);

        constraintSet = new ConstraintSet();
        constraintSet.clone(constraintLayout);

        btnBack = (Button) findViewById(R.id.btnBack);
        btnNext = (Button) findViewById(R.id.btnNext);
        btnBack.setOnClickListener(this);
        btnNext.setOnClickListener(this);

        t1 = (TextView) findViewById(R.id.textView1);
        t2 = (TextView) findViewById(R.id.textView2);
        t3 = (TextView) findViewById(R.id.textView3);
        t4 = (TextView) findViewById(R.id.textView4);
        t5 = (TextView) findViewById(R.id.textView5);
        t6 = (TextView) findViewById(R.id.textView6);

        page = 1;
    }


    public void onClick(View v) {
//        ConstraintLayout.LayoutParams rel_btn = new ConstraintLayout.LayoutParams(
//                ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        if (v == btnBack) {
            super.onBackPressed();
        } else {
            if (page == 1) {
                page++;
//                btnNext.setLayoutParams(rel_btn);
                btnNext.setText("Prev");
//                constraintSet.connect(btnNext.getId(), ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM, 0);
                constraintSet.clear(btnNext.getId(), ConstraintSet.RIGHT);
                constraintSet.connect(btnNext.getId(), ConstraintSet.LEFT, ConstraintSet.PARENT_ID, ConstraintSet.LEFT, 16);
                constraintSet.applyTo(constraintLayout);
                btnBack.setVisibility(View.INVISIBLE);
                t1.setText(Html.fromHtml("<b>Konversi Nilai Sidang</b>"));
                t2.setText(Html.fromHtml("<pre>Lulus:\t\t\t\t\t\tA = 4, AB = 3.5, B = 3, BC = 2.5, C = 2<br>" +
                        "Tidak Lulus:\tD = 1, E = 0</pre>"));
                t3.setText(Html.fromHtml("<b>Nilai Total CLO = </b><br>35%*CLO1 + 30%*CLO2 + 35%*CLO3<br>"));
                t4.setText(Html.fromHtml("<b>Nilai Perhitungan = </b>60% * Ra + 40% * Rb<br>" +
                        "Ra: Rerata CLO Pembimbing<br> Rb: Rerata CLO Penguji"));
                t5.setText(Html.fromHtml("<b>Rentang Indeks Total</b>"));
                t6.setText("3.50 < A\t\t\u2264 4\n" +
                        "3.25 < AB\t\u2264 3.5\n" +
                        "2.75 < B\t\t\u2264 3.25\n" +
                        "2.25 < BC\t\u2264 2.75\n" +
                        "1.75 < C\t\t\u2264 2.25\n" +
                        "1.00 < D\t\t\u2264 1.75\n" +
                        "\t\t\t\t\t E\t\t\u2264 1");
            } else {
                page--;
//                rel_btn.setMargins(0,0,8,30);
//                rel_btn.setMarginEnd(30);
//                btnNext.setLayoutParams(rel_btn);
                btnNext.setText("Next");
                constraintSet.clear(btnNext.getId(), ConstraintSet.LEFT);
//                constraintSet.connect(btnNext.getId(), ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM, 0);
                constraintSet.connect(btnNext.getId(), ConstraintSet.RIGHT, ConstraintSet.PARENT_ID, ConstraintSet.RIGHT, 16);
                constraintSet.applyTo(constraintLayout);
                btnBack.setVisibility(View.VISIBLE);
                System.out.println(getResources().getString(R.string.ket_clo_1));
                t1.setText(Html.fromHtml("<b> <i>CLO 1</i> </b> <br>Mampu membuat karya tulis " +
                        "ilmiah yang mengkaji atau menerapkan konsep ilmu pengetahuan/teknologi bidang " +
                        "<i>computing</i> berdasarkan kaidah, tata cara dan etika ilmiah"));
                t2.setText(Html.fromHtml("<b>Komponen:</b><br>Kemampuan Analisis, Sistematika " +
                        "dan Tata Bahasa, Perancangan dan Pengerjaan TA"));
                t3.setText(Html.fromHtml("<b> <i>CLO 2</i> </b><br>Mampu mengkomunikasikan dan berargumen secara lisan" +
                        "        terkait solusi/gagasan/desain hasil kajian ilmu pengetahuan/teknologi bidang <i>computing</i>"));
                t4.setText(Html.fromHtml("<b>Komponen:</b><br>Bahasa dan Penyampaian, " +
                        "Penggunaan Media dan Materi, <i>Interpersonal Skills</i>"));
                t5.setText(Html.fromHtml("<b> <i>CLO 3</i> </b><br>Mampu membuat produk/purwarupa/model yang mengkaji" +
                        " atau menerapkan ilmu pengetahuan/teknologi bidang <i>computing</i> untuk menghasilkan solusi dari" +
                        " suatu permasalahan."));
                t6.setText(Html.fromHtml("<b>Komponen:</b><br>Perangkat Lunak / " +
                        "Purwarupa / Model / Dokumen"));
            }
        }
    }
}
