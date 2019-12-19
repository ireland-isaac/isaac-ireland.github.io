/** original work by chistianray */


package AppControlDemo;

/** original work by chistianray */

import java.util.HashMap;

// import AppControlDemo.*;

public class AppController
{
private Dispatcher dispatcher;

public AppController()
{
    dispatcher = new Dispatcher();
}

private boolean isAuthenticUser()
{
    System.out.println("user is Authenticated successfully.");
    return true;
}

private void trackRequest( String request)
{
    System.out.println("page requested: " + request);
}

public void dispatchRequest (String request)
{
    trackRequest(request);
    if (isAuthenticUser() )
    {
        dispatcher.dispatch(request);
    }
}


}
