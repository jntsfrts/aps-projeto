package br.com.projetoaps;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller

public class HomeController extends HistoricoPagina{

    public HomeController(ArrayList<String> historico) {
        super(historico);
    }

    HistoricoPagina h1 = new HistoricoPagina(getHistorico());

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        h1.adicionaPagina("Página inicial");
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET, params = {"about"})
    public String about(@RequestParam(value = "about") String about) {
        h1.adicionaPagina("Sobre");
        return "about";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET, params = {"contact"})
    public String contact(@RequestParam(value = "contact") String contact) {
        h1.adicionaPagina("Contato");
        return "contact";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET, params = {"thanks"})
    public String thanks(@RequestParam(value = "thanks") String thanks) {
        h1.adicionaPagina("Obrigado");
        h1.controlePagina();
        return "contact-success";

    }
}
