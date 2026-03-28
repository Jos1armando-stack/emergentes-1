package emergentes.tareaN1.emergentes.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class nombre {
    
    @GetMapping("/nombre")
    public String mostrarNombreCompleto() {
        return "Armando Morales Ayaviri";
    }
}
