public class Sport
{
    public static void main(String[] args)
    {
        Sports obj;
        obj=new Sports();
        System.out.println(obj.getName());
        obj.getNumberOfTeamMembers();
        obj=new Soccer();
        System.out.println(obj.getName());
        obj.getNumberOfTeamMembers();
    }
}
class Soccer extends Sports
{
    @Override
    String getName(){
        return "Soccer Class";
    }
    @Override
    void getNumberOfTeamMembers()
    {
        System.out.println( "Each team has 11 players in " + getName() );
    }
}
class Sports {
    String getName()
    {
        return "Generic Sports";
    }
    void getNumberOfTeamMembers()
    {
        System.out.println("Each team has n players in " + getName() );
    }
}
