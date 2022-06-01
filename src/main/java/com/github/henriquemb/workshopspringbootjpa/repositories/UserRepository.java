package com.github.henriquemb.workshopspringbootjpa.repositories;

import com.github.henriquemb.workshopspringbootjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
