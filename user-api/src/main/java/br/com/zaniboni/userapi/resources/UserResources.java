package br.com.zaniboni.userapi.resources;

import br.com.zaniboni.userapi.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface UserResources {

    @GetMapping(value = "/{id}")
    ResponseEntity<User> findById(@PathVariable Long id);

    @GetMapping
    ResponseEntity<List<User>> findAll();
}
