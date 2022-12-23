package com.nhi.crudbackend.repository;

import com.nhi.crudbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
