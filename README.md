# URL-HIT-COUNTER
Counting No of Hits on particular URL using Spring Boot


#### our project is having following endpoints
   * getCount
   * getCountByName

## Frameworks and languages used
* Spring
* java
* Postman-- for testing the APIs


## Data Flow
 * Controller
   ```
       - Controller hold all the endponts with method associated with them, when client query any api they HTTP dispatch directs
          that query to controller. It hold only endpoints.
   ```
* Services
  ```
      - It has actual logic(business logic) for a particular endpoints. 
          Here we have two methods to count number of hits on a  particular url
             - normal counter to just count no. of hits
             - count no of hits by a particular user and storing values in a HashMap as key and value pair.
  ```   
 
 ## Data Structure
 ```
   * Here we are using HashMap datastructure to storing number of count for a particular User.
```

