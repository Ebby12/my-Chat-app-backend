package com.chat_application.chatboard.model;
//the file contains class(es) related to modeling or representing data
// entities, business logic, or domain-specific objects.
import lombok.*;
// Lombok is a Java library that helps reduce boilerplate code in classes by
// automatically generating methods, constructors, getters, setters, and more.


@NoArgsConstructor
@AllArgsConstructor
@Getter  // generates getter behind the scene for clean code
@Setter
@ToString  // returns the value inside  the text
public class Message {
    private String text;
    private String date;
    private Status status;
}