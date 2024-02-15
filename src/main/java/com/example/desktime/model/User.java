package com.example.desktime.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "api_data_id")
    private List<ProcessData> processes;

    private Date loginDate;

    @Column(name = "login_time")
    private String loginTime;

    private String loginTimeConvention;

    @Column(name = "logout_time")
    private String logoutTime;

}
