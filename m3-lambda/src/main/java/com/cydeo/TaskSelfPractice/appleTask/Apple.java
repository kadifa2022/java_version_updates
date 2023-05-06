package com.cydeo.TaskSelfPractice.appleTask;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter//lombok annotations
@Setter
@AllArgsConstructor
@ToString  // dependencies
public class Apple {

    private int weight;
    private Color color;



}

/*                                 Boiler code
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }
}

 */
