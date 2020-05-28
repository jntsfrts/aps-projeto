package br.com.projetoaps;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/")

public class HomeController {

    /*@RequestMapping( value = { "/" , "" ,"/home" })
    public ModelAndView homePrincipal(){
        //Retorna a view que deve ser chamada, no caso principal (principal.jsp) que esta dentro da pasta /home
        return new ModelAndView("index");
    }

    @RequestMapping( "/about" )
    public ModelAndView homeSecundaria(){
        //Retorna a view que deve ser chamada, no caso secundaria (secundaria.jsp) que esta dentro da pasta /home
        return new ModelAndView("contact-success");
    }*/

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET, params = {"about"})
    public String about(@RequestParam(value = "about", required = true) String about) {
        return "about";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET, params = {"contact"})
    public String contact(@RequestParam(value = "contact", required = true) String contact) {
        return "contact";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET, params = {"thanks"})
    public String thanks(@RequestParam(value = "thanks", required = true) String thanks) {
        return "contact-success";
    }


}
