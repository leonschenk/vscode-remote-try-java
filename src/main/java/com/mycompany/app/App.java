/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

import java.util.List;

import com.github.hypfvieh.bluetooth.DeviceManager;
import com.github.hypfvieh.bluetooth.wrapper.BluetoothAdapter;

import org.freedesktop.dbus.exceptions.DBusException;

public class App 
{
    public static void main( String[] args ) throws DBusException
    {
        System.out.println( "Hello Remote World!" );
        DeviceManager devMan = DeviceManager.createInstance(true);
        List<BluetoothAdapter> lijst = devMan.scanForBluetoothAdapters();
        for (BluetoothAdapter adapter : lijst) {
            System.out.println(adapter);
        }
    }
}
