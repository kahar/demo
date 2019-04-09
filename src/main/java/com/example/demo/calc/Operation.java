package com.example.demo.calc;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
class Operation {

    @Id
    @SequenceGenerator(name = "operation_id_seq", sequenceName = "operation_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE, generator = "operation_id_seq")
    private Long id;

    @Column(name = "arguments")
    private String arguments;

    @Column(name = "type_of_operation")
    private String typeOfOperation;

    public Operation() {
    }

    public Operation(String arguments, String typeOfOperation) {
        this.arguments = arguments;
        this.typeOfOperation = typeOfOperation;
    }
}
