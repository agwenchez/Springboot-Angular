package com.example.server.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.server.model.Server;

public interface Serverrepo extends JpaRepository<Server, Long> {
    Server findByIPAddress(String ipAddress);
}
