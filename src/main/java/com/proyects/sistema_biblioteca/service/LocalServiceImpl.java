package com.proyects.sistema_biblioteca.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyects.sistema_biblioteca.entity.Local;
import com.proyects.sistema_biblioteca.repository.LocalRepository;

@Service
public class LocalServiceImpl implements LocalService {
    @Autowired
    private LocalRepository localRepository;

    @Override
    public List<Local> findAllLocals() {
        return localRepository.findAll();
    }

    @Override
    public Local saveLocal(Local local) {
        return localRepository.save(local);
    }

    @Override
    public Local updateLocal(Long id, Local local) {
        Local localDB = localRepository.findById(id).get();
        if (Objects.nonNull(local.getCode()) && !"".equalsIgnoreCase(local.getCode())) {
            localDB.setCode(local.getCode());
        }
        if (Objects.nonNull(local.getName()) && !"".equalsIgnoreCase(local.getName())) {
            localDB.setName(local.getName());
        }
        if (Objects.nonNull(local.getFloor()) && !"".equalsIgnoreCase(local.getFloor())) {
            localDB.setFloor(local.getFloor());
        }

        return localRepository.save(localDB);
    }

    @Override
    public void deleteLocal(Long id) {
        localRepository.deleteById(id);
    }

}
