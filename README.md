# Conversaion Application

Application is based on conversion of the value from one type to another is the main objective he project

# Dev Info

* Dev URL :: localhost
* Dev Port :: 8080
* Dev Host URL :: http://localhost:8080

# Assesment

1) Rest API
2) Exception Handling 
3) Background Service

# Rest API

* End Point for Converion is :: /api/convert
* Request Method :: POST
* Request Content type :: application/json
* Request body :: 
```
{
    "type": Type Of Conversation, // KelvinToCelsius, PoundsToKilograms, MilesToKilometers
    "value": Value that wants to be convert
}
```
* Request Response ::
* Content Type :: application/json
* Body :: 
```
{
	"status": "OK",
	"message": Converted Value with given value
}
```
# Exception Handling 

if the code has been generate different type of exception while calculation the whole application crashed so the Exception handling is the main point to make all service need to stay runnable.

The exception is generate in Conversion then response body is 
```
{
	"status": "ERROR",
	"message": The message of error why the Exception is generated
}
```
# Background Service

Service is make point of the application that containt  the main bussiness logic of the application that can make all the working with data. 

Background service is to convert the value from one type to another type

* Kelvin to celsius 
	* Formula :: value ? 273.15 = celsius
* Pounds to kilograms
	* Formula :: value * 0.4536 = kilograms
* Miles to kilometers
	* Formula :: value * 1.60934 = kilometers