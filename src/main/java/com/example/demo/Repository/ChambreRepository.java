package com.example.demo.Repository;

import com.example.demo.entity.Bloc;
import com.example.demo.entity.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre,Long> {
}
