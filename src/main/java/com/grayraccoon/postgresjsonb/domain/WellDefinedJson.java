package com.grayraccoon.postgresjsonb.domain;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class WellDefinedJson implements Serializable {

    private String first_name;
    private String last_name;
    private String some_desc;

}

