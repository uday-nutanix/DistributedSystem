package main;

import java.rmi.server.*;
import java.rmi.*;

public class RMIClient
{
    public static void main (String argv[])
    {
	// Parse the commandline to get the hostname where
	// the server object resides
	String host = "";

        if (argv.length == 1)
            {
		host = argv[0];
	    }
	else
	    {
		System.out.println("Usage: RMIClient <server>");
		System.exit(1);
	    }

	// Install a security manager.
	System.setSecurityManager(new RMISecurityManager());

	// Request a reference to the server object
	String name = "rmi://"+host+"/RMIServer";
	System.out.println("Looking up: "+name);
	
	ServerInterface server = null;
	try
	    {
		// In reality, Naming.lookup() will return an instance of
		// examples.rmi.RMIServer_stub. 
		// This is typecast into the ServerInterface, which is what
		// specifies the available server methods.
		server = (ServerInterface)Naming.lookup(name);
	    }
	catch(Exception e)
	    {
		System.out.println("Exception caught while looking up server " +e);
		System.exit(1);
	    }

	// Given a reference to the server object, it is now possible to 
	// invoke methods as usual:
	try
	    {
		server.setString("Foobar");
		System.out.println("String in server: "+server.getString());
	    }
	catch(Exception e)
	    {
		System.out.println("Exception caught while invoking method on server" +e);
		System.exit(1);
	    }
    }
}		