package com.kienjd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kienjd.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
