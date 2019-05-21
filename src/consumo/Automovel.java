/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumo;

import java.text.DecimalFormat;
/**
 *
 * @author Znoque
 */
public class Automovel {
    /*façam um programinha que calcula quanto de gasolina uma pessoa precisa por no carro pra uma viagem e quantas paradas em postos ela vai ter, 
    o programa deve perguntar a capacidade do tanque do carro, o cotação atual da gasolina e quantos km o carro faz com 1 litro, depois a pessoa 
    deve informar a distância que pretende percorrer com o carro em km, por exemplo, se a pessoa quer ir pra Anagé, ela vai informar 50 km e o 
    programa vai ter que retornar quanto de gasolina ela precisará ter, caso a quantidade seja maior que a capacidade do tanque, o programa deve informar 
    quantas paradas a pessoa vai precisar fazer pra por mais gasolina durante o caminho até ser o suficiente, além disso o programa deve mostrar 2 resultados, 
    o custo só de ida, e o custo de ida e volta.
    */
    private double capacidadeDoTanque;
    private double cotacaoGasolina;
    private double kmPorLitro;
    private double distancia;
    private int paradas;
    private double custoI;//Custo de Ida
    private double custoV;//Custo de Volta
    DecimalFormat df = new DecimalFormat("#,###.00");
    
    @Override
    public String toString() {
        return "=== Automóvel ===\n" + "Capacidade Do Tanque: " + getCapacidadeDoTanque() + "L\nCotação Da Gasolina R$: " + df.format(getCotacaoGasolina()) + "\nKm Por Litro: " + getKmPorLitro() + "Km/L\n\n=== Viagem De Ida ===" + "\nDistância: " + df.format(getDistancia()) + "Km\nParadas Pra Abastecer: " + getParadas() + "\nCusto Da Viagem R$: " + df.format(getCustoI()) + "\n\n=== Viagem Ida e Volta ===" + "\nDistância: " + df.format((getDistancia()*2)) + "Km\nParadas Pra Abastecer: " + (getParadas()*2) + "\nCusto Da Viagem R$: " + df.format(getCustoV());
    }
    
    public void calcular(double distancia, double kmPorLitro, double capacidadeDoTanque, double cotacaoGasolina){
        double gasolinaTotal = distancia/kmPorLitro;
        int NParadas=0;
        double temp=0;
        
        if(capacidadeDoTanque<gasolinaTotal){
            while(temp<gasolinaTotal){
                temp+=capacidadeDoTanque;
                NParadas+=1;
            }
        }else{
            NParadas+=1;//capacidadeDoTanque>=gasolinaTotal
        }
        
        setParadas(NParadas);
        setCustoI((cotacaoGasolina/kmPorLitro)*100);
        setCustoV(getCustoI()*2);
    }
    
    /**
     * @return the capacidadeDoTanque
     */
    public double getCapacidadeDoTanque() {
        return capacidadeDoTanque;
    }

    /**
     * @param capacidadeDoTanque the capacidadeDoTanque to set
     */
    public void setCapacidadeDoTanque(double capacidadeDoTanque) {
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    /**
     * @return the cotacaoGasolina
     */
    public double getCotacaoGasolina() {
        return cotacaoGasolina;
    }

    /**
     * @param cotacaoGasolina the cotacaoGasolina to set
     */
    public void setCotacaoGasolina(double cotacaoGasolina) {
        this.cotacaoGasolina = cotacaoGasolina;
    }

    /**
     * @return the kmPorLitro
     */
    public double getKmPorLitro() {
        return kmPorLitro;
    }

    /**
     * @param kmPorLitro the kmPorLitro to set
     */
    public void setKmPorLitro(double kmPorLitro) {
        this.kmPorLitro = kmPorLitro;
    }

    /**
     * @return the distancia
     */
    public double getDistancia() {
        return distancia;
    }

    /**
     * @param distancia the distancia to set
     */
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    /**
     * @return the custoI
     */
    public double getCustoI() {
        return custoI;
    }

    /**
     * @param custoI the custoI to set
     */
    public void setCustoI(double custoI) {
        this.custoI = custoI;
    }

    /**
     * @return the custoV
     */
    public double getCustoV() {
        return custoV;
    }

    /**
     * @param custoV the custoV to set
     */
    public void setCustoV(double custoV) {
        this.custoV = custoV;
    }

    /**
     * @return the paradas
     */
    public int getParadas() {
        return paradas;
    }

    /**
     * @param paradas the paradas to set
     */
    public void setParadas(int paradas) {
        this.paradas = paradas;
    }
    
}
