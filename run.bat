@ECHO OFF

"%JAVA_HOME%\bin\java" -Xms256m -Xmx256m -Xmn96m -XX:PermSize=64m -XX:MaxPermSize=128m -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -cp "lib/*;conf;" com.scsvision.gather.middleware.app.Application