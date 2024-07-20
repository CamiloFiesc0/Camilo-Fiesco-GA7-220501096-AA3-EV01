
package com.sinfloo.demo.controler;

import com.sinfloo.demo.modelo.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sinfloo.demo.interfaceService.IusuarioService;
import java.util.Optional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping
public class Controlador {
    
    @Autowired
    private IusuarioService service;
    
       
    
    @GetMapping("/listar")
    public String listar(Model model){
        List<Usuario>usuarios=service.listar();
        model.addAttribute("usuarios", usuarios);
        return "usuario";
    }
    
    
      @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("usuario", new Usuario());
        return "formUsuario";
    }
    
    @PostMapping("/save")
    public String save (@Validated Usuario u, Model model){
        service.save(u);
        return "redirect:/listar";
    }
    
    
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<Usuario>usuario=service.listarId(id);
        model.addAttribute("usuario", usuario);
        return "formUsuario";
    }
    
    
    @GetMapping("/eliminar/{id}")
    public String delete(Model model, @PathVariable int id){
        service.delete(id);
    return "redirect:/listar";
    }

    
     @GetMapping("/perfil")
     public String perfil() {
        return "perfil"; // Redirige a perfil
    }
    
    
       @GetMapping("/index")
     public String index() {
        return "index"; // Redirige a index
    }
     
  
     
   @PostMapping("/RegistroExitoso")
    public String RegistroExitoso (@Validated Usuario r, Model model){
        service.save(r);
        return "redirect:/MensajeExitoso";
    }
     
     
       @GetMapping("/MensajeExitoso")
     public String MensajeExitoso() {
        return "MensajeExitoso"; // Redirige a Mensaje exitoso
    }
    
     
    @GetMapping("/newRegistro")
    public String agregarRegistro(Model model){
        model.addAttribute("usuario", new Usuario());
        return "registro";
    }
     
}
