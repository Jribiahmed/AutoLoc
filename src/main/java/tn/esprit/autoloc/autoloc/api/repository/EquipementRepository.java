package tn.esprit.autoloc.autoloc.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.autoloc.api.domain.Equipement;

public interface EquipementRepository
        extends JpaRepository<Equipement, Long> {
}