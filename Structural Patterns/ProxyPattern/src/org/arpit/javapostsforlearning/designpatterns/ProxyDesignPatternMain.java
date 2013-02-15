package org.arpit.javapostsforlearning.designpatterns;

/**
 * @author Arpit Mandliya
 * <a href="http://www.codeproject.com/Tips/468254/Proxy-design-pattern-in-java">
 * Proxy design pattern in java
 * </a>
 * 
 * Protection proxy example. 
 * 
 * A protection proxy controls access to the original object.
 * Protection proxies are useful when objects should have different access rights.
 * */
public class ProxyDesignPatternMain {

	public static void main(String[] args) {

		// When you click on folder,Lets say a GUI form will ask for userName
		// and password.
		// and this GUI will create this user object

		// If we give correct userName and password
		User user = new User("jojojo", "mypass123");
		FolderProxy folderProxy = new FolderProxy(user);
		System.out.println("When userName and password are correct:");
		folderProxy.performOperations();
		System.out.println("**************************************");
		// if we give wrong userName and Password
		User userWrong = new User("abc", "abc");
		FolderProxy folderProxyWrong = new FolderProxy(userWrong);
		System.out.println("When userName and password are incorrect:");
		folderProxyWrong.performOperations();
	}

}