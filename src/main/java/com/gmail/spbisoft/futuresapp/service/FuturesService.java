package com.gmail.spbisoft.futuresapp.service;

import com.gmail.spbisoft.futuresapp.model.Futures;
import com.gmail.spbisoft.futuresapp.repository.FuturesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FuturesService {

    @Autowired
    private FuturesRepository futuresRepository;

    public List<Futures> getAllFutures() {
        List<Futures> furturesList = new ArrayList<>();
        futuresRepository.findAll()
        .forEach (furturesList::add);
        return furturesList;
    }

    public Futures getFutures(String id)  {
        return futuresRepository.findById(id).get();
    }

    public void addFutures(Futures futures){
        futuresRepository.save(futures);
    }

    public void updateFutures(String id, Futures futures) {
        futuresRepository.save(futures);
    }

    public void deleteFutures(String id) {
        futuresRepository.deleteById(id);
    }
}
