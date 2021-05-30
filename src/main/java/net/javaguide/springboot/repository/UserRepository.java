package net.javaguide.springboot.repository;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguide.springboot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
