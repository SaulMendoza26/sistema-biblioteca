package com.proyects.sistema_biblioteca.service;

import java.util.List;

import com.proyects.sistema_biblioteca.entity.Local;

public interface LocalService {
    List<Local> findAllLocals();
    Local saveLocal(Local local);
    Local updateLocal(Long id,Local local);
    void deleteLocal(Long id);
}
