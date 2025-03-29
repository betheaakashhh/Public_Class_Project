# Public_Class_Project
Java Swing/JavaFX GUI app with login/registration, pop-up alerts, input validation, and secure local data storage. Combines Swing’s simplicity with JavaFX’s dynamic popups for error/success feedback. Demonstrates event handling, UI/UX design, and cross-toolkit integration.



# Java GUI Login/Registration System  
*A desktop app built with **AWT**, **Java Swing**, and **JavaFX** featuring login/register pages, pop-up alerts, and MySQL database integration.*  

## 🚀 Features  
- Login & registration forms with input validation.  
- JavaFX popup windows for success/error alerts.  
- **CRUD operations** via JDBC and MySQL.  

## ⚙️ Installation  
**1. Install JDK 17+**:  
Download from [Oracle](https://www.oracle.com/java/) and set `PATH`. Verify with `javac -version`.  

**2. Download MySQL Connector/J**:  
Get `mysql-connector-j-9.2.0.jar` from [MySQL’s official site](https://dev.mysql.com/downloads/connector/j/).  

**3. Configure Database**:  
- Create a MySQL database (e.g., `YourDatabaseName`) and a table for user data.  
- In `Accounts.java`, update these lines with your database details:  
  ```java
  private static final String DB_URL = "jdbc:mysql://localhost:3306/YourDatabaseName";  
  private static final String DB_USER = "<userId>";  
  private static final String DB_PASSWORD = "<password>";  
## 🚀 Features  
- Login & registration forms with input validation.  
- JavaFX popup windows for success/error alerts.  
- MySQL database integration for data storage.  

## ⚙️ Installation  
**1. Install JDK 17+**:  
Download from [Oracle](https://www.oracle.com/java/) and set `PATH`. Verify with `javac -version`.  

**2. Download MySQL Connector/J**:  
Get `mysql-connector-j-9.2.0.jar` from [MySQL’s official site](https://dev.mysql.com/downloads/connector/j/) (select "Platform Independent").  

**3. Compile & Run**:  
```bash
# Compile:  
javac -cp .;mysql-connector-j-9.2.0.jar YourMainClass.java  

# Run:  
java -cp .;mysql-connector-j-9.2.0.jar YourMainClass
```
## Issues:
- Compiling problem can be arises if your **.jar** file is not being addressed by the compile.
- This can be solved by storing .jar file within the folder
- minor issue also arise if you not used **.;** before **.jar** file

