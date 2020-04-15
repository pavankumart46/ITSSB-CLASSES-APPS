package pavankreddytadi.blogspot.com.fragmentsex;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ResultFragment extends Fragment {

    public ResultFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_result, container, false);

        TextView tv = v.findViewById(R.id.val);
        int res = getArguments().getInt("RES");
        tv.setText(String.valueOf(res));
        return v;
    }
}
