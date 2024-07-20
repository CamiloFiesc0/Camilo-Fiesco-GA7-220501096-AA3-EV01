
package com.sinfloo.demo.controler;


import com.sinfloo.demo.interfaceService.IservicioService;
import com.sinfloo.demo.modelo.Servicio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping
public class ControladorServicio {
 
         @Autowired
    private IservicioService service;
    
       
    
    @GetMapping("/listarServicio")
    public String listarServicio(Model model){
        List<Servicio>servicios=service.listarServicio();
        model.addAttribute("servicios", servicios);
        return "servicio";
    }
    
    
      @GetMapping("/newServicio")
    public String agregar(Model model){
        model.addAttribute("servicio", new Servicio());
        return "formServicio";
    }
    
    @PostMapping("/saveServicio")
    public String save (@Validated Servicio s, Model model){
        service.save(s);
        return "redirect:/listarServicio";
    }
    
    
    @GetMapping("/editarServicio/{idasignado}")
    public String editar(@PathVariable int idasignado, Model model){
        Optional<Servicio>servicio=service.listarIdasignado(idasignado);
        model.addAttribute("servicio", servicio);
        return "formServicio";
    }
    
    
    @GetMapping("/eliminarServicio/{idasignado}")
    public String delete(Model model, @PathVariable int idasignado){
        service.delete(idasignado);
    return "redirect:/listarServicio";
    }
    
    
}
