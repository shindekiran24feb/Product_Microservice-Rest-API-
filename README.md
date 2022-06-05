Project :- Backend Product Microservice (Rest API) using java Spring Boot

•	Download  Product_Microservice(Rest API). https://github.com/shindekiran24feb/Product_Microservice-Rest-API-.git

•	Product_Microservice(Rest API) folder inside you can see 4 files.
•	Open all Project files in IDE .
•	Configure MySQL Database (DB name  ‘h2’).
•	Run All API’s.
•	Open Postman software. And create Collection(Seller & Customer)
 
 Seller Domain :-
POST	http://localhost:8999/seller/	          Add Product
PUT	http://localhost:8999/seller/{Enter ID}  Update Product
GET	http://localhost:8999/seller/{enter ID}  Get Product by ID
GET	http://localhost:8999/seller/	           Get All Product
DEL	http://localhost:8999/seller/{Enter ID}  Delete Product by ID

Customer Domain :-
GET	http://localhost:8999/customer/search?query= {Enter Keyword}     Search Product by Keyword

Note:- Enter ID Like http://localhost:8999/seller/12 
