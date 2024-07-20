
package com.sinfloo.demo.controler;


import com.sinfloo.demo.interfaceService.IsolicitudService;
import com.sinfloo.demo.modelo.Solicitud;
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
public class ControladorSolicitud {
    
     @Autowired
    private IsolicitudService service;
    
       
    
    @GetMapping("/listarSolicitud")
    public String listar(Model model){
        List<Solicitud>solicitudes=service.listarSolicitud();
        model.addAttribute("solicitudes", solicitudes);
        return "solicitud";
    }
    
    
      @GetMapping("/newSolicitud")
    public String agregar(Model model){
        model.addAttribute("solicitud", new Solicitud());
        return "formSolicitud";
    }
    
    @PostMapping("/saveSolicitud")
    public String save (@Validated Solicitud s, Model model){
        service.save(s);
        return "redirect:/listarSolicitud";
    }
    
    
    @GetMapping("/editarSolicitud/{codigo}")
    public String editar(@PathVariable int codigo, Model model){
        Optional<Solicitud>solicitud=service.listarCodigo(codigo);
        model.addAttribute("solicitud", solicitud);
        return "formSolicitud";
    }
    
    
    @GetMapping("/eliminarSolicitud/{codigo}")
    public String delete(Model model, @PathVariable int codigo){
        service.delete(codigo);
    return "redirect:/listarSolicitud";
    }

}
