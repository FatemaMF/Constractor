public class Cconstractor
{

public double re, in;

public Cconstractor (double re, double in)
{
this.re=re;
this.in=in;
}

Cconstractor (Cconstractor c)
{
System.out.println("Copy constractor");
re=c.re;
in=c.in;
}

@Override public String toString()
{
return "(" + re + " +" + in + ")";
}

}
