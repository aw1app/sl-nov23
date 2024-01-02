package com.ecommerce.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.entity.User;

public interface UserRepositry extends JpaRepository<User, Long>{

}
