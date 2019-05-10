package com.example.dee.penilaianta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Spinner clo1p1;
    Spinner clo2p1;
    Spinner clo3p1;
    Spinner clo1p2;
    Spinner clo2p2;
    Spinner clo3p2;
    Spinner clo1j1;
    Spinner clo2j1;
    Spinner clo3j1;
    Spinner clo1j2;
    Spinner clo2j2;
    Spinner clo3j2;
    EditText raclo1;
    EditText raclo2;
    EditText raclo3;
    EditText rbclo1;
    EditText rbclo2;
    EditText rbclo3;
    EditText akhir1;
    EditText akhir2;
    EditText akhir3;
    EditText perkiraan1;
    EditText perkiraan2;
    EditText perkiraan3;
    EditText total;
    EditText index;
    TextView deadline;
    Button btnReset;
    Button btnHelp;
    boolean reset = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Penilaian Tugas Akhir v2.2");


        clo1p1 = (Spinner) findViewById(R.id.clo1p1);
        clo2p1 = (Spinner) findViewById(R.id.clo2p1);
        clo3p1 = (Spinner) findViewById(R.id.clo3p1);
        clo1p2 = (Spinner) findViewById(R.id.clo1p2);
        clo2p2 = (Spinner) findViewById(R.id.clo2p2);
        clo3p2 = (Spinner) findViewById(R.id.clo3p2);
        clo1j1 = (Spinner) findViewById(R.id.clo1j1);
        clo2j1 = (Spinner) findViewById(R.id.clo2j1);
        clo3j1 = (Spinner) findViewById(R.id.clo3j1);
        clo1j2 = (Spinner) findViewById(R.id.clo1j2);
        clo2j2 = (Spinner) findViewById(R.id.clo2j2);
        clo3j2 = (Spinner) findViewById(R.id.clo3j2);

        akhir1 = (EditText) findViewById(R.id.akhir1);
        akhir2 = (EditText) findViewById(R.id.akhir2);
        akhir3 = (EditText) findViewById(R.id.akhir3);


        raclo1 = (EditText) findViewById(R.id.raclo1);
        raclo2 = (EditText) findViewById(R.id.raclo2);
        raclo3 = (EditText) findViewById(R.id.raclo3);
        rbclo1 = (EditText) findViewById(R.id.rbclo1);
        rbclo2 = (EditText) findViewById(R.id.rbclo2);
        rbclo3 = (EditText) findViewById(R.id.rbclo3);
        perkiraan1 = (EditText) findViewById(R.id.perkiraan1);
        perkiraan2 = (EditText) findViewById(R.id.perkiraan2);
        perkiraan3 = (EditText) findViewById(R.id.perkiraan3);
        total = (EditText) findViewById(R.id.total);
        index = (EditText) findViewById(R.id.index);
        btnReset = (Button) findViewById(R.id.btnReset);
        btnHelp = (Button) findViewById(R.id.btnHelp);

        raclo1.setKeyListener(null);
        raclo2.setKeyListener(null);
        raclo3.setKeyListener(null);
        rbclo1.setKeyListener(null);
        rbclo2.setKeyListener(null);
        rbclo3.setKeyListener(null);

        btnReset.setOnClickListener(this);

        clo1p1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (reset && position == 0) {
                } else {
                    reset = false;
                    calculate();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        clo2p1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (reset && position == 0) {
                } else {
                    reset = false;
                    calculate();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        clo3p1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (reset && position == 0) {
                } else {
                    reset = false;
                    calculate();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        clo1p2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (reset && position == 0) {
                } else {
                    reset = false;
                    calculate();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        clo2p2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (reset && position == 0) {
                } else {
                    reset = false;
                    calculate();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        clo3p2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (reset && position == 0) {
                } else {
                    reset = false;
                    calculate();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        clo1j1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (reset && position == 0) {
                } else {
                    reset = false;
                    calculate();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        clo2j1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (reset && position == 0) {
                } else {
                    reset = false;
                    calculate();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        clo3j1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (reset && position == 0) {
                } else {
                    reset = false;
                    calculate();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        clo1j2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (reset && position == 0) {
                } else {
                    reset = false;
                    calculate();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        clo2j2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (reset && position == 0) {
                } else {
                    reset = false;
                    calculate();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        clo3j2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (reset && position == 0) {
                } else {
                    reset = false;
                    calculate();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        akhir1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                calculate();
            }
        });
        akhir2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                calculate();
            }
        });
        akhir3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                calculate();
            }
        });

        deadline = (TextView) findViewById(R.id.deadline);

        resetText();
    }

    public void sendMessage(View v) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }

    public void onClick(View v) {
        if (v == btnReset) {
            reset = true;
            clo1p1.setSelection(0);
            clo2p1.setSelection(0);
            clo3p1.setSelection(0);
            clo1p2.setSelection(0);
            clo2p2.setSelection(0);
            clo3p2.setSelection(0);
            clo1j1.setSelection(0);
            clo2j1.setSelection(0);
            clo3j1.setSelection(0);
            clo1j2.setSelection(0);
            clo2j2.setSelection(0);
            clo3j2.setSelection(0);
            resetText();
        }
    }

    public void resetText() {

        akhir1.setText("");
        akhir2.setText("");
        akhir3.setText("");
        raclo1.setText("");
        raclo2.setText("");
        raclo3.setText("");
        rbclo1.setText("");
        rbclo2.setText("");
        rbclo3.setText("");
        perkiraan1.setText("");
        perkiraan2.setText("");
        perkiraan3.setText("");
        total.setText("");
        index.setText("");

        String currentDate = new SimpleDateFormat("dd-MMM-yyyy", Locale.getDefault()).format(new Date());

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(sdf.parse(currentDate));
        } catch (ParseException e) {

        }
        c.add(Calendar.DATE, 15);
        sdf = new SimpleDateFormat("dd-MMM-yyyy");
        Date resultdate = new Date(c.getTimeInMillis());
        currentDate = sdf.format(resultdate);


        deadline.setText("Deadline Revisi: \n" + currentDate);
    }

    public void calculate() {
        double nilai_array[] = {0, 4, 3.5, 3, 2.5, 2, 1, 0};
        double nclo1p1 = nilai_array[clo1p1.getSelectedItemPosition()];
        double nclo2p1 = nilai_array[clo2p1.getSelectedItemPosition()];
        double nclo3p1 = nilai_array[clo3p1.getSelectedItemPosition()];
        double nclo1p2 = nilai_array[clo1p2.getSelectedItemPosition()];
        double nclo2p2 = nilai_array[clo2p2.getSelectedItemPosition()];
        double nclo3p2 = nilai_array[clo3p2.getSelectedItemPosition()];
        double nclo1j1 = nilai_array[clo1j1.getSelectedItemPosition()];
        double nclo2j1 = nilai_array[clo2j1.getSelectedItemPosition()];
        double nclo3j1 = nilai_array[clo3j1.getSelectedItemPosition()];
        double nclo1j2 = nilai_array[clo1j2.getSelectedItemPosition()];
        double nclo2j2 = nilai_array[clo2j2.getSelectedItemPosition()];
        double nclo3j2 = nilai_array[clo3j2.getSelectedItemPosition()];
        double ra1 = 0;
        double ra2 = 0;
        double ra3 = 0;
        double rb1 = 0;
        double rb2 = 0;
        double rb3 = 0;
        double np1 = 0;
        double np2 = 0;
        double np3 = 0;
        double na1 = 0;
        double na2 = 0;
        double na3 = 0;
        double nilai_total = 0;
        String nilai_index = "E";


        if (!TextUtils.isEmpty(akhir1.getText().toString()))
            na1 = Float.parseFloat(akhir1.getText().toString());
        if (!TextUtils.isEmpty(akhir2.getText().toString()))
            na2 = Float.parseFloat(akhir2.getText().toString());
        if (!TextUtils.isEmpty(akhir3.getText().toString()))
            na3 = Float.parseFloat(akhir3.getText().toString());


        na1 = cek(na1, akhir1);
        na2 = cek(na2, akhir2);
        na3 = cek(na3, akhir3);


        if ((clo1p2.getSelectedItemPosition() == 0) &&
                (clo1p2.getSelectedItemPosition() == 0) &&
                (clo1p2.getSelectedItemPosition() == 0)) {
            ra1 = nclo1p1;
            ra2 = nclo2p1;
            ra3 = nclo3p1;
        } else {

            ra1 = (nclo1p1 + nclo1p2) / 2;
            ra2 = (nclo2p1 + nclo2p2) / 2;
            ra3 = (nclo3p1 + nclo3p2) / 2;
        }

        rb1 = (nclo1j1 + nclo1j2) / 2;
        rb2 = (nclo2j1 + nclo2j2) / 2;
        rb3 = (nclo3j1 + nclo3j2) / 2;

        np1 = (float) (0.6 * ra1 + 0.4 * rb1);
        np2 = (float) (0.6 * ra2 + 0.4 * rb2);
        np3 = (float) (0.6 * ra3 + 0.4 * rb3);

        double clo1_total = np1;
        double clo2_total = np2;
        double clo3_total = np3;

        if (na1 > 0)
            clo1_total = na1;
        if (na2 > 0)
            clo2_total = na2;
        if (na3 > 0)
            clo3_total = na3;

        nilai_total = 0.35 * clo1_total + 0.3 * clo2_total + 0.35 * clo3_total;
        if (nilai_total > 3.5) {
            nilai_index = "A";
        } else if (nilai_total > 3.25) {
            nilai_index = "AB";
        } else if (nilai_total > 2.75) {
            nilai_index = "B";
        } else if (nilai_total > 2.25) {
            nilai_index = "BC";
        } else if (nilai_total > 1.75) {
            nilai_index = "C";
        } else if (nilai_total > 1) {
            nilai_index = "D";
        } else {
            nilai_index = "E";
        }

//        if (!(clo1p1.getSelectedItemPosition() == 0 && clo2p1.getSelectedItemPosition() == 0 && clo3p1.getSelectedItemPosition() == 0
//                && clo1j1.getSelectedItemPosition() == 0 && clo2j1.getSelectedItemPosition() == 0 && clo3j1.getSelectedItemPosition() == 0
//                && clo1j2.getSelectedItemPosition() == 0 && clo2j2.getSelectedItemPosition() == 0 && clo3j2.getSelectedItemPosition() == 0)) {
        raclo1.setText(String.format(Locale.getDefault(), "%.02f", ra1));
        raclo2.setText(String.format(Locale.getDefault(), "%.02f", ra2));
        raclo3.setText(String.format(Locale.getDefault(), "%.02f", ra3));
        rbclo1.setText(String.format(Locale.getDefault(), "%.02f", rb1));
        rbclo2.setText(String.format(Locale.getDefault(), "%.02f", rb2));
        rbclo3.setText(String.format(Locale.getDefault(), "%.02f", rb3));
        perkiraan1.setText(String.format(Locale.getDefault(), "%.02f", np1));
        perkiraan2.setText(String.format(Locale.getDefault(), "%.02f", np2));
        perkiraan3.setText(String.format(Locale.getDefault(), "%.02f", np3));
        total.setText(String.format(Locale.getDefault(), "%.02f", nilai_total));
        index.setText(nilai_index);
//        }
    }

