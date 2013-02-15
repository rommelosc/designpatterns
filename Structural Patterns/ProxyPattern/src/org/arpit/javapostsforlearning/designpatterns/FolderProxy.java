package org.arpit.javapostsforlearning.designpatterns;

public class FolderProxy implements IFolder {

	private Folder folder;
	private User user;

	public FolderProxy(User user) {
		this.user = user;
	}

	public void performOperations() {

		if (user.getUserName().equalsIgnoreCase("jojojo")
				&& user.getPassword().equalsIgnoreCase("mypass123")) {
			folder = new Folder();
			folder.performOperations();
		} else {
			System.out.println("You don't have access to this folder");
		}
	}
}