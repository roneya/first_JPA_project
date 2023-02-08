package com.example.sql;

import jakarta.persistence.*;

@Entity
@Table(name="libCard")
public class LibraryCard {
    @Id
    private int cardNo;
    private int fine;
    private int bookIssued;
    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;
    @OneToOne
    @JoinColumn
    User user;
}
