import uw.syp.java.tools.Vic;
public class movetofront
{
    public static void main(String[] args)
    {
        Vic.reset( args );
        Vic    tim = new Vic();
        String pos = tim.getPosition();

        while ( tim.seesSlot() )
        {
            if ( tim.seesCD() )
                tim.takeCD();
            tim.moveOn();
        }

        while ( !pos.equals( tim.getPosition() ) )
            tim.backUp();

        while ( Vic.stackHasCD() )
        {
            tim.putCD();
            tim.moveOn();
        }
    }
}
