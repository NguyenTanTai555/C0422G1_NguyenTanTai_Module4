package com.example.phones.controller;

import com.example.phones.model.Smartphone;
import com.example.phones.service.ISmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@CrossOrigin
@Controller
@RequestMapping(value = "/smartphones")
public class SmartphoneRestController {
    @Autowired
    private ISmartphoneService smartphoneService ;

    @GetMapping("/list")
    public ModelAndView getAllSmartphonePage(Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("/home");
        modelAndView.addObject("smartphones", smartphoneService.findAll(pageable));
        return modelAndView;
    }

    @GetMapping("")
    public ResponseEntity<Page<Smartphone>> goListPhone(Pageable pageable){
        Page<Smartphone> page = smartphoneService.findAll(pageable);
        if (!page.hasContent()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(page,HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<Void> createSmartphone(@RequestBody Smartphone smartphone){
        smartphoneService.save(smartphone);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Smartphone> deletePhone(@PathVariable Integer id){
        Optional<Smartphone> smartphone = smartphoneService.findById(id);
        if (!smartphone.isPresent()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        smartphoneService.delete(id);
        return new ResponseEntity<>(smartphone.get(),HttpStatus.OK);
    }

    @GetMapping("/edit/{id}")
    public ResponseEntity<Optional<Smartphone>> getPhone(@PathVariable Integer id) {
        Optional<Smartphone> smartphoneOptional = smartphoneService.findById(id);
        if (!smartphoneOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(smartphoneOptional, HttpStatus.OK);
    }

    @PostMapping("/edit")
    public ResponseEntity<Iterable<Smartphone>> updateSmartphone(@RequestBody Smartphone smartphone,Pageable pageable) {
        smartphoneService.save(smartphone);
        return new ResponseEntity<>(smartphoneService.findAll(pageable), HttpStatus.NO_CONTENT);
    }
}
