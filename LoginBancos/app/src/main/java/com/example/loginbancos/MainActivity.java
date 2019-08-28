package com.example.loginbancos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<ContaBanco> bancoList = new ArrayList<>();
    private RecyclerView recyclerView;
    private BancoAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new BancoAdapter(bancoList);
        // RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareBancoData();
    }

    public void prepareBancoData(){
        ContaBanco conta = new ContaBanco("ITAU", "SALARIO", 3290, 00217.9, 19);
        bancoList.add(conta);

        conta = new ContaBanco("BRADESCO", "POUPANSA", 2716,007625.1,38);
        bancoList.add(conta);

        conta = new ContaBanco("BRADESCO", "INVESTIMENTO", 000126.4, 2513,21);
        bancoList.add(conta);

        conta = new ContaBanco("SANTANDER", "CORRENTE", 3214, 000721.32, 23);
        bancoList.add(conta);

        conta = new ContaBanco("NUBANK", "CORRENTE",7887, 0002716.3, 89);
        bancoList.add(conta);

        conta = new ContaBanco("BANCO DO BRASIL", "CORRENTE",7632, 00261.2, 65);
        bancoList.add(conta);

        conta = new ContaBanco("CAIXA", "CORRENTE, POUPANCA", 6542,00271.2,65);
        bancoList.add(conta);

        conta = new ContaBanco("CAIXA", "ESTUDANTE",1276, 002189.5,54);
        bancoList.add(conta);

        mAdapter.notifyDataSetChanged();

    }
}
