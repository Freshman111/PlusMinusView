package com.sgffsg.plusminusview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.sgffsg.plusminusview.view.PlusMinusView;

public class MainActivity extends AppCompatActivity {

    PlusMinusView plusMinusView;
    TextView tvSum;
    Button btnBuy;
    private float price=8.5f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plusMinusView= (PlusMinusView) findViewById(R.id.item_plusminusview);
        tvSum= (TextView) findViewById(R.id.tv_sum_num);
        btnBuy= (Button) findViewById(R.id.btn_buy);
        plusMinusView.setMaxNum(30);
        plusMinusView.setPlusMinusListener(new PlusMinusView.OnPlusMinusClickListener() {
            @Override
            public void onPlusClick(int currentNum) {
                showSum(currentNum);
            }

            @Override
            public void onMinusClick(int currentNum) {
                showSum(currentNum);
            }
        });



    }


    private void showSum(int num) {
        tvSum.setText(price*num+"$");
    }
}
