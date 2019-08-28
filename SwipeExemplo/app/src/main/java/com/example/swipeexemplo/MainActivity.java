package com.example.swipeexemplo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //colocar paremetros para os componentes do layout
    private ListView listView;
    private SwipeRefreshLayout swipeRefreshLayout;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> nomes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //associar-los a um id
        swipeRefreshLayout = findViewById(R.id.swipe);
        listView = findViewById(R.id.listView);

        nomes = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nomes);
        listView.setAdapter(adapter);

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        atualizarTodos();
                        swipeRefreshLayout.setRefreshing(false);
                    }
                }, 3000);
            }
        });
        atualizarTodos();



    }

    private void atualizarTodos() {
        int totalNomes = nomes.size();

        for (int j = totalNomes; j <= totalNomes + 3; j++){
            nomes.add(0,String.format("nome %d", j));
        }

        adapter.notifyDataSetChanged();


    }
}
