package tn.esprit.autoloc.autoloc.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.autoloc.api.domain.Maintenance;

public interface MaintenanceRepository
        extends JpaRepository<Maintenance, Long> {
}