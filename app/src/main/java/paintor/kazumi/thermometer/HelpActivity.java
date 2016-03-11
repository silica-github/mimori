package paintor.kazumi.thermometer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.kazumi.help.HelpActivity01;
import com.kazumi.help.HelpActivity02;
import com.kazumi.help.HelpActivity03;

import java.util.ArrayList;
import java.util.List;

public class HelpActivity extends FragmentActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        listView = new ListView(this);
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, getData()));
        setContentView(listView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent();

                switch (position) {
                    case 0:
                        intent.setClass(HelpActivity.this,HelpActivity01.class);
                        HelpActivity.this.startActivity(intent);
                        break;

                    case 1:
                        intent.setClass(HelpActivity.this,HelpActivity02.class);
                        HelpActivity.this.startActivity(intent);
                        break;

                    case 2:
                        intent.setClass(HelpActivity.this,HelpActivity03.class);
                        HelpActivity.this.startActivity(intent);
                        break;
                }
            }
        });

    }

    private List<String> getData(){

        List<String> data = new ArrayList<String>();
        data.add("体温过高的危害");
        data.add("药物降温");
        data.add("物理降温");

        return data;
    }

}
