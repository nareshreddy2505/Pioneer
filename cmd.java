/*class Cmd
{
    int eid;
    String ename;
    Cmd(int eid, String ename)
    {
        this.eid=eid;
        this.ename=ename;
    }
    public String toString()
    {
        return "emp id=" +eid+    "emp name="+ename;
    }
    public static void main(String[] args)
    {
        Cmd c = new Cmd(33, "naresh");
        System.out.println(c);
        System.out.println(c.toString());
    }
}*/
/*class Cmd
{
    public static void main(String[] args)
    {
String s1= "naresh";
        s1.concat("reddy");
    System.out.println(s1);
        
        StringBuffer sb = new StringBuffer("viru");
        sb.append("sehwag");
        System.out.println(sb);
        
    
}
    
}*/
class Cmd
{
    public static void main(String[] args)
    {
        String s1= "naresh";
        StringBuffer sb = new StringBuffer(s1);
        System.out.println(sb.reverse());
        
        StringBuffer sb1 = new StringBuffer("viru");
        String z = sb1.toString();
    System.out.println(sb1);
        
        
    }
    
}






