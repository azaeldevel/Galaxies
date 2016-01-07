
package com.galaxies.andromeda.session;

import com.galaxies.andromeda.session.User;

/**
 *
 * @author Azael Reyes
 */
public class Credential 
{
    private User user;
    
    public Credential(User u)
    {
        user = u;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }
}
