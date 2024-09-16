package com.example.studentexamsystem;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "exams")
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @Temporal(TemporalType.DATE)
    private java.util.Date savedDataa;
    @Column(name = "grade", nullable = false)
    private int grade; // Grades will be on a scale of 1-5

    public Exam() {}

    public Exam(Student student, int grade) {
        this.student = student;
        this.grade = grade;
    }

    public String getGrade() {
        return grade + "/5";
    }
    public Date getSavedDataa() {
        return savedDataa;
    }
    public void setSavedDataa(Date savedDataa) {
        this.savedDataa = savedDataa;
    }


    // Getters and Setters
}