package br.com.corrapp.api.controller;

import br.com.corrapp.model.Usuario;
import br.com.corrapp.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping(value = "/usuarios")
    public ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usuario){
        Usuario saveUsuario = usuarioService.salvarUsuario(usuario);
        return ResponseEntity.ok(saveUsuario);
    }


}
