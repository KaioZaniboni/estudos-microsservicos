package br.com.zaniboni.userapi.repository;

import br.com.zaniboni.userapi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
