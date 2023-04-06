package br.com.zaniboni.userapi.resources.impl;

import br.com.zaniboni.userapi.domain.User;
import br.com.zaniboni.userapi.resources.UserResources;
import br.com.zaniboni.userapi.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "api/users")
public class UserResourceImpl implements UserResources {

    private final UserService userService;
    @Override
    public ResponseEntity<User> findById(Long id) {
        return ResponseEntity.ok().body(userService.findById(id));
    }

    @Override
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok().body(userService.findAll());
    }
}
