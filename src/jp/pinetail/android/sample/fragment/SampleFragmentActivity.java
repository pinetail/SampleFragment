package jp.pinetail.android.sample.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SampleFragmentActivity extends FragmentActivity {
    
    public int cnt = 1;
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button btn = (Button) findViewById(R.id.btn_prev);
        btn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO 自動生成されたメソッド・スタブ
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager
                        .beginTransaction();

                Fragment1 fragment = new Fragment1();
                Bundle bundle = new Bundle();
                bundle.putInt("cnt", cnt++);
                fragment.setArguments(bundle);
                // フラグメントの置き換え
                fragmentTransaction.replace(R.id.fragment1, fragment);
                fragmentTransaction.commit();
            }
        });
    }
}