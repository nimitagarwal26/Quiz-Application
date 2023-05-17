package easy.tuto.myquizapplication;

public class QuestionAnswer {

    public static String question[]={
            "In which directory XML layout files are stored?",
            "Which programming language is used for android application development?",
            "What does API stand for?",
            "Which one of the following is not a Java feature?",
            "What is the extension of java code files?",
            "Which environment variable is used to set the java path?",
            "JavaScript is a ___ -side programming language.",
            "Which JavaScript label catches all the values, except for the ones specified?",
            "Which are the correct “if” statements to execute certain code if “x” is equal to 2?",
            "Which data type is used to create a variable that should store text?",
            "What is the extension of compiled java classes?"
    };

    public static String choices[][]={
            {"/assets","/src","/res/values","/res/layout"},
            {"Java","PHP","JSX","NodeJS"},
            {"Algorithmic Protocol Interface","Accelerated Programming Interface","Application Programming Interface","None of above"},
            {"Object-oriented","Use of pointers","Portable","Dynamic and Extensible"},
            {".js",".txt",".java",".class"},
            {"MAVEN_Path","JavaPATH","JAVA","JAVA_HOME"},
            {" Client" ,"Server","Both" ,"None"},
            {"catch","label","try","default"},
            {" if(x 2)","if(x = 2)","if(x==2)","if(x != 2 )"},
            {"String","myString","txt","string"},
            {".js",".txt",".java",".class"}

    };

    public static String correctAnswers[]={
            "/res/layout",
            "Java",
            "Application Programming Interface",
            "Use of pointers",
            ".java",
            "JAVA_HOME",
            "Both",
            "default",
            "if(x==2)",
            "String",
            ".class"

    };

}
