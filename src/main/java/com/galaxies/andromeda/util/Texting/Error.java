
package com.galaxies.andromeda.util.Texting;

/**
 *
 * @author Azael
 */
@Deprecated
public class Error extends java.lang.Error
{
    public Error(String message, Throwable cause)
    {
        super(message,cause);
    }
    
    public Error(String message)
    {
        super(message);
    }
    
}
