
package br.com.unitri.vcalculadora.controller;

import br.com.unitri.calculadora.view.CalculadoraApp;


public class CalculadoraMain {
    
    public static void main(String[] args) {
        
        CalculadoraApp calculadora = new CalculadoraApp();
        CalculadoraController controller = new CalculadoraController(calculadora);
        calculadora.setVisible(true);
        
        
    }
    
}
