package com.student.registraion.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentDTO {

    private UUID studentId;
    private String name;
    private String email;
    private String gender;
    private String course;
    private String[] timings;
}
