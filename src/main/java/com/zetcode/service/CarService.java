package com.zetcode.service;

import com.zetcode.model.Car;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CarService implements ICarService {
    @Override
    public List<Car> getAll() {
        ArrayList<Car> ret = new ArrayList<Car>();
        ret.add(new Car(1L, "Toyota", "Camry", "2002"));
        ret.add(new Car(2L, "Toyota", "Camry", "2003"));
        ret.add(new Car(3L, "Toyota", "Camry", "2004"));
        return ret;
    }
}
