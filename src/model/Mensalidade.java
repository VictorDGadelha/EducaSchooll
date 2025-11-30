package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Mensalidade {
    private String descricao;
    private double valorOriginal;
    private double valorPago;
    private LocalDate dataVencimento;
    private LocalDate dataPagamento;
    private boolean paga;


    public Mensalidade(String descricao, double valorOriginal, LocalDate dataVencimento) {
        this.descricao = descricao;
        this.valorOriginal = valorOriginal;
        this.dataVencimento = dataVencimento;
        this.paga = false;
    }


    public double calcularValorComJuros(LocalDate dataPagamentoSimulada) {
        if (!paga && dataPagamentoSimulada.isAfter(dataVencimento)) {
            long diasAtraso = ChronoUnit.DAYS.between(dataVencimento, dataPagamentoSimulada);
            double multa = valorOriginal * 0.02;
            double jurosDia = valorOriginal * 0.01 * diasAtraso;
            return valorOriginal + multa + jurosDia;
        }
        return valorOriginal;
    }

    public void registrarPagamento(double valorFinal, LocalDate dataPagamento) {
        this.valorPago = valorFinal;
        this.dataPagamento = dataPagamento;
        this.paga = true;
    }

    public boolean isPaga() { return paga; }
    public String getDescricao() { return descricao; }
    public LocalDate getDataVencimento() { return dataVencimento; }
    public double getValorOriginal() { return valorOriginal; }
    public LocalDate getDataPagamento() { return dataPagamento; }
    public double getValorPago() { return valorPago; }

    @Override
    public String toString() {
        String status = paga ? "PAGO (R$ " + valorPago + " em " + dataPagamento + ")" : "PENDENTE";
        return descricao + " | Vencimento: " + dataVencimento + " | Valor: R$ " + valorOriginal + " | Status: " + status;
    }
}