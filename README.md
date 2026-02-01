# Emp_jpa_restApi
So the RestApi  it handles employee opertions it lets you add a new employee update an existing employee
and modify key features like their highlights or salary details it also supports deleting an employee.
Essenatially these are the core task my API covers.
## {Features }-
            1 We use POSTMAPPING in my project to add the employee like employee name  Role of employee salary of emp 
            2 We use GETMAPPING in my project to featch all the employee 
            3 we use PUTMAPPING to update the existing employee by ID 
            4 WE use DELETEMAPPING to delete the employee By ID
## {HOW TO RUN }
   1 Clone the repository   
                 git clone https://github.com/yourname/Emp_jpa_restApi.git
   2 Open the project in STS  or intellij IDEA   
   3 Make sure you have 
     >java8 or above
     > Maven installed 
     > MYSQL(or H2)Date base
   4 Configure database details in  application.properties
   5 Run the project 
    Right click on the project 
    . select Run As  Spring Boot App
   6 Server will start on given port no
     Ex. ... 8080  or 9090 etc 
     
## API END point
METHOD           URL         DESCRIPTION 
POST          /emp/add     Add new employee
GET           /emp/all     Get all employee
PUT       /emp/update/{id}  Update employee by id
Delete    /emp/delete/{id}   Delete employee by id 

## Ex post REQUEST
Json
{
"name":"Rahul",
"role":"Developer",
"Salary":45000
}



##  {TOOLS}
 .Postman
 .Bowser (for Get request )


 ## Author 
   Ashish Rathi
   Java Developer
   
   
     
