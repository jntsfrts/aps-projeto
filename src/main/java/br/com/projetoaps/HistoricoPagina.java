package br.com.projetoaps;

import java.util.ArrayList;

public class HistoricoPagina {
    private ArrayList<String> historico = new ArrayList<String>();
    // Construtor

    public HistoricoPagina(ArrayList<String> historico) {
        setHistorico(historico);
    }

    // Getters e Setters

    public ArrayList<String> getHistorico() {
        return historico;
    }


    public void setHistorico(ArrayList<String> historico) {
        this.historico = historico;
    }


    // Métodos

    public void adicionaPagina(String nomePagina) {
        historico.add(nomePagina);
    }

    public void controlePagina() {
        int i = 0;
        int contP = 0, contS = 0, contC = 0, contO = 0;

        for (String y: historico) {

            if(y.equals("Página inicial")){
                contP++;
                i ++;
            }
            if (y.equals("Sobre")){
                contS++;
                i ++;
            }
            if (y.equals("Contato")){
                contC++;
                i ++;
            }
            if (y.equals("Obrigado")){
                contO++;
                i ++;
            }
        }

        System.out.println("_________________________________");
        System.out.println("Histórico de navegação Sustentare");
        System.out.println("_________________________________");
        System.out.println("Quantidade de páginas acessadas: " + historico.size());
        System.out.println("_________________________________");
        System.out.println("Página: inicial acessada " + contP + " vez(es).");
        System.out.println("Página: Sobre nós acessada " + contS + " vez(es).");
        System.out.println("Página: Veja como ajudar acessada " + contC + "  vez(es).");
        System.out.println("Página: Agradecimentos acessada " + contO + " vez(es).");
        System.out.println("_________________________________");
        System.out.println("Ordem dos acessos: " + getHistorico());
        System.out.println("_________________________________");
        }
    }