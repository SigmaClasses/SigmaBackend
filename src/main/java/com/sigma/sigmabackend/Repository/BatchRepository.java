package com.sigma.sigmabackend.Repository;

import com.sigma.sigmabackend.Model.Batch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchRepository extends JpaRepository<Batch,Integer> {
}
