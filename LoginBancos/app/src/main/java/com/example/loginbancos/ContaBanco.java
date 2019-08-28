package com.example.loginbancos;

public class ContaBanco {
    private String tipoBanco;
    private String tipoConta;
    private double numeroAgencia;
    private double numeroConta;
    private double numeroCaixa;


    public ContaBanco(String tipoBanco, String tipoConta, double numeroAgencia, double numeroConta, double numeroCaixa) {
        this.tipoBanco = tipoBanco;
        this.tipoConta = tipoConta;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.numeroCaixa = numeroCaixa;


    }

    public String getTipoBanco() {
        return tipoBanco;
    }

    public void setTipoBanco(String tipoBanco) {
        this.tipoBanco = tipoBanco;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(double numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public double getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(double numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getNumeroCaixa() {
        return numeroCaixa;
    }

    public void setNumeroCaixa(double numeroCaixa) {
        this.numeroCaixa = numeroCaixa;
    }
}