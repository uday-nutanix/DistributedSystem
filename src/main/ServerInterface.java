package main;

//  Copyright Notice.
// 
//  ServerInterface - The interface of a simple RMI Server Object
//  
//  Copyright (C) 1998  Thomas Heide Clausen <T.Clausen@computer.org>
//
//  This program is free software; you can redistribute it and/or
//  modify it under the terms of the GNU General Public
//  License as published by the Free Software Foundation;
//  version 2 of the License.
//
//  This program is distributed in the hope that it will be useful,
//  but WITHOUT ANY WARRANTY; without even the implied warranty of
//  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
//  Library General Public License for more details.
//
//  You should have received a copy of the GNU General Public
//  License along with this program; if not, write to the
//  Free Software Foundation, Inc., 59 Temple Place - Suite 330,
//  Boston, MA  02111-1307, USA./  
// *************************************************************************

// Specify the package of this program. 
// Thus this file must be available under the name
//
//           examples/rmi/ServerInterface.java
//
// and the CLASSPATH variable must point to the directory containing
// the 'examples' directory.

import java.rmi.*;

public interface ServerInterface extends Remote
{

    public String getString()       throws RemoteException;
    public void setString(String s) throws RemoteException;

}