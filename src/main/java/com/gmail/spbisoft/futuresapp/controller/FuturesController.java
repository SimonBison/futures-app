package com.gmail.spbisoft.futuresapp.controller;

import com.gmail.spbisoft.futuresapp.model.Futures;
import com.gmail.spbisoft.futuresapp.service.FuturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FuturesController {

    @Autowired
    private FuturesService futuresService;

    @RequestMapping("/futures")
    public List<Futures> getAllFutures() {
        return futuresService.getAllFutures();
    }

    @RequestMapping("/futures/{id}")
    public Futures getFutures(@PathVariable String id) {
        return futuresService.getFutures(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/futures")
    public void addFutures(@RequestBody Futures futures){
        futuresService.addFutures(futures);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/futures/{id}")
    public void updateFutures(@RequestBody Futures futures, @PathVariable String id){
        futuresService.updateFutures(id, futures);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/futures/{id}")
    public void deleteFutures(@PathVariable String id) {
        futuresService.deleteFutures(id);
    }
}
