package jp.pinetail.android.sample.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment1 extends Fragment {

    static Fragment1 newInstance() {
        Fragment1 f = new Fragment1();
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment1, container, false);

        Bundle args = getArguments();

        if (args != null) {
            int cnt = getArguments().getInt("cnt");
            TextView txtCnt = (TextView) v.findViewById(R.id.cnt);
            txtCnt.setText(String.valueOf(cnt));
        }
        
        return v;
    }
}
