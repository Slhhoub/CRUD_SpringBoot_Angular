package com.backEnd.backEnd.repository;

import com.backEnd.backEnd.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserREpository extends JpaRepository<User,Integer> {
}
