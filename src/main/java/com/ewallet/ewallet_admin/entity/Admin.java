package com.ewallet.ewallet_admin.entity;

import com.common_service.enums.Gender;
import com.common_service.enums.Role;
import com.common_service.enums.Status;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "admin")
public class Admin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Role role;

    @Column(name = "address", columnDefinition = "TEXT")
    private String address;

    @Column(name = "nid_number")
    private String nidNumber;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private Gender gender;

    @Column(name = "image_url")
    private String profileImageUrl;

    @Column(name = "nid_card_url")
    private String nidCardPhotoUrl;

    @Enumerated(EnumType.STRING)
    @Column(name = "account_status")
    private Status status;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
