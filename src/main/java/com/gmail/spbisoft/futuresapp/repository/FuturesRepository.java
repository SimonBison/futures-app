package com.gmail.spbisoft.futuresapp.repository;

import com.gmail.spbisoft.futuresapp.model.Futures;
import org.springframework.data.repository.CrudRepository;

public interface FuturesRepository extends CrudRepository <Futures, String> {
}
