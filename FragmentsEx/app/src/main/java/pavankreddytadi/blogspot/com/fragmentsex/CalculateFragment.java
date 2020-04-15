package pavankreddytadi.blogspot.com.fragmentsex;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CalculateFragment extends Fragment {

    public CalculateFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_calculate, container, false);
        final EditText num1,num2;
        final TextView s;
        Button btn,button;
        final int[] c = {0};

        num1 = v.findViewById(R.id.num1);
        num2 = v.findViewById(R.id.num2);
        s = v.findViewById(R.id.s);
        btn = v.findViewById(R.id.add);
        button = v.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b = new Bundle();
                b.putInt("RES",c[0]);

                Fragment fragment = new ResultFragment();
                fragment.setArguments(b);
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.content_area,fragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(num1.getText().toString());
                int b = Integer.parseInt(num2.getText().toString());
                c[0] = a+b;
                s.setText(String.valueOf(a+b));
            }

        });

        return v;
    }
}
