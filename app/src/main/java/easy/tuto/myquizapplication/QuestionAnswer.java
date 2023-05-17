package easy.tuto.myquizapplication;

public class QuestionAnswer {

    public static String question[]={
            "In which directory XML layout files are stored?",
            "Which programming language is used for android application development?",
            "What does API stand for?",
            "Which one of the following is not a Java feature?",
            "What is the extension of java code files?",
            "Which environment variable is used to set the java path?"
    };

    public static String choices[][]={
            {"/assets","/src","/res/values","/res/layout"},
            {"Java","PHP","JSX","NodeJS"},
            {"Algorithmic Protocol Interface","Accelerated Programming Interface","Application Programming Interface","None of above"},
            {"Object-oriented","Use of pointers","Portable","Dynamic and Extensible"},
            {".js",".txt",".java",".class"},
            {"MAVEN_Path","JavaPATH","JAVA","JAVA_HOME"}

    };

    public static String correctAnswers[]={
            "/res/layout",
            "Java",
            "Application Programming Interface",
            "Use of pointers",
            ".java",
            "JAVA_HOME"

    };

}
