package com.poja.poja_sary_std22108.repository;

import com.poja.poja_sary_std22108.PojaGenerated;
import com.poja.poja_sary_std22108.repository.model.Dummy;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@PojaGenerated
@Repository
public interface DummyRepository extends JpaRepository<Dummy, String> {

  @Override
  List<Dummy> findAll();
}