//        if (!TextUtils.isEmpty(clo1p1.getText().toString()))
//            nclo1p1 = Float.parseFloat(clo1p1.getText().toString());
//        if (!TextUtils.isEmpty(clo2p1.getText().toString()))
//            nclo2p1 = Float.parseFloat(clo2p1.getText().toString());
//        if (!TextUtils.isEmpty(clo3p1.getText().toString()))
//            nclo3p1 = Float.parseFloat(clo3p1.getText().toString());
//        if (!TextUtils.isEmpty(clo1p2.getText().toString()))
//            nclo1p2 = Float.parseFloat(clo1p2.getText().toString());
//        if (!TextUtils.isEmpty(clo2p2.getText().toString()))
//            nclo2p2 = Float.parseFloat(clo2p2.getText().toString());
//        if (!TextUtils.isEmpty(clo3p2.getText().toString()))
//            nclo3p2 = Float.parseFloat(clo3p2.getText().toString());
//
//        if (!TextUtils.isEmpty(clo1j1.getText().toString()))
//            nclo1j1 = Float.parseFloat(clo1j1.getText().toString());
//        if (!TextUtils.isEmpty(clo2j1.getText().toString()))
//            nclo2j1 = Float.parseFloat(clo2j1.getText().toString());
//        if (!TextUtils.isEmpty(clo3j1.getText().toString()))
//            nclo3j1 = Float.parseFloat(clo3j1.getText().toString());
//        if (!TextUtils.isEmpty(clo1j2.getText().toString()))
//            nclo1j2 = Float.parseFloat(clo1j2.getText().toString());
//        if (!TextUtils.isEmpty(clo2j2.getText().toString()))
//            nclo2j2 = Float.parseFloat(clo2j2.getText().toString());
//        if (!TextUtils.isEmpty(clo3j2.getText().toString()))
//            nclo3j2 = Float.parseFloat(clo3j2.getText().toString());
//
//
//        if (!TextUtils.isEmpty(akhir1.getText().toString()))
//            na1 = Float.parseFloat(akhir1.getText().toString());
//        if (!TextUtils.isEmpty(akhir2.getText().toString()))
//            na2 = Float.parseFloat(akhir2.getText().toString());
//        if (!TextUtils.isEmpty(akhir3.getText().toString()))
//            na3 = Float.parseFloat(akhir3.getText().toString());


    //        nclo1p1 = cek(nclo1p1, clo1p1);
