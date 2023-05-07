package cydeo.practice2;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {

        // No Argument Constructor

        Supplier<Car> c1 = ()-> new Car();//constructor does not have any parameter
        System.out.println(c1.get().getModel());
        Supplier<Car> c2 = Car::new;
        System.out.println(c2.get().getModel());

        // one Argument constructor
        Function<Integer, Car> f1 =model->new Car(model);// constructor has a parameter
        Function<Integer, Car> f2 = Car::new;

        //two Argument constructor

        BiFunction<String, Integer,Car > f3 = Car::new;// constructor with 2 parameter
        Car honda = f3.apply("Honda", 2019);
        System.out.println(honda.getMake()+ " " + honda.getModel());




    }


}
