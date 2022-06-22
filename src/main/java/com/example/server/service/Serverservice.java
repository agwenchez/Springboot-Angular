package com.example.server.service;

import java.util.Collection;

import com.example.server.model.Server;

public interface Serverservice {
    Server create(Server server);
    Collection<Server> list(int limit);
    Server get(Long id);
    Server update(Server server);
    Boolean delete(Long id);
}
