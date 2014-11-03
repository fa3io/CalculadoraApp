package br.com.unitri.vcalculadora.controller;

import br.com.unitri.calculadora.view.CalculadoraApp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraController {

    private final CalculadoraApp calculadora;
    private Double dNumero1;
    private Double dNumero2;
    private String operador = "";
    private String Snumero1 = "";
    private String Snumero2 = "";

    public CalculadoraController(CalculadoraApp calculadora) {
        this.calculadora = calculadora;

        this.calculadora.addNumero0Listener(new Numero0Listener());
        this.calculadora.addNumero1Listener(new Numero1Listener());
        this.calculadora.addNumero2Listener(new Numero2Listener());
        this.calculadora.addNumero3Listener(new Numero3Listener());
        this.calculadora.addNumero4Listener(new Numero4Listener());
        this.calculadora.addNumero5Listener(new Numero5Listener());
        this.calculadora.addNumero6Listener(new Numero6Listener());
        this.calculadora.addNumero7Listener(new Numero7Listener());
        this.calculadora.addNumero8Listener(new Numero8Listener());
        this.calculadora.addNumero9Listener(new Numero9Listener());

        this.calculadora.addPontoListener(new PontoListener());
        this.calculadora.addDividirListener(new DividirListener());
        this.calculadora.addMultiplicarListener(new MultiplicarListener());
        this.calculadora.addSomarListener(new SomarListener());
        this.calculadora.addSubtrairListener(new SubtrairListener());
        this.calculadora.addIgualListener(new IgualListener());
        this.calculadora.AddResetListener(new ResetListener());

    }

    public void verificaVisor(String caractere) {

        String visor = calculadora.getVisor();

        if (caractere.equals("+") || caractere.equals("-")
                || caractere.equals("*") || caractere.equals("/")) {
            if (visor.equals("")) {
            }else if (visor.contains("+") || visor.contains("-")
                    || visor.contains("*") || visor.contains("/")){
                if (Snumero2.equals("")) {
                } else {
                    Snumero1 = mostraResultado();
                    operador = caractere;
                    Snumero2 = "";
                }
            } else {
                if (Snumero1.equals("")) {
                } else {
                    operador = caractere;
                }
            }
        } else if (caractere.equals(".")) {
            if (visor.contains("+") || visor.contains("-")
                    || visor.contains("*") || visor.contains("/")) {
                if (!Snumero2.contains(caractere)) {
                    if (Snumero2.length() == 0) {
                        Snumero2 = "0" + caractere;
                    } else {
                        Snumero2 += caractere;
                    }
                }
            } else {
                if (!Snumero1.contains(caractere)) {
                    if (Snumero1.length() == 0) {
                        Snumero1 = "0" + caractere;
                    } else {
                        Snumero1 += caractere;
                    }
                }
            }
        } else if (caractere.equals("=")) {
            if (!operador.equals("")) {
                if (!Snumero2.equals("")) {
                    String valor = mostraResultado();
                    Snumero1 = valor;
                    operador = "";
                    Snumero2 = "";
                }
            }
        } else if (caractere.equals("C")) {
            operador = "";
            Snumero1 = "";
            Snumero2 = "";
        } else if (visor.contains("+") || visor.contains("-")
                || visor.contains("*") || visor.contains("/")) {
            Snumero2 += caractere;
        } else {
            Snumero1 += caractere;
        }
        calculadora.setVisor(Snumero1 + operador + Snumero2);
    }

    private String mostraResultado() {

        dNumero1 = Double.parseDouble(Snumero1);
        dNumero2 = Double.parseDouble(Snumero2);

        Double resultado = 0.0;

        if (calculadora.getVisor().contains("+")) {
            resultado = dNumero1 + dNumero2;
        } else if (calculadora.getVisor().contains("-")) {
            resultado = dNumero1 - dNumero2;
        } else if (calculadora.getVisor().contains("*")) {
            resultado = dNumero1 * dNumero2;
        } else if (calculadora.getVisor().contains("/")) {
            resultado = dNumero1 / dNumero2;
        }

        calculadora.setVisor(String.valueOf(resultado));

        return String.valueOf(resultado);

    }

    public class Numero0Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            verificaVisor("0");

        }
    }

    public class Numero1Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            verificaVisor("1");

        }
    }

    public class Numero2Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            verificaVisor("2");

        }
    }

    public class Numero3Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            verificaVisor("3");

        }
    }

    public class Numero4Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            verificaVisor("4");

        }
    }

    public class Numero5Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            verificaVisor("5");

        }
    }

    public class Numero6Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            verificaVisor("6");

        }
    }

    public class Numero7Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            verificaVisor("7");

        }
    }

    public class Numero8Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            verificaVisor("8");

        }
    }

    public class Numero9Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            verificaVisor("9");

        }
    }

    public class PontoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            verificaVisor(".");

        }
    }

    public class DividirListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            verificaVisor("/");

        }
    }

    public class MultiplicarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            verificaVisor("*");

        }
    }

    public class SomarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            verificaVisor("+");

        }
    }

    public class SubtrairListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            verificaVisor("-");

        }
    }

    public class IgualListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            verificaVisor("=");

        }
    }

    public class ResetListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            verificaVisor("C");

        }
    }
}
