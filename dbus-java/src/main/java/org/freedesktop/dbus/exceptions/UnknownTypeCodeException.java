/*
   D-Bus Java Implementation
   Copyright (c) 2005-2006 Matthew Johnson
   Copyright (c) 2017-2019 David M.

   This program is free software; you can redistribute it and/or modify it
   under the terms of either the GNU Lesser General Public License Version 2 or the
   Academic Free Licence Version 2.1.

   Full licence texts are included in the LICENSE file with this program.
*/

package org.freedesktop.dbus.exceptions;

import org.freedesktop.dbus.interfaces.NonFatalException;

@SuppressWarnings("serial")
public class UnknownTypeCodeException extends DBusException implements NonFatalException
{
   public UnknownTypeCodeException(byte code)
   {
      super("Not a valid D-Bus type code: " + code);
   }
}
