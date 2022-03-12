package com.dio_class.devweek.repository;

import com.dio_class.devweek.entity.FaixaEtaria;
import com.dio_class.devweek.entity.Regiao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegiaoRepo extends JpaRepository<Regiao,Long> {
}
