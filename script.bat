javac -d Framework/WEB-INF/classes -cp Framework/lib/servlet-api.jar Framework/WEB-INF/classes/*.java
cd Framework/WEB-INF/classes
jar -cf framework.jar ./
xcopy /y framework.jar "..\..\..\jarwar"
cd ..\..\..\jarwar
xcopy /y framework.jar "..\Testframework\WEB-INF\lib\"
cd ../
javac -d TestFramework/WEB-INF/classes -cp TestFramework/WEB-INF/lib/framework.jar TestFramework/WEB-INF/classes/*.java
cd Testframework
jar -cf TestFramework.war ./
xcopy /y TestFramework.war "..\jarwar"
cd ../jarwar
xcopy /y TestFramework.war "C:\Program Files\Apache Software Foundation\Tomcat 10.0\webapps"