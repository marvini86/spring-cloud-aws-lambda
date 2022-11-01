package br.com.labs.books.domain.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import lombok.Data;

import java.util.HashSet;


@Data
@DynamoDBTable(tableName = "Books")
public class Books {
    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    @DynamoDBAttribute(attributeName = "id")
    private String id;
    @DynamoDBAttribute(attributeName = "title")
    private String title;
    @DynamoDBAttribute(attributeName = "isbn")
    private String ISBN;
    @DynamoDBAttribute(attributeName = "authors")
    private HashSet<String> authors;
}
