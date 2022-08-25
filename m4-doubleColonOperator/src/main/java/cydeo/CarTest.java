package cydeo;


import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {
    public static void main(String[] args) {

        //NoArgument constructor
        //functional interface  T generic can return anything and have methode get();

        Supplier<Car> c1= ()-> new Car();

        System.out.println(c1.get().getModel());

        Supplier<Car> c2= Car::new;

        //One Argument constructor
        Function<Integer,Car>f1=model->new Car(model);//constructor (new) Class(car)
                                 //class ::constructor
        Function<Integer,Car> f2=Car::new;

        //Two Argument functional constructor-apply();
        BiFunction<String, Integer, Car> a1= Car::new;//new keyword is creating object from constructor
        Car honda =a1.apply("Honda",2015);
        System.out.println(honda.getModel() +" " + honda.getMake());





    }

}
