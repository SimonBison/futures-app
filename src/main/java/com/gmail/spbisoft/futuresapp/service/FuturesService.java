package com.gmail.spbisoft.futuresapp.service;

import com.gmail.spbisoft.futuresapp.model.Futures;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FuturesService {

    private List<Futures> futuresList = new ArrayList<>(Arrays.asList(
            new Futures("1", "Indices", "E-Mini S%P 500 Index", "ES", "6,600", "6,000"),
            new Futures("2", "Indices", "E-Mini Russell 2000 Index", "QR", "2,433", "2212"),
            new Futures("3", "Softs", "Orange Juice [FCOJ-A]", "OJ", "792", "720")
        ));

    public List<Futures> getAllFutures() {
        return futuresList;
    }

    public Futures getFutures(String id)  {
         return futuresList.stream().filter(f -> f.getId().equals(id)).findFirst().get();
    }

    public void addFutures(Futures futures){
        futuresList.add(futures);
    }

    public void updateFutures(String id, Futures futures) {
        for (int i = 0; i < futuresList.size(); i++) {
            Futures f = futuresList.get(i);
            if (f.getId().equals(id)){
                futuresList.set(i, futures);
                return;
            }
        }
    }

    public void deleteFutures(String id) {
        futuresList.removeIf(f -> f.getId().equals(id));
    }
}
