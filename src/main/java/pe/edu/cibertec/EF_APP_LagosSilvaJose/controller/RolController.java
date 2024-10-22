package pe.edu.cibertec.EF_APP_LagosSilvaJose.controller;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public class RolController {

    @GetMapping("/public")
    public String getPublicMessage() {
        return "[!] Mensaje Público";
    }


    @GetMapping("/private")
    public String getPrivateMessage() {
        return "[!] Usuarios logueados";
    }


    @GetMapping("/admin")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String getAdminMessage() {
        return "[!] Logueado con rol ADMIN.";
    }


}
