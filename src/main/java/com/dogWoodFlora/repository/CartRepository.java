package com.dogWoodFlora.repository;

import com.dogWoodFlora.entity.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<CartEntity, Long> {
}
