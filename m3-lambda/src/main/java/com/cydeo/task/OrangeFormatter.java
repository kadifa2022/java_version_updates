package com.cydeo.task;

import com.cydeo.task.Orange;
@FunctionalInterface // if is only one abstract methode we can create lambda pass directly action
                       // -if is more than one methode we have to use behave parametrization

public interface OrangeFormatter {//2

    String accept(Orange orange);


}
