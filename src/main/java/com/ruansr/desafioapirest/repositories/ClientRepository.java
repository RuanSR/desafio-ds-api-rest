package com.ruansr.desafioapirest.repositories;

import com.ruansr.desafioapirest.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
