class Character
{
    String name;
    Character(String name)
    {
        this.name=name;
    }
    void attack()
    {
        System.out.println(name+" attacks!!!!!!");
    }
}
class Warrior extends Character
{
    Warrior(String name)
    {
        super(name);
    }
    @Override
    void attack()
    {
        System.out.println(name+" is attacking with a sword");
    }
}
class Archer extends Character
{
    Archer(String name)
    {
        super(name);
    }
    @Override
    void attack()
    {
        System.out.println(name+" is attacking with an arrow");
    }
}
class Mage extends Character
{
    Mage(String name)
    {
        super(name);
    }
    @Override
    void attack()
    {
        System.out.println(name+" is attacking with magic");
    }
}
public class Minigame
{
    public static void main(String[] args) 
    {

        Character c;
        c=new Character("CHARACTER");
        c.attack();
        c=new Warrior("Aragorn");
        c.attack();
        c=new Archer("Legolas");
        c.attack();
        c=new Mage("Gandalf");
        c.attack();
    }
}
