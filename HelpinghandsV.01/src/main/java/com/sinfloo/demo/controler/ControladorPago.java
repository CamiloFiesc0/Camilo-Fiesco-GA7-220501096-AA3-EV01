
package com.sinfloo.demo.controler;


import com.sinfloo.demo.interfaceService.IpagoService;
import com.sinfloo.demo.modelo.Pago;
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
public class ControladorPago {
    
      @Autowired
    private IpagoService service;
     
      
         @GetMapping("/listarPago")
        public String listarPago(Model model){
        List<Pago>pagos=service.listarPago();
        model.addAttribute("pagos", pagos);
        return "pago";
    }
    
    
      @GetMapping("/newPago")
    public String agregar(Model model){
        model.addAttribute("pago", new Pago());
        return "formPago";
    }
    
    @PostMapping("/savePago")
    public String save (@Validated Pago p, Model model){
        service.save(p);
        return "redirect:/listarPago";
    }
    
    
    @GetMapping("/editarPago/{numfactura}")
    public String editar(@PathVariable int numfactura, Model model){
        Optional<Pago>pago=service.listarNumfactura(numfactura);
        model.addAttribute("pago", pago);
        return "formPago";
    }
    
    
    @GetMapping("/eliminarPago/{numfactura}")
    public String delete(Model model, @PathVariable int numfactura){
        service.delete(numfactura);
    return "redirect:/listarPago";
    }
      
      
}
