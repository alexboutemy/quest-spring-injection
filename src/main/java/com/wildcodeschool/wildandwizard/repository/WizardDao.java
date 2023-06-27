package com.wildcodeschool.wildandwizard.repository;

import java.util.List;

import com.wildcodeschool.wildandwizard.entity.Wizard;

public interface WizardDao {

    Wizard save(Wizard entity);

    Wizard findById(Long id);

    List<Wizard> findAll();

    Wizard update(Wizard entity);

    void deleteById(Long id);
}