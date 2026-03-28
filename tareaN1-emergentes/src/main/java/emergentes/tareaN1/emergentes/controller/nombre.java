package emergentes.tareaN1.emergentes.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class nombre {
    
    @GetMapping("/nombre")
    public String hola() {
        return "Mi nombre es Armando Morales Ayaviri y de aqui en 5 años veo profesional y por lo menos seguir estudiando para ser mejor y poder sacar una especialidad y una maestria";
    }
}
