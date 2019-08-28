package com.example.loginbancos;

import android.graphics.Movie;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BancoAdapter extends RecyclerView.Adapter<BancoAdapter.MyViewHolder> {

    private List<ContaBanco> bancoList;


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.bancos_list_row, parent, false);
        return new MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ContaBanco conta = bancoList.get(position);
        holder.tipoBanco.setText(conta.getTipoBanco());
        holder.tipoConta.setText(conta.getTipoConta());
        holder.numeroAgencia.setText((int) conta.getNumeroAgencia());
        holder.numeroConta.setText((int) conta.getNumeroConta());
        holder.numeroCaixa.setText((int) conta.getNumeroCaixa());

    }

    @Override
    public int getItemCount() {
        return bancoList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tipoBanco, tipoConta, numeroAgencia, numeroConta, numeroCaixa;

        public MyViewHolder(View view) {
            super(view);
            tipoBanco = (TextView) view.findViewById(R.id.tipoBanco);
            tipoConta = (TextView) view.findViewById(R.id.tipoConta);
            numeroAgencia = (TextView) view.findViewById(R.id.numeroAgencia);
            numeroConta = (TextView) view.findViewById(R.id.numeroConta);
            numeroCaixa = (TextView) view.findViewById(R.id.numeroCaixa);

        }

    }
        public BancoAdapter(List<ContaBanco> bancoList){
            this.bancoList = bancoList;

        }

}