//        nclo2p1 = cek(nclo2p1, clo2p1);
//        nclo3p1 = cek(nclo3p1, clo3p1);
//        nclo1p2 = cek(nclo1p2, clo1p2);
//        nclo2p2 = cek(nclo2p2, clo2p2);
//        nclo3p2 = cek(nclo3p2, clo3p2);
//        nclo1j1 = cek(nclo1j1, clo1j1);
//        nclo2j1 = cek(nclo2j1, clo2j1);
//        nclo3j1 = cek(nclo3j1, clo3j1);
//        nclo1j2 = cek(nclo1j2, clo1j2);
//        nclo2j2 = cek(nclo2j2, clo2j2);
//        nclo3j2 = cek(nclo3j2, clo3j2);
//        na1 = cek(na1, akhir1);
//        na2 = cek(na2, akhir2);
//        na3 = cek(na3, akhir3);
//
//        if (TextUtils.isEmpty(clo1p2.getText().toString()) &&
//                TextUtils.isEmpty(clo1p2.getText().toString()) &&
//                TextUtils.isEmpty(clo1p2.getText().toString())) {
//            ra1 = nclo1p1 ;
//            ra2 = nclo2p1 ;
//            ra3 = nclo3p1 ;
//        }else{
//
//            ra1 = (nclo1p1 + nclo1p2) / 2;
//            ra2 = (nclo2p1 + nclo2p2) / 2;
//            ra3 = (nclo3p1 + nclo3p2) / 2;
//        }
//
//        rb1 = (nclo1j1 + nclo1j2) / 2;
//        rb2 = (nclo2j1 + nclo2j2) / 2;
//        rb3 = (nclo3j1 + nclo3j2) / 2;
//
//        np1 = (float) (0.6 * ra1 + 0.4 * rb1);
//        np2 = (float) (0.6 * ra2 + 0.4 * rb2);
//        np3 = (float) (0.6 * ra3 + 0.4 * rb3);
//
//        float ntot1 = np1;
//        float ntot2 = np2;
//        float ntot3 = np3;
//
//        if (na1 > 0)
//            ntot1 = na1;
//        if (na2 > 0)
//            ntot2 = na2;
//        if (na3 > 0)
//            ntot3 = na3;
//
//        ntotal = (float) (0.35 * ntot1 + 0.3 * ntot2 + 0.35 * ntot3);
//        if (ntotal > 80) {
//            nindex = "A";
//        } else if (ntotal > 70) {
//            nindex = "AB";
//        } else if (ntotal > 65) {
//            nindex = "B";
//        } else if (ntotal > 60) {
//            nindex = "BC";
//        } else if (ntotal > 50) {
//            nindex = "C";
//        } else if (ntotal > 40) {
//            nindex = "D";
//        } else {
//            nindex = "E";
//        }
//
//        raclo1.setText(String.format("%.02f", ra1));
//        raclo2.setText(String.format("%.02f", ra2));
//        raclo3.setText(String.format("%.02f", ra3));
//        rbclo1.setText(String.format("%.02f", rb1));
//        rbclo2.setText(String.format("%.02f", rb2));
//        rbclo3.setText(String.format("%.02f", rb3));
//        perkiraan1.setText(String.format("%.02f", np1));
//        perkiraan2.setText(String.format("%.02f", np2));
//        perkiraan3.setText(String.format("%.02f", np3));
//        total.setText(String.format("%.02f", ntotal));
//        index.setText(nindex);
//    }
//
    public double cek(double n, TextView t) {
        if (n < 0) {
            n = 0;
            t.setText("0");
        } else if (n > 4) {
            n = 4;
            t.setText("4");
        }
        return n;
    }

}