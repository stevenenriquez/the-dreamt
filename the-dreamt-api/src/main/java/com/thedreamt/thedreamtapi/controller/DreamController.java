package com.thedreamt.thedreamtapi.controller;

import com.thedreamt.thedreamtapi.model.Dream;
import com.thedreamt.thedreamtapi.repository.DreamRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DreamController {

    private DreamRepository dreamRepository;

    public DreamController(DreamRepository dreamRepository) {
        this.dreamRepository = dreamRepository;
    }

    @RequestMapping(value = "/dream")
    public List<Dream> getDreams() {
        List<Dream> dreams = dreamRepository.findAll();
        return dreams;
    }

}
