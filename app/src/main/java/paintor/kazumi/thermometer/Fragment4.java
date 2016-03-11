package paintor.kazumi.thermometer;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

@SuppressLint("InflateParams")
public class Fragment4 extends Fragment {

	private View layoutView;
	private Button button_help;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

		layoutView = inflater.inflate(R.layout.fragment4, null);
            button_help = (Button) layoutView.findViewById(R.id.button_help);
            button_help.setOnClickListener(new View.OnClickListener() {
                @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getActivity(),HelpActivity.class);
                getActivity().startActivity(intent);
            }
        });
		return layoutView;
	}
}
