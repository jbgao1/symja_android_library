package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules98 { 
  public static IAST RULES = List( 
ISetDelayed(8870,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,p,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,Negate(C1))),Power(Times(C4,c,d,Sqr(Plus(q,C1))),-1)),x)),Dist(Times(Plus(Times(C2,q),C3),Power(Times(C2,d,Plus(q,C1)),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p)),x),x),Negate(Dist(Times(Sqr(b),p,Plus(p,Negate(C1)),Power(Times(C4,Sqr(Plus(q,C1))),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,Negate(C2)))),x),x)),Negate(Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),Power(Times(C2,d,Plus(q,C1)),-1)),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),LtQ(q,CN1),GtQ(p,C1),NeQ(q,QQ(-3L,2L))))),
ISetDelayed(8871,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),-1)),x),Negate(Dist(Times(C2,c,Plus(q,C1),Power(Times(b,Plus(p,C1)),-1)),Int(Times(x,Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,C1))),x),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),LtQ(q,CN1),LtQ(p,CN1)))),
ISetDelayed(8872,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),-1)),x)),Dist(Times(C2,c,Plus(q,C1),Power(Times(b,Plus(p,C1)),-1)),Int(Times(x,Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),LtQ(q,CN1),LtQ(p,CN1)))),
ISetDelayed(8873,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(d,q),Power(c,-1)),Subst(Int(Times(Power(Plus(a,Times(b,x)),p),Power(Power(Cos(x),Times(C2,Plus(q,C1))),-1)),x),x,ArcTan(Times(c,x))),x),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(e,Times(Sqr(c),d)),ILtQ(Times(C2,Plus(q,C1)),C0),Or(IntegerQ(q),GtQ(d,C0))))),
ISetDelayed(8874,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(d,Plus(q,C1D2)),Sqrt(Plus(C1,Times(Sqr(c),Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Int(Times(Power(Plus(C1,Times(Sqr(c),Sqr(x))),q),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p)),x),x),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(e,Times(Sqr(c),d)),ILtQ(Times(C2,Plus(q,C1)),C0),Not(Or(IntegerQ(q),GtQ(d,C0)))))),
ISetDelayed(8875,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),p_DEFAULT)),x_Symbol),
    Condition(Negate(Dist(Times(Power(d,q),Power(c,-1)),Subst(Int(Times(Power(Plus(a,Times(b,x)),p),Power(Power(Sin(x),Times(C2,Plus(q,C1))),-1)),x),x,ArcCot(Times(c,x))),x)),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(e,Times(Sqr(c),d)),ILtQ(Times(C2,Plus(q,C1)),C0),IntegerQ(q)))),
ISetDelayed(8876,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),p_DEFAULT)),x_Symbol),
    Condition(Negate(Dist(Times(Power(d,Plus(q,C1D2)),x,Sqrt(Times(Plus(C1,Times(Sqr(c),Sqr(x))),Power(Times(Sqr(c),Sqr(x)),-1))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Subst(Int(Times(Power(Plus(a,Times(b,x)),p),Power(Power(Sin(x),Times(C2,Plus(q,C1))),-1)),x),x,ArcCot(Times(c,x))),x)),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(e,Times(Sqr(c),d)),ILtQ(Times(C2,Plus(q,C1)),C0),Not(IntegerQ(q))))),
