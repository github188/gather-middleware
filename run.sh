export CURR_DIR=/usr/local/gather-middleware/
export CLASSPATH=$CURR_DIR/lib:$CURR_DIR/conf:$JAVA_HOME/lib:$JAVA_HOME/jre/lib
for jarfile in `ls $CURR_DIR/lib/*.jar`
do
 export CLASSPATH=$CLASSPATH:$jarfile
done
$JAVA_HOME/bin/java -Xms256m -Xmx256m -Xmn96m -XX:PermSize=64m -XX:MaxPermSize=128m -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -cp $CLASSPATH com.scsvision.gather.middleware.app.Application &