package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    public List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("model1", "series1", 111));
        carList.add(new Car("model2", "series2", 222));
        carList.add(new Car("model3", "series3", 333));
        carList.add(new Car("model4", "series4", 444));
        carList.add(new Car("model5", "series5", 555));

    }

    @Override
    public List<Car> getCarsFromList(Integer count) {

        return (count == null || count >=5) ? carList : carList.stream().filter(i -> carList.indexOf(i) < count).toList();
    }
}