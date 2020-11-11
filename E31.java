/*
 * 31. Write a Java program to check whether Java is installed on your computer.
Expected Output

Java Version: 1.8.0_71                                                            
Java Runtime Version: 1.8.0_71-b15                                                
Java Home: /opt/jdk/jdk1.8.0_71/jre                                               
Java Vendor: Oracle Corporation                                                   
Java Vendor URL: http://Java.oracle.com/                                          
Java Class Path: .

 */
package w3resourceExcersises;

public class E31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\nJava Version: "+System.getProperty("java.version"));
		System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
	    System.out.println("Java Home: "+System.getProperty("java.home"));
	    System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
	    System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
	    System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
	
	    /*
	     * The System.getProperty is part of java.lang, which is automatically imported in a Java application. This package 
	     * (java.lang) contains many commonly used classes, from NullPointerException to Object, Math, String and ever so
	     * many more.
	     * The java.lang.System class is a FINAL class, meaning that we cannot subclass it, therefore all methods are STATIC.
	     * The Java platform uses a Properties object to provide information about the local system and configuration and we
	     * call it System Properties.
	     * System Properties incluse information such as the current user, the current version of Java runtime (as seen in the 
	     * code above), and the file path-name separator.
	     * To update a System Property, we use the method System.setProperty.
	     * TIP: System.getProperty will ALWAYS return a String.
	     * MORE ABOUT SYSTEM PROPERTIES IN THE FOLLOWING WEBSITE (OFFICIAL DOCUMENTATION):
	     * https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html
	     */
	    
	}

}
