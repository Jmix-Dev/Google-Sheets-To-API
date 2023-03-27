Google Sheets to API
This project is a Java application that retrieves data from a Google Sheets spreadsheet and sends it to an API endpoint.

Dependencies:
This project uses the following dependencies:
google-api-client version 1.35.2
google-oauth-client-jetty version 1.34.1
google-api-services-sheets version v4-rev612-1.25.0
spring-web version 5.3.22
jackson-databind version 2.13.3
spring-boot-starter-logging version 2.7.2
httpclient version 4.5.13
javax.annotation-api version 1.3.2

Usage:
To use this application, you will need to provide your own Google Sheets API credentials and API endpoint URL. Follow these steps to get started:
Clone this repository to your local machine.
Create a new Google Sheets API project in the Google Cloud Console.
Download the API credentials JSON file and save it to the project directory as credentials.json.
Replace the spreadsheetId and range variables in the GoogleSheetsToAPI class with the ID and range of the Google Sheets spreadsheet you want to retrieve data from.
Replace the baseUrl variable in the GoogleSheetsToAPI class with the URL of the API endpoint you want to send the data to.
Run the application using your preferred IDE or build tool.
