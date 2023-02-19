package com.springproject.ordermanagementsystem.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@Data
@Setter
@NoArgsConstructor
public class OrderLineDto {


    private String name;
    private Date createdTime;

}
