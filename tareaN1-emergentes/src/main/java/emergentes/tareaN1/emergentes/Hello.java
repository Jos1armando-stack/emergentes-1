package emergentes.tareaN1.emergentes;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class Hello {
    ArrayList<String> lista = new ArrayList<>();

    @GetMapping("/hello")
    public String GetHello() {
        String text = "";
        for (int i = 0; i < lista.size(); i++) {
            text = text + lista.get(i);
        }
        return text;
    }

    @PostMapping("/hello")
    public String PostHello(@RequestBody String variable){
        lista.add(variable);
        return variable;
    }
    @GetMapping ("/")
    public String comienzo (){
        return "Funciona la aplicacion" ;
    }
}
