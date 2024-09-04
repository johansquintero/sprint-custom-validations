package com.app.dto;

import com.app.annotations.ValidName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDTO {
    @ValidName
    private String name;

    @ValidName
    private String city;
}
