package cuidador.care.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String carregaPaginaListagem(Model model){
        model.addAttribute("title", "Login - LifeCare");
        return "autenticacao/login";
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("title", "Home - LifeCare");
        return "home";
    }
}
