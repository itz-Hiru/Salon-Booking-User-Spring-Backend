package com.hiru.salon.user.repository;

import com.hiru.salon.user.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
