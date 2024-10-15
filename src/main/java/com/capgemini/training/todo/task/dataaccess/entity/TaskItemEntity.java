package com.capgemini.training.todo.task.dataaccess.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TASK_ITEM")
@Setter
@Getter
public class TaskItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    private int version;

    @Column(name="NAME", length = 256)
    private String name;

    @Column(name="COMPLETED")
    private byte completed;

    @Column(name="DEADLINE")
    private java.sql.Timestamp deadline;

    @ManyToOne(fetch = FetchType.LAZY)
    private TaskListEntity taskList;

}
