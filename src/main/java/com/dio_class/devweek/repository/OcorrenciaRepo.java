package com.dio_class.devweek.repository;

import com.dio_class.devweek.entity.IncidenciaExame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OcorrenciaRepo extends JpaRepository<IncidenciaExame,Long> {
}
