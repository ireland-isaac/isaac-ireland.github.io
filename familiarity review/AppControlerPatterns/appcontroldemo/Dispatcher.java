/** original work by chistianray */

package appcontroldemo;

public class Dispatcher
{
    private PeanutsReview Peanuts;
    private CreedReview Creed;
    private SpectreReview Spectre;

    public Dispatcher()
    {
        Peanuts = new PeanutsReview();
        Creed = new CreedReview();
        Spectre = new SpectreReview();
    }

    public void dispatch( String request)
    {
        if( request.equalsIgnoreCase("peanuts") )
        {
            Peanuts.show();
        }
        else if( request.equalsIgnoreCase("Creed") )
        {
            Creed.show();
        }
        else
        {
            Spectre.show();
        }
    }

}