# Getting Started

### AWS Spring cloud function
Project for lambda aws function http trigger using aws spring cloud function

### How to use
These project has two functions handlers to create and list books from aws dynamo db

### Book entity
```
 
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
 
 ```

### AWS config
Set the SPRING_CLOUD_FUNCTION_DEFINITION to test functions on aws console

### Local test with serverless
Set SPRING_PROFILES_ACTIVE to local 


