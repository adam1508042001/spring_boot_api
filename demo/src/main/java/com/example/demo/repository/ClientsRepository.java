package com.example.demo.repository;


import com.example.demo.entities.ClientsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientsRepository extends JpaRepository<ClientsEntity, Long> {


}
