# customerInfo
 Customer Information of Company

 # First Controller - Request Parameters

## Overview
This document provides details about the request parameters required by the First Controller API. The API expects a JSON payload with user details and a document for verification.

## Request Format
The API accepts a POST request with a JSON body containing the following parameters:

### Request Parameters
| Parameter       | Type   | Description                                    | Example Value              |
|----------------|--------|------------------------------------------------|----------------------------|
| firstName      | String | First name of the user                        | "John"                     |
| lastName       | String | Last name of the user                         | "Doe"                      |
| email          | String | User's email address                          | "john.doe@example.com"     |
| phoneNumber    | String | User's contact number                         | "9876543210"               |
| street         | String | Street address                                | "123 Main St"              |
| city           | String | City name                                     | "Mumbai"                   |
| state          | String | State name                                    | "Maharashtra"              |
| zipCode        | String | Postal/ZIP code                               | "400001"                   |
| documentType   | String | Type of document (Aadhar, PAN, etc.)         | "Aadhar"                   |
| documentNumber | String | Unique document identifier                    | "1234-5678-9012"           |

## Example Request Body
```json
{
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com",
    "phoneNumber": "9876543210",
    "street": "123 Main St",
    "city": "Mumbai",
    "state": "Maharashtra",
    "zipCode": "400001",
    "documentType": "Aadhar",
    "documentNumber": "1234-5678-9012"
}
```

## API Endpoint
**Swagger URL: http://localhost:8080/swagger-ui/index.html#**

**POST http://localhost:8080/api/customers/save**

## Response
The API returns a JSON response confirming the received data or indicating an error if validation fails.

### Success Response in JSON
```
{
  "status": "success",
  "message": "Customer details saved successfully!"
}
```

### Error Response in JSON
```
Error: response status is 400

{
  "timestamp": "2025-02-06T18:31:31.516+00:00",
  "status": 400,
  "error": "Bad Request",
  "path": "/api/customers/save"
}
```

## Notes
- Ensure all fields are properly formatted before making a request.
- The `documentType` field should contain valid document types such as "Aadhar," "PAN," "Passport," etc.
- The API validates email format and phone number length.

---


