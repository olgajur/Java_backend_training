package com.capgemini.training.todo.task.dataaccess.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "PERSON")
@Setter
@Getter
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    private int version;

    @Column(name="EMAIL", length = 256)
    private String email;

    @OneToOne
    @JoinColumn(name = "TASK_LIST_ID", referencedColumnName = "ID")
    private TaskListEntity taskList;

}
