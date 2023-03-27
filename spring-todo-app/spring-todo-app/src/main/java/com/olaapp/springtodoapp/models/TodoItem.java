package com.olaapp.springtodoapp.models;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "todo_item")
public class TodoItem {

    @Id
    /*Domyślna strategia pozwala na przejęcie odpowiedzialności za
    generowanie kluczy głównych przez TopLink, który posługuje się
    pomocniczą tabelą przechowującą wartości potrzebne do generowania
    kluczy*/
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    @NotBlank(message = "Description is required")
    private String description;  //task description

    @Getter
    @Setter
    private boolean complete; //things done or not


    //import instant from java time
    @Getter
    @Setter
    private Instant createdDate;

    @Getter
    @Setter
    private Instant modifiedDate;


    public TodoItem() {

         }

    public TodoItem(String description) {
        this.description = description;
        this.complete = false;
        this.createdDate = Instant.now();
        this.modifiedDate = Instant.now();
    }



    //override to string
    @Override
    public String toString() {
        return String.format("TodoItem{id=%d, description='%s', complete='%s', createdDate='%s', modifiedDate='%s'}",
                id, description, complete, createdDate, modifiedDate);
    }
}


