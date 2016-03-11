package paintor.kazumi.thermometer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import paintor.kazumi.thermometer.R;

public class Fragment1 extends Fragment {

	private View layoutView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		layoutView = inflater.inflate(R.layout.fragment1, null);
		return layoutView;
	}
}
