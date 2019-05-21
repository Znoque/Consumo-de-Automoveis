/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumo;

import javax.swing.JOptionPane;
import java.text.DecimalFormat; 
/**
 *
 * @author Znoque
 */
public class main {
    public static void main(String[] args) {
        Automovel carro = new Automovel();
        
        carro.setCapacidadeDoTanque(Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a capacidade do tanque do automóvel em litros?")));
        carro.setCotacaoGasolina(Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a cotação da Gasolina?")));
        carro.setKmPorLitro(Double.parseDouble(JOptionPane.showInputDialog(null, "O automóvel faz quantos km por litro?")));
        carro.setDistancia(Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a distância que pretende percorrer com o carro em km?")));
        carro.calcular(carro.getDistancia(), carro.getKmPorLitro(), carro.getCapacidadeDoTanque(), carro.getCotacaoGasolina());
        JOptionPane.showMessageDialog(null, carro);
    }
}