ISetDelayed(8877,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),-1),ArcTan(Times(c_DEFAULT,x_))),x_Symbol),
    Condition(Plus(Dist(Times(C1D2,CI),Int(Times(Log(Plus(C1,Times(CN1,CI,c,x))),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x),Negate(Dist(Times(C1D2,CI),Int(Times(Log(Plus(C1,Times(CI,c,x))),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x))),FreeQ(List(c,d,e),x))),
ISetDelayed(8878,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),-1),ArcCot(Times(c_DEFAULT,x_))),x_Symbol),
    Condition(Plus(Dist(Times(C1D2,CI),Int(Times(Log(Plus(C1,Times(CN1,CI,Power(Times(c,x),-1)))),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x),Negate(Dist(Times(C1D2,CI),Int(Times(Log(Plus(C1,Times(CI,Power(Times(c,x),-1)))),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x))),FreeQ(List(c,d,e),x))),
ISetDelayed(8879,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),-1),Plus(a_,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Dist(a,Int(Power(Plus(d,Times(e,Sqr(x))),-1),x),x),Dist(b,Int(Times(ArcTan(Times(c,x)),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x)),FreeQ(List(a,b,c,d,e),x))),
ISetDelayed(8880,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),-1),Plus(a_,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Dist(a,Int(Power(Plus(d,Times(e,Sqr(x))),-1),x),x),Dist(b,Int(Times(ArcCot(Times(c,x)),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x)),FreeQ(List(a,b,c,d,e),x))),
ISetDelayed(8881,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(With(List(Set(u,IntHide(Power(Plus(d,Times(e,Sqr(x))),q),x))),Plus(Dist(Plus(a,Times(b,ArcTan(Times(c,x)))),u,x),Negate(Dist(Times(b,c),Int(Times(u,Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x)))),And(FreeQ(List(a,b,c,d,e),x),Or(IntegerQ(q),ILtQ(Plus(q,C1D2),C0))))),
ISetDelayed(8882,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(With(List(Set(u,IntHide(Power(Plus(d,Times(e,Sqr(x))),q),x))),Plus(Dist(Plus(a,Times(b,ArcCot(Times(c,x)))),u,x),Dist(Times(b,c),Int(Times(u,Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e),x),Or(IntegerQ(q),ILtQ(Plus(q,C1D2),C0))))),
ISetDelayed(8883,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),Power(Plus(d,Times(e,Sqr(x))),q),x),x),And(FreeQ(List(a,b,c,d,e),x),IntegerQ(q),IGtQ(p,C0)))),
ISetDelayed(8884,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),Power(Plus(d,Times(e,Sqr(x))),q),x),x),And(FreeQ(List(a,b,c,d,e),x),IntegerQ(q),IGtQ(p,C0)))),
ISetDelayed(8885,Int(Times(Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(Times(Sqr(f),Power(e,-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C2))),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p)),x),x),Negate(Dist(Times(d,Sqr(f),Power(e,-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C2))),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),GtQ(p,C0),GtQ(m,C1)))),
ISetDelayed(8886,Int(Times(Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(Times(Sqr(f),Power(e,-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C2))),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p)),x),x),Negate(Dist(Times(d,Sqr(f),Power(e,-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C2))),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),GtQ(p,C0),GtQ(m,C1)))),
ISetDelayed(8887,Int(Times(Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(Power(d,-1),Int(Times(Power(Times(f,x),m),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p)),x),x),Negate(Dist(Times(e,Power(Times(d,Sqr(f)),-1)),Int(Times(Power(Times(f,x),Plus(m,C2)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),GtQ(p,C0),LtQ(m,CN1)))),
ISetDelayed(8888,Int(Times(Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(Power(d,-1),Int(Times(Power(Times(f,x),m),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p)),x),x),Negate(Dist(Times(e,Power(Times(d,Sqr(f)),-1)),Int(Times(Power(Times(f,x),Plus(m,C2)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),GtQ(p,C0),LtQ(m,CN1)))),
ISetDelayed(8889,Int(Times(x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(CI,Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,C1)),Power(Times(b,e,Plus(p,C1)),-1)),x)),Negate(Dist(Power(Times(c,d),-1),Int(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),Power(Plus(CI,Times(CN1,c,x)),-1)),x),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),IGtQ(p,C0)))),
ISetDelayed(8890,Int(Times(x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(CI,Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,C1)),Power(Times(b,e,Plus(p,C1)),-1)),x),Negate(Dist(Power(Times(c,d),-1),Int(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),Power(Plus(CI,Times(CN1,c,x)),-1)),x),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),IGtQ(p,C0)))),
ISetDelayed(8891,Int(Times(x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),-1)),x),Negate(Dist(Power(Times(b,c,d,Plus(p,C1)),-1),Int(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,C1)),x),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),Not(IGtQ(p,C0)),NeQ(p,CN1)))),
ISetDelayed(8892,Int(Times(x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(x,Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),-1)),x)),Dist(Power(Times(b,c,d,Plus(p,C1)),-1),Int(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,C1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),Not(IGtQ(p,C0)),NeQ(p,CN1)))),
ISetDelayed(8893,Int(Times(Power(Times(x_,Plus(d_,Times(e_DEFAULT,Sqr(x_)))),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(CI,Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,C1)),Power(Times(b,d,Plus(p,C1)),-1)),x)),Dist(Times(CI,Power(d,-1)),Int(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),Power(Times(x,Plus(CI,Times(c,x))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),GtQ(p,C0)))),
ISetDelayed(8894,Int(Times(Power(Times(x_,Plus(d_,Times(e_DEFAULT,Sqr(x_)))),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(CI,Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,C1)),Power(Times(b,d,Plus(p,C1)),-1)),x),Dist(Times(CI,Power(d,-1)),Int(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),Power(Times(x,Plus(CI,Times(c,x))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),GtQ(p,C0)))),
ISetDelayed(8895,Int(Times(Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),m),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),-1)),x),Negate(Dist(Times(f,m,Power(Times(b,c,d,Plus(p,C1)),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,C1))),x),x))),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(e,Times(Sqr(c),d)),LtQ(p,CN1)))),
ISetDelayed(8896,Int(Times(Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Times(f,x),m),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),-1)),x)),Dist(Times(f,m,Power(Times(b,c,d,Plus(p,C1)),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(e,Times(Sqr(c),d)),LtQ(p,CN1)))),
ISetDelayed(8897,Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1),Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(Int(ExpandIntegrand(Plus(a,Times(b,ArcTan(Times(c,x)))),Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x),And(FreeQ(List(a,b,c,d,e),x),IntegerQ(m),Not(And(EqQ(m,C1),NeQ(a,C0)))))),
ISetDelayed(8898,Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1),Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(Int(ExpandIntegrand(Plus(a,Times(b,ArcCot(Times(c,x)))),Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x),And(FreeQ(List(a,b,c,d,e),x),IntegerQ(m),Not(And(EqQ(m,C1),NeQ(a,C0)))))),
ISetDelayed(8899,Int(Times(x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),Power(Times(C2,e,Plus(q,C1)),-1)),x),Negate(Dist(Times(b,p,Power(Times(C2,c,Plus(q,C1)),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,Negate(C1)))),x),x))),And(FreeQ(List(a,b,c,d,e,q),x),EqQ(e,Times(Sqr(c),d)),GtQ(p,C0),NeQ(q,CN1)))),
ISetDelayed(8900,Int(Times(x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),Power(Times(C2,e,Plus(q,C1)),-1)),x),Dist(Times(b,p,Power(Times(C2,c,Plus(q,C1)),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,Negate(C1)))),x),x)),And(FreeQ(List(a,b,c,d,e,q),x),EqQ(e,Times(Sqr(c),d)),GtQ(p,C0),NeQ(q,CN1)))),
ISetDelayed(8901,Int(Times(x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-2),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1),Plus(d,Times(e,Sqr(x)))),-1)),x),Negate(Dist(Times(C4,Power(Times(Sqr(b),Plus(p,C1),Plus(p,C2)),-1)),Int(Times(x,Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,C2)),Power(Plus(d,Times(e,Sqr(x))),-2)),x),x)),Negate(Simp(Times(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,C2)),Power(Times(Sqr(b),e,Plus(p,C1),Plus(p,C2),Plus(d,Times(e,Sqr(x)))),-1)),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),LtQ(p,CN1),NeQ(p,CN2)))),
ISetDelayed(8902,Int(Times(x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-2),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(x,Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1),Plus(d,Times(e,Sqr(x)))),-1)),x)),Negate(Dist(Times(C4,Power(Times(Sqr(b),Plus(p,C1),Plus(p,C2)),-1)),Int(Times(x,Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,C2)),Power(Plus(d,Times(e,Sqr(x))),-2)),x),x)),Negate(Simp(Times(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,C2)),Power(Times(Sqr(b),e,Plus(p,C1),Plus(p,C2),Plus(d,Times(e,Sqr(x)))),-1)),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),LtQ(p,CN1),NeQ(p,CN2)))),
ISetDelayed(8903,Int(Times(Sqr(x_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Times(C4,Power(c,3),d,Sqr(Plus(q,C1))),-1)),x)),Negate(Dist(Power(Times(C2,Sqr(c),d,Plus(q,C1)),-1),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcTan(Times(c,x))))),x),x)),Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcTan(Times(c,x)))),Power(Times(C2,Sqr(c),d,Plus(q,C1)),-1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),LtQ(q,CN1),NeQ(q,QQ(-5L,2L))))),
ISetDelayed(8904,Int(Times(Sqr(x_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Times(C4,Power(c,3),d,Sqr(Plus(q,C1))),-1)),x),Negate(Dist(Power(Times(C2,Sqr(c),d,Plus(q,C1)),-1),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcCot(Times(c,x))))),x),x)),Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcCot(Times(c,x)))),Power(Times(C2,Sqr(c),d,Plus(q,C1)),-1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),LtQ(q,CN1),NeQ(q,QQ(-5L,2L))))),
ISetDelayed(8905,Int(Times(Sqr(x_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-2),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,C1)),Power(Times(C2,b,Power(c,3),Sqr(d),Plus(p,C1)),-1)),x),Dist(Times(b,p,Power(Times(C2,c),-1)),Int(Times(x,Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),-2)),x),x),Negate(Simp(Times(x,Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),Power(Times(C2,Sqr(c),d,Plus(d,Times(e,Sqr(x)))),-1)),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),GtQ(p,C0)))),
ISetDelayed(8906,Int(Times(Sqr(x_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-2),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,C1)),Power(Times(C2,b,Power(c,3),Sqr(d),Plus(p,C1)),-1)),x)),Negate(Dist(Times(b,p,Power(Times(C2,c),-1)),Int(Times(x,Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),-2)),x),x)),Negate(Simp(Times(x,Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),Power(Times(C2,Sqr(c),d,Plus(d,Times(e,Sqr(x)))),-1)),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),GtQ(p,C0)))),
ISetDelayed(8907,Int(Times(Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Times(c,d,Sqr(m)),-1)),x),Dist(Times(Sqr(f),Plus(m,Negate(C1)),Power(Times(Sqr(c),d,m),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C2))),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcTan(Times(c,x))))),x),x),Negate(Simp(Times(f,Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcTan(Times(c,x)))),Power(Times(Sqr(c),d,m),-1)),x))),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(e,Times(Sqr(c),d)),EqQ(Plus(m,Times(C2,q),C2),C0),LtQ(q,CN1)))),
ISetDelayed(8908,Int(Times(Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Times(c,d,Sqr(m)),-1)),x)),Dist(Times(Sqr(f),Plus(m,Negate(C1)),Power(Times(Sqr(c),d,m),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C2))),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcCot(Times(c,x))))),x),x),Negate(Simp(Times(f,Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcCot(Times(c,x)))),Power(Times(Sqr(c),d,m),-1)),x))),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(e,Times(Sqr(c),d)),EqQ(Plus(m,Times(C2,q),C2),C0),LtQ(q,CN1)))),
ISetDelayed(8909,Int(Times(Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(b,p,Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,Negate(C1))),Power(Times(c,d,Sqr(m)),-1)),x),Dist(Times(Sqr(f),Plus(m,Negate(C1)),Power(Times(Sqr(c),d,m),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C2))),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p)),x),x),Negate(Dist(Times(Sqr(b),p,Plus(p,Negate(C1)),Power(m,-2)),Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,Negate(C2)))),x),x)),Negate(Simp(Times(f,Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),Power(Times(Sqr(c),d,m),-1)),x))),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(e,Times(Sqr(c),d)),EqQ(Plus(m,Times(C2,q),C2),C0),LtQ(q,CN1),GtQ(p,C1)))),
ISetDelayed(8910,Int(Times(Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,p,Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,Negate(C1))),Power(Times(c,d,Sqr(m)),-1)),x)),Dist(Times(Sqr(f),Plus(m,Negate(C1)),Power(Times(Sqr(c),d,m),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C2))),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p)),x),x),Negate(Dist(Times(Sqr(b),p,Plus(p,Negate(C1)),Power(m,-2)),Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,Negate(C2)))),x),x)),Negate(Simp(Times(f,Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),Power(Times(Sqr(c),d,m),-1)),x))),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(e,Times(Sqr(c),d)),EqQ(Plus(m,Times(C2,q),C2),C0),LtQ(q,CN1),GtQ(p,C1)))),
ISetDelayed(8911,Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),-1)),x),Negate(Dist(Times(f,m,Power(Times(b,c,Plus(p,C1)),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,C1))),x),x))),And(FreeQ(List(a,b,c,d,e,f,m,q),x),EqQ(e,Times(Sqr(c),d)),EqQ(Plus(m,Times(C2,q),C2),C0),LtQ(p,CN1)))),
ISetDelayed(8912,Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),-1)),x)),Dist(Times(f,m,Power(Times(b,c,Plus(p,C1)),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f,m,q),x),EqQ(e,Times(Sqr(c),d)),EqQ(Plus(m,Times(C2,q),C2),C0),LtQ(p,CN1)))),
ISetDelayed(8913,Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),Power(Times(d,f,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,c,p,Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,Negate(C1)))),x),x))),And(FreeQ(List(a,b,c,d,e,f,m,q),x),EqQ(e,Times(Sqr(c),d)),EqQ(Plus(m,Times(C2,q),C3),C0),GtQ(p,C0),NeQ(m,CN1)))),
ISetDelayed(8914,Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),Power(Times(d,f,Plus(m,C1)),-1)),x),Dist(Times(b,c,p,Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,Negate(C1)))),x),x)),And(FreeQ(List(a,b,c,d,e,f,m,q),x),EqQ(e,Times(Sqr(c),d)),EqQ(Plus(m,Times(C2,q),C3),C0),GtQ(p,C0),NeQ(m,CN1)))),
ISetDelayed(8915,Int(Times(Power(Times(f_DEFAULT,x_),m_),Sqrt(Plus(d_,Times(e_DEFAULT,Sqr(x_)))),Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),Plus(m,C1)),Sqrt(Plus(d,Times(e,Sqr(x)))),Plus(a,Times(b,ArcTan(Times(c,x)))),Power(Times(f,Plus(m,C2)),-1)),x),Dist(Times(d,Power(Plus(m,C2),-1)),Int(Times(Power(Times(f,x),m),Plus(a,Times(b,ArcTan(Times(c,x)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x),Negate(Dist(Times(b,c,d,Power(Times(f,Plus(m,C2)),-1)),Int(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x))),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(e,Times(Sqr(c),d)),NeQ(m,CN2)))),
ISetDelayed(8916,Int(Times(Power(Times(f_DEFAULT,x_),m_),Sqrt(Plus(d_,Times(e_DEFAULT,Sqr(x_)))),Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),Plus(m,C1)),Sqrt(Plus(d,Times(e,Sqr(x)))),Plus(a,Times(b,ArcCot(Times(c,x)))),Power(Times(f,Plus(m,C2)),-1)),x),Dist(Times(d,Power(Plus(m,C2),-1)),Int(Times(Power(Times(f,x),m),Plus(a,Times(b,ArcCot(Times(c,x)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x),Dist(Times(b,c,d,Power(Times(f,Plus(m,C2)),-1)),Int(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x)),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(e,Times(Sqr(c),d)),NeQ(m,CN2)))),
ISetDelayed(8917,Int(Times(Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p)),x),x),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(e,Times(Sqr(c),d)),IGtQ(p,C0),IGtQ(q,C1),Or(EqQ(p,C1),IntegerQ(m))))),
ISetDelayed(8918,Int(Times(Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCot(Times(c_DEFAULT,x_)))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p)),x),x),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(e,Times(Sqr(c),d)),IGtQ(p,C0),IGtQ(q,C1),Or(EqQ(p,C1),IntegerQ(m))))),
ISetDelayed(8919,Int(Times(Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTan(Times(c_DEFAULT,x_)))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(d,Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,Negate(C1))),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p)),x),x),Dist(Times(Sqr(c),d,Power(f,-2)),Int(Times(Power(Times(f,x),Plus(m,C2)),Power(Plus(d,Times(e,Sqr(x))),Plus(q,Negate(C1))),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p)),x),x)),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(e,Times(Sqr(c),d)),GtQ(q,C0),IGtQ(p,C0),Or(RationalQ(m),And(EqQ(p,C1),IntegerQ(q))))))
  );
}
