package main;


import java.rmi.server.UnicastRemoteObject;
import java.rmi.*;


public class RMIServer extends UnicastRemoteObject implements ServerInterface    
{
    private String myString = "";

    public RMIServer() throws RemoteException
    {
	super();
    }

    public RMIServer(String s) throws RemoteException
    {
	super();
	myString = s;
    }

    public void setString(String s) 
	throws RemoteException
    {
	this.myString = s;
    }

    public String getString() 
	throws RemoteException
    {
	return myString;
    }

    public static void main(String argv[])
    {
	try
	    {
		String name = "RMIServer";
		System.out.println("Registering as: \""+name+"\"");
		RMIServer theServer = new RMIServer();
		Naming.rebind(name,theServer);
		System.out.println(name+" ready...");
	    }
	catch(Exception e)
	    {
		System.out.println("Exception while registering: "+e);
	    }
    }
}