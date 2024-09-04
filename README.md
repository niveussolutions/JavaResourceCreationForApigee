# JavaResourceCreationForApigee

****Clone the project and install local dependencies****

    1. Open the below mentioned github link 
        https://github.com/niveussolutions/JavaResourceCreationForApigee
        
    2. Clone the repository into your local system.
        Git clone https://github.com/niveussolutions/JavaResourceCreationForApigee
        
    3. Open the cloned repository **JavaResourceCreationForApigee**-> open lib folder
    
    4. Right click inside lib folder -> Right click -> open in terminal
    
    5. Run the below command
       mvn install:install-file -Dfile=<path-to-file> -D groupId=<group-id> -D artifactId=<artifact-id> -D version= 
       <version>-D packaging=<packaging>  Document

****Example:****
  1. mvn install:install-file -D file=message-flow-1.0.0.jar -D groupId=com.apigee.edge -D artifactId=message-flow -D 
       version=1.0.0 -Dpackaging=jar
     
  3. mvn install:install-file -D file=expressions-1.0.0.jar -D groupId=com.apigee.edge -D artifactId=expressions -D 
       version=1.0.0 -D packaging=jar
     
  
****Maven project using Eclipse****
    1. Install Java
    
    2. Install Maven
    
    3. Install and setup Eclipse 
    
      • Open Application
      
      • File > Import Maven Project > Existing Maven Projects >Next
      
      • Browse the cloned project folder > Finish
      
      
****Coding Structure for Java Callout Main Class****

    Update the code as per the need in the try block
    import com.apigee.flow.execution.ExecutionContext;
    import com.apigee.flow.execution.ExecutionResult;
    import com.apigee.flow.execution.spi.Execution;
    import com.apigee.flow.message.MessageContext;
    //@Component
    public class App implements Execution{
    public ExecutionResult execute(MessageContext messageContext, ExecutionContext executionContext) {
    try {
            messageContext.setVariable("foo", "Heloo");
            return ExecutionResult.SUCCESS;
        } 
    catch (Exception e) {
            return ExecutionResult.ABORT;
        }
        }
    }

****Build or Generate Project JAR file****

    • Right click on project
    • Select Run as > Maven Clean
    • Select Run as > Maven Install
    • Open your project Location > Target > ProjectName+-jar-with-dependencies.jar  
    
****This will be the jar which needs to be imported on Apigee as a jar resource****
****Note the class name in the javacallout should be the class qualified name**** 
for example : right click on /src/main/java copy qualifier name /testing-app/src/main/java/JavaApigee/test_app/AthenaDataFetcher.java here classname would be <ClassName>JavaApigee.test_app.AthenaDataFetcher</ClassName> 
