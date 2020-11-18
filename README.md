# api-file-upload

API Endpoint:
http://localhost:8080/rest/upload/file

*Steps for Client Request*

**Option 1 (Use POSTMAN app)**
1) Open Postman app
2) New POST request with 
   url: http://localhost:8080/rest/upload/file
   body: form-data
    key: file
    value: <use sample "books_1.csv">
    
    
**Option 2 (Without POSTMAN app)**

POST /rest/upload/file HTTP/1.1
Host: localhost:8080
Cache-Control: no-cache
Postman-Token: 82d13528-5595-a322-21e0-9afbc82fc4fc
Content-Type: multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW

------WebKitFormBoundary7MA4YWxkTrZu0gW
Content-Disposition: form-data; name="file"; filename="books_1.csv"
Content-Type: application/vnd.ms-excel
------WebKitFormBoundary7MA4YWxkTrZu0gW--
