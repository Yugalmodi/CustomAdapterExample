package com.techpalle.customadapterexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText editTextEno, editTextEname, editTextEsalary;
    Button button;
    ListView listView;
    ArrayList<Employee> al;
    MyAdapter adapter;

    public class MyAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return al.size();
        }
        @Override
        public Object getItem(int i) {
            return null;
        }
        @Override
        public long getItemId(int i) {
            return 0;
        }
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            Employee e = al.get(i);
            Log.d("B34", "Position...."+i);
            View  v = getLayoutInflater().inflate(R.layout.row, null);
            TextView tv1= (TextView) v.findViewById(R.id.textView);
            TextView tv2= (TextView) v.findViewById(R.id.textView2);
            TextView tv3= (TextView) v.findViewById(R.id.textView3);
            tv1.setText(e.getEno());
            tv2.setText(e.getEname());
            tv3.setText(e.getEsalary());
            return v;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextEno = (EditText) findViewById(R.id.edit_text1);
        editTextEname = (EditText) findViewById(R.id.edit_text2);
        editTextEsalary = (EditText) findViewById(R.id.edit_text3);
        button = (Button) findViewById(R.id.button);
        listView = (ListView) findViewById(R.id.list_view);
        al= new ArrayList<Employee>();
        adapter = new MyAdapter();
        listView.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Employee e = new Employee();
                String sno = editTextEno.getText().toString();
                String sname = editTextEname.getText().toString();
                String ssalary = editTextEsalary.getText().toString();
                e.setEno(sno);
                e.setEname(sname);
                e.setEsalary(ssalary);
                al.add(e);
                adapter.notifyDataSetChanged();
                editTextEno.setText("");editTextEname.setText("");editTextEsalary.setText("");
                editTextEno.requestFocus();
            }
        });
    }
}
