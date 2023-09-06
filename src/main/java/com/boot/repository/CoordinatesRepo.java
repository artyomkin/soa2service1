package com.boot.repository;

import com.boot.dto.Coordinates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoordinatesRepo extends JpaRepository<Coordinates, Long> {
}
