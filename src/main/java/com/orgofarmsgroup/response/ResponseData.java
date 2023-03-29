package com.orgofarmsgroup.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class ResponseData implements Serializable {
    public static final long serialVersionUID = 987656789L;
    private Long id;
    private String name;
    private transient String password;
    private Integer age;
    private Character gender;
    private Double salary;
    private Boolean isMarried;
}
