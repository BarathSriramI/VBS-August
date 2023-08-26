package com.example.VBS.Model;

import com.example.VBS.Enum.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@FieldDefaults(level= AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Person {

    @Id
   @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;
    String name;

    int age;

//    @Column (unique=true,nullable = false)
//    String Aadharno;

    @Column(unique = true,nullable = false)
    String emailId;

    @Enumerated(EnumType.STRING)
    Gender gender;


}
