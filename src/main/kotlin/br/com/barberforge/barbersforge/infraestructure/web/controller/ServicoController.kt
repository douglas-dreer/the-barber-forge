package br.com.barberforge.barbersforge.infraestructure.web.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/servicos")
class ServicoController {

    @GetMapping
    fun listarServicos(): ResponseEntity<List<String>> {
        return ResponseEntity.ok(listOf("Corte de cabelo", "Manicure", "Pedicure"))
    }
}