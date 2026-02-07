package com.eustache.S3DemoApplication.model;

import lombok.Builder;
import lombok.Data;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

@DynamoDbBean
@Data
@Builder
public class users {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
}
