package com.example.demo1.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    private String password;
    private String firstName;
    private String lastName;

    // Đánh dấu đây là Enum
    // EnumType.STRING: Lưu vào DB chữ "ACTIVE" hoặc "INACTIVE" (Dễ đọc)
    // EnumType.ORDINAL: Lưu số 0 hoặc 1 (Tiết kiệm bộ nhớ nhưng khó đọc) -> Nên
    // dùng STRING
    @Enumerated(EnumType.STRING)
    private UserStatus status;
}