package com.cydeo.TaskSelfPractice;
import lombok.*;
//@Getter
//@Setter
//@ToString
@Data
@AllArgsConstructor// RULE if is no constructor define in you application than the DATA IS GOING TO CREATE @NoArgsConstructor
public class User {

    private String firstName;
    private String lastName;
    private int age;
}
