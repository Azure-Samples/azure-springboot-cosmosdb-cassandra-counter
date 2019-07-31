package com.microsoft.azure.cassandra.coupon.model;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.*;
import static com.datastax.driver.core.DataType.Name.COUNTER;
import static org.springframework.data.cassandra.core.cql.PrimaryKeyType.PARTITIONED;


@Table
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode

public class Coupon {

    @PrimaryKeyColumn(name = "id", type = PARTITIONED)
    private String id;

    @PrimaryKeyColumn(name = "name", type = PARTITIONED)
    private String name;

    @PrimaryKeyColumn(name = "user")
    private String user;

    @CassandraType(type=COUNTER)
    private Long usage;

}