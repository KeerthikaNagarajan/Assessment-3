public abstract class Book{
    String title;
    public abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book
{
    @Override
    public void setTitle(String s)
    {
        this.title=s;
    }
}
class Main {
    public static void main(String[] args)
    {
        MyBook obj=new MyBook();
        obj.setTitle("A tale of two cities");
        System.out.println("The title is:"+obj.getTitle());
    }
}