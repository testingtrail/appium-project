Appium project - EyeEm case study

Installation
------------
- Make sure you have JDK (Java 11) in your machine
  - Edit Windows environment variables, JAVA_HOME: C:\Program Files\Java\jdk1.8.0_181
  - Edit Windows environment variables, Path: C:\Program Files\Java\jdk1.8.0_181\bin
- Make sure you have Maven
  - Edit Windows environment variables, Maven document states add M2_HOME only, but some programs still reference Maven folder with
           MAVEN_HOME, so, it’s safer to add both: C:\Libs\apache-maven-3.5.4
  - Edit Windows environment variables, Path: C:\Libs\apache-maven-3.5.4\bin
- Make sure you have Android SDK (should be part of system environment under path)
- Appium server should be installed
- Clone this repository
- Open the project in a desired IDE. Intellij was used for this project
- Wait for Maven to download all the dependencies

How to run
----------
- Make sure your appium server is up and running
- Go to config.properties file and set the values as per your device
- If using emulator uncomment this line in Eyeem_test.java
  - cap.setCapability("avd","<yourdevicenamehere>");
- Double click on the file named 'run.bat'
- You can check the folder 'target\surefire-reports\Suite' for results

Tools/Technologies used
-----------------------
- Java as programming language
- Appium for device automation driver
- Maven for dependency control
- TestNG for test case management 
