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
| firstName      | String | First name of the user                        | "Karthik"                     |
| lastName       | String | Last name of the user                         | "Sai"                      |
| email          | String | User's email address                          | "karthik.subramanian@example.com"     |
| phoneNumber    | String | User's contact number                         | "9845678901"               |
| street         | String | Street address                                | "12 Tidel Park Road"              |
| city           | String | City name                                     | "Chennai"                   |
| state          | String | State name                                    | "Tamil Nadu"              |
| zipCode        | String | Postal/ZIP code                               | "600100"                   |
| documentType   | String | Type of document (Aadhar, PAN, etc.)         | "Driving License"                   |
| documentNumber | String | Unique document identifier                    | "TN-01-2020-123456"           |

## Example Request Body
```json
{
    "firstName": "Karthik",
    "lastName": "Sai",
    "email": "karthik.sai@example.com",
    "phoneNumber": "9845678901",
    "street": "12 Tidel Park Road",
    "city": "Chennai",
    "state": "Tamil Nadu",
    "zipCode": "600100",
    "documentType": "Driving License",
    "documentNumber": "TN-01-2020-123456"
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


## Swagger UI Screenshots

<img width="732" alt="Screenshot 2025-02-07 at 6 30 09 PM" src="https://github.com/user-attachments/assets/0a0e9f7d-64fd-4d8a-8530-f67f458d9b83" />
<img width="725" alt="Screenshot 2025-02-07 at 6 30 33 PM" src="https://github.com/user-attachments/assets/3303c1dc-f6e6-4cbc-ae02-b39b05785d3b" />
<img width="733" alt="Screenshot 2025-02-07 at 6 31 09 PM" src="https://github.com/user-attachments/assets/799699bb-ce60-4165-9c6b-93127af42810" />



---


