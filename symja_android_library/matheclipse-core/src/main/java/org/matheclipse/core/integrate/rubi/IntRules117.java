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
public class IntRules117 { 
  public static IAST RULES = List( 
ISetDelayed(9778,Int(Times($p("§px",true),Power(Plus(f_,Times(g_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Times($s("§px"),Power(Plus(f,Times(g,Power(Plus(d,Times(e,Sqr(x))),p))),m),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n)),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(List(a,b,c,d,e,f,g),x),PolynomialQ($s("§px"),x),EqQ(e,Times(Sqr(c),d)),IGtQ(Plus(p,C1D2),C0),IntegersQ(m,n)))),
ISetDelayed(9779,Int(Times($p("§px",true),Power(Plus(f_,Times(g_DEFAULT,Power(Plus($p("d1"),Times($p("e1",true),x_)),p_),Power(Plus($p("d2"),Times($p("e2",true),x_)),p_))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Times($s("§px"),Power(Plus(f,Times(g,Power(Plus($s("d1"),Times($s("e1"),x)),p),Power(Plus($s("d2"),Times($s("e2"),x)),p))),m),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2"),f,g),x),PolynomialQ($s("§px"),x),EqQ(Plus($s("e1"),Times(CN1,c,$s("d1"))),C0),EqQ(Plus($s("e2"),Times(c,$s("d2"))),C0),IGtQ(Plus(p,C1D2),C0),IntegersQ(m,n)))),
ISetDelayed(9780,Int(Times($p("§rfx"),Power(ArcSinh(Times(c_DEFAULT,x_)),n_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Power(ArcSinh(Times(c,x)),n),$s("§rfx"),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(c,x),RationalFunctionQ($s("§rfx"),x),IGtQ(n,C0)))),
ISetDelayed(9781,Int(Times($p("§rfx"),Power(ArcCosh(Times(c_DEFAULT,x_)),n_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Power(ArcCosh(Times(c,x)),n),$s("§rfx"),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(c,x),RationalFunctionQ($s("§rfx"),x),IGtQ(n,C0)))),
ISetDelayed(9782,Int(Times($p("§rfx"),Power(Plus(a_,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times($s("§rfx"),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c),x),RationalFunctionQ($s("§rfx"),x),IGtQ(n,C0)))),
ISetDelayed(9783,Int(Times($p("§rfx"),Power(Plus(a_,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times($s("§rfx"),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c),x),RationalFunctionQ($s("§rfx"),x),IGtQ(n,C0)))),
ISetDelayed(9784,Int(Times($p("§rfx"),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_),Power(ArcSinh(Times(c_DEFAULT,x_)),n_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Times(Power(Plus(d,Times(e,Sqr(x))),p),Power(ArcSinh(Times(c,x)),n)),$s("§rfx"),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(List(c,d,e),x),RationalFunctionQ($s("§rfx"),x),IGtQ(n,C0),EqQ(e,Times(Sqr(c),d)),IntegerQ(Plus(p,Negate(C1D2)))))),
ISetDelayed(9785,Int(Times($p("§rfx"),Power(Plus($p("d1"),Times($p("e1",true),x_)),p_),Power(Plus($p("d2"),Times($p("e2",true),x_)),p_),Power(ArcCosh(Times(c_DEFAULT,x_)),n_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Times(Power(Plus($s("d1"),Times($s("e1"),x)),p),Power(Plus($s("d2"),Times($s("e2"),x)),p),Power(ArcCosh(Times(c,x)),n)),$s("§rfx"),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(List(c,$s("d1"),$s("e1"),$s("d2"),$s("e2")),x),RationalFunctionQ($s("§rfx"),x),IGtQ(n,C0),EqQ(Plus($s("e1"),Times(CN1,c,$s("d1"))),C0),EqQ(Plus($s("e2"),Times(c,$s("d2"))),C0),IntegerQ(Plus(p,Negate(C1D2)))))),
ISetDelayed(9786,Int(Times($p("§rfx"),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_),Power(Plus(a_,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(d,Times(e,Sqr(x))),p),Times($s("§rfx"),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e),x),RationalFunctionQ($s("§rfx"),x),IGtQ(n,C0),EqQ(e,Times(Sqr(c),d)),IntegerQ(Plus(p,Negate(C1D2)))))),
ISetDelayed(9787,Int(Times($p("§rfx"),Power(Plus($p("d1"),Times($p("e1",true),x_)),p_),Power(Plus($p("d2"),Times($p("e2",true),x_)),p_),Power(Plus(a_,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus($s("d1"),Times($s("e1"),x)),p),Power(Plus($s("d2"),Times($s("e2"),x)),p)),Times($s("§rfx"),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2")),x),RationalFunctionQ($s("§rfx"),x),IGtQ(n,C0),EqQ(Plus($s("e1"),Times(CN1,c,$s("d1"))),C0),EqQ(Plus($s("e2"),Times(c,$s("d2"))),C0),IntegerQ(Plus(p,Negate(C1D2)))))),
ISetDelayed(9788,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Plus(c_,Times(d_DEFAULT,x_))))),n_DEFAULT),x_Symbol),
    Condition(Dist(Power(d,-1),Subst(Int(Power(Plus(a,Times(b,ArcSinh(x))),n),x),x,Plus(c,Times(d,x))),x),FreeQ(List(a,b,c,d,n),x))),
ISetDelayed(9789,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Plus(c_,Times(d_DEFAULT,x_))))),n_DEFAULT),x_Symbol),
    Condition(Dist(Power(d,-1),Subst(Int(Power(Plus(a,Times(b,ArcCosh(x))),n),x),x,Plus(c,Times(d,x))),x),FreeQ(List(a,b,c,d,n),x))),
ISetDelayed(9790,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Plus(c_,Times(d_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Power(d,-1),Subst(Int(Times(Power(Plus(Times(Plus(Times(d,e),Times(CN1,c,f)),Power(d,-1)),Times(f,x,Power(d,-1))),m),Power(Plus(a,Times(b,ArcSinh(x))),n)),x),x,Plus(c,Times(d,x))),x),FreeQ(List(a,b,c,d,e,f,m,n),x))),
ISetDelayed(9791,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Plus(c_,Times(d_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Power(d,-1),Subst(Int(Times(Power(Plus(Times(Plus(Times(d,e),Times(CN1,c,f)),Power(d,-1)),Times(f,x,Power(d,-1))),m),Power(Plus(a,Times(b,ArcCosh(x))),n)),x),x,Plus(c,Times(d,x))),x),FreeQ(List(a,b,c,d,e,f,m,n),x))),
ISetDelayed(9792,Int(Times(Power(Plus(A_DEFAULT,Times(B_DEFAULT,x_),Times(C_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Plus(c_,Times(d_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Power(d,-1),Subst(Int(Times(Power(Plus(Times(CSymbol,Power(d,-2)),Times(CSymbol,Sqr(x),Power(d,-2))),p),Power(Plus(a,Times(b,ArcSinh(x))),n)),x),x,Plus(c,Times(d,x))),x),And(FreeQ(List(a,b,c,d,ASymbol,BSymbol,CSymbol,n,p),x),EqQ(Plus(Times(BSymbol,Plus(C1,Sqr(c))),Times(CN1,C2,ASymbol,c,d)),C0),EqQ(Plus(Times(C2,c,CSymbol),Times(CN1,BSymbol,d)),C0)))),
ISetDelayed(9793,Int(Times(Power(Plus(A_DEFAULT,Times(B_DEFAULT,x_),Times(C_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Plus(c_,Times(d_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Power(d,-1),Subst(Int(Times(Power(Plus(Times(CN1,CSymbol,Power(d,-2)),Times(CSymbol,Sqr(x),Power(d,-2))),p),Power(Plus(a,Times(b,ArcCosh(x))),n)),x),x,Plus(c,Times(d,x))),x),And(FreeQ(List(a,b,c,d,ASymbol,BSymbol,CSymbol,n,p),x),EqQ(Plus(Times(BSymbol,Plus(C1,Negate(Sqr(c)))),Times(C2,ASymbol,c,d)),C0),EqQ(Plus(Times(C2,c,CSymbol),Times(CN1,BSymbol,d)),C0)))),
ISetDelayed(9794,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(A_DEFAULT,Times(B_DEFAULT,x_),Times(C_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Plus(c_,Times(d_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Power(d,-1),Subst(Int(Times(Power(Plus(Times(Plus(Times(d,e),Times(CN1,c,f)),Power(d,-1)),Times(f,x,Power(d,-1))),m),Power(Plus(Times(CSymbol,Power(d,-2)),Times(CSymbol,Sqr(x),Power(d,-2))),p),Power(Plus(a,Times(b,ArcSinh(x))),n)),x),x,Plus(c,Times(d,x))),x),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol,CSymbol,m,n,p),x),EqQ(Plus(Times(BSymbol,Plus(C1,Sqr(c))),Times(CN1,C2,ASymbol,c,d)),C0),EqQ(Plus(Times(C2,c,CSymbol),Times(CN1,BSymbol,d)),C0)))),
ISetDelayed(9795,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(A_DEFAULT,Times(B_DEFAULT,x_),Times(C_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Plus(c_,Times(d_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Power(d,-1),Subst(Int(Times(Power(Plus(Times(Plus(Times(d,e),Times(CN1,c,f)),Power(d,-1)),Times(f,x,Power(d,-1))),m),Power(Plus(Times(CN1,CSymbol,Power(d,-2)),Times(CSymbol,Sqr(x),Power(d,-2))),p),Power(Plus(a,Times(b,ArcCosh(x))),n)),x),x,Plus(c,Times(d,x))),x),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol,CSymbol,m,n,p),x),EqQ(Plus(Times(BSymbol,Plus(C1,Negate(Sqr(c)))),Times(C2,ASymbol,c,d)),C0),EqQ(Plus(Times(C2,c,CSymbol),Times(CN1,BSymbol,d)),C0)))),
ISetDelayed(9796,Int(Sqrt(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Plus(c_,Times(d_DEFAULT,Sqr(x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(x,Sqrt(Plus(a,Times(b,ArcSinh(Plus(c,Times(d,Sqr(x)))))))),x),Negate(Simp(Times(Sqrt(Pi),x,Plus(Cosh(Times(a,Power(Times(C2,b),-1))),Times(CN1,c,Sinh(Times(a,Power(Times(C2,b),-1))))),FresnelC(Times(Sqrt(Times(CN1,c,Power(Times(Pi,b),-1))),Sqrt(Plus(a,Times(b,ArcSinh(Plus(c,Times(d,Sqr(x))))))))),Power(Times(Sqrt(Times(CN1,c,Power(b,-1))),Plus(Cosh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x)))))),Times(c,Sinh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x))))))))),-1)),x)),Simp(Times(Sqrt(Pi),x,Plus(Cosh(Times(a,Power(Times(C2,b),-1))),Times(c,Sinh(Times(a,Power(Times(C2,b),-1))))),FresnelS(Times(Sqrt(Times(CN1,c,Power(Times(Pi,b),-1))),Sqrt(Plus(a,Times(b,ArcSinh(Plus(c,Times(d,Sqr(x))))))))),Power(Times(Sqrt(Times(CN1,c,Power(b,-1))),Plus(Cosh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x)))))),Times(c,Sinh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x))))))))),-1)),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Sqr(c),CN1)))),
ISetDelayed(9797,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Plus(c_,Times(d_DEFAULT,Sqr(x_)))))),n_),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,ArcSinh(Plus(c,Times(d,Sqr(x)))))),n)),x),Dist(Times(C4,Sqr(b),n,Plus(n,Negate(C1))),Int(Power(Plus(a,Times(b,ArcSinh(Plus(c,Times(d,Sqr(x)))))),Plus(n,Negate(C2))),x),x),Negate(Simp(Times(C2,b,n,Sqrt(Plus(Times(C2,c,d,Sqr(x)),Times(Sqr(d),Power(x,4)))),Power(Plus(a,Times(b,ArcSinh(Plus(c,Times(d,Sqr(x)))))),Plus(n,Negate(C1))),Power(Times(d,x),-1)),x))),And(FreeQ(List(a,b,c,d),x),EqQ(Sqr(c),CN1),GtQ(n,C1)))),
ISetDelayed(9798,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Plus(c_,Times(d_DEFAULT,Sqr(x_)))))),-1),x_Symbol),
    Condition(Plus(Simp(Times(x,Plus(Times(c,Cosh(Times(a,Power(Times(C2,b),-1)))),Negate(Sinh(Times(a,Power(Times(C2,b),-1))))),CoshIntegral(Times(Plus(a,Times(b,ArcSinh(Plus(c,Times(d,Sqr(x)))))),Power(Times(C2,b),-1))),Power(Times(C2,b,Plus(Cosh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x)))))),Times(c,Sinh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x))))))))),-1)),x),Simp(Times(x,Plus(Cosh(Times(a,Power(Times(C2,b),-1))),Times(CN1,c,Sinh(Times(a,Power(Times(C2,b),-1))))),SinhIntegral(Times(Plus(a,Times(b,ArcSinh(Plus(c,Times(d,Sqr(x)))))),Power(Times(C2,b),-1))),Power(Times(C2,b,Plus(Cosh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x)))))),Times(c,Sinh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x))))))))),-1)),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Sqr(c),CN1)))),
ISetDelayed(9799,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Plus(c_,Times(d_DEFAULT,Sqr(x_)))))),CN1D2),x_Symbol),
    Condition(Plus(Simp(Times(Plus(c,C1),Sqrt(Times(C1D2,Pi)),x,Plus(Cosh(Times(a,Power(Times(C2,b),-1))),Negate(Sinh(Times(a,Power(Times(C2,b),-1))))),Erfi(Times(Sqrt(Plus(a,Times(b,ArcSinh(Plus(c,Times(d,Sqr(x))))))),Power(Times(C2,b),CN1D2))),Power(Times(C2,Sqrt(b),Plus(Cosh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x)))))),Times(c,Sinh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x))))))))),-1)),x),Simp(Times(Plus(c,Negate(C1)),Sqrt(Times(C1D2,Pi)),x,Plus(Cosh(Times(a,Power(Times(C2,b),-1))),Sinh(Times(a,Power(Times(C2,b),-1)))),Erf(Times(Sqrt(Plus(a,Times(b,ArcSinh(Plus(c,Times(d,Sqr(x))))))),Power(Times(C2,b),CN1D2))),Power(Times(C2,Sqrt(b),Plus(Cosh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x)))))),Times(c,Sinh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x))))))))),-1)),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Sqr(c),CN1)))),
ISetDelayed(9800,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Plus(c_,Times(d_DEFAULT,Sqr(x_)))))),QQ(-3L,2L)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqrt(Plus(Times(C2,c,d,Sqr(x)),Times(Sqr(d),Power(x,4)))),Power(Times(b,d,x,Sqrt(Plus(a,Times(b,ArcSinh(Plus(c,Times(d,Sqr(x)))))))),-1)),x)),Negate(Simp(Times(Power(Times(CN1,c,Power(b,-1)),QQ(3L,2L)),Sqrt(Pi),x,Plus(Cosh(Times(a,Power(Times(C2,b),-1))),Times(CN1,c,Sinh(Times(a,Power(Times(C2,b),-1))))),FresnelC(Times(Sqrt(Times(CN1,c,Power(Times(Pi,b),-1))),Sqrt(Plus(a,Times(b,ArcSinh(Plus(c,Times(d,Sqr(x))))))))),Power(Plus(Cosh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x)))))),Times(c,Sinh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x)))))))),-1)),x)),Simp(Times(Power(Times(CN1,c,Power(b,-1)),QQ(3L,2L)),Sqrt(Pi),x,Plus(Cosh(Times(a,Power(Times(C2,b),-1))),Times(c,Sinh(Times(a,Power(Times(C2,b),-1))))),FresnelS(Times(Sqrt(Times(CN1,c,Power(Times(Pi,b),-1))),Sqrt(Plus(a,Times(b,ArcSinh(Plus(c,Times(d,Sqr(x))))))))),Power(Plus(Cosh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x)))))),Times(c,Sinh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x)))))))),-1)),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Sqr(c),CN1)))),
ISetDelayed(9801,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Plus(c_,Times(d_DEFAULT,Sqr(x_)))))),-2),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqrt(Plus(Times(C2,c,d,Sqr(x)),Times(Sqr(d),Power(x,4)))),Power(Times(C2,b,d,x,Plus(a,Times(b,ArcSinh(Plus(c,Times(d,Sqr(x))))))),-1)),x)),Simp(Times(x,Plus(Cosh(Times(a,Power(Times(C2,b),-1))),Times(CN1,c,Sinh(Times(a,Power(Times(C2,b),-1))))),CoshIntegral(Times(Plus(a,Times(b,ArcSinh(Plus(c,Times(d,Sqr(x)))))),Power(Times(C2,b),-1))),Power(Times(C4,Sqr(b),Plus(Cosh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x)))))),Times(c,Sinh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x))))))))),-1)),x),Simp(Times(x,Plus(Times(c,Cosh(Times(a,Power(Times(C2,b),-1)))),Negate(Sinh(Times(a,Power(Times(C2,b),-1))))),SinhIntegral(Times(Plus(a,Times(b,ArcSinh(Plus(c,Times(d,Sqr(x)))))),Power(Times(C2,b),-1))),Power(Times(C4,Sqr(b),Plus(Cosh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x)))))),Times(c,Sinh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x))))))))),-1)),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Sqr(c),CN1)))),
ISetDelayed(9802,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Plus(c_,Times(d_DEFAULT,Sqr(x_)))))),n_),x_Symbol),
    Condition(Plus(Negate(Simp(Times(x,Power(Plus(a,Times(b,ArcSinh(Plus(c,Times(d,Sqr(x)))))),Plus(n,C2)),Power(Times(C4,Sqr(b),Plus(n,C1),Plus(n,C2)),-1)),x)),Dist(Power(Times(C4,Sqr(b),Plus(n,C1),Plus(n,C2)),-1),Int(Power(Plus(a,Times(b,ArcSinh(Plus(c,Times(d,Sqr(x)))))),Plus(n,C2)),x),x),Simp(Times(Sqrt(Plus(Times(C2,c,d,Sqr(x)),Times(Sqr(d),Power(x,4)))),Power(Plus(a,Times(b,ArcSinh(Plus(c,Times(d,Sqr(x)))))),Plus(n,C1)),Power(Times(C2,b,d,Plus(n,C1),x),-1)),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Sqr(c),CN1),LtQ(n,CN1),NeQ(n,CN2)))),
ISetDelayed(9803,Int(Sqrt(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Plus(C1,Times(d_DEFAULT,Sqr(x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(C2,Sqrt(Plus(a,Times(b,ArcCosh(Plus(C1,Times(d,Sqr(x))))))),Sqr(Sinh(Times(C1D2,ArcCosh(Plus(C1,Times(d,Sqr(x))))))),Power(Times(d,x),-1)),x),Simp(Times(Sqrt(b),Sqrt(Times(C1D2,Pi)),Plus(Cosh(Times(a,Power(Times(C2,b),-1))),Sinh(Times(a,Power(Times(C2,b),-1)))),Sinh(Times(C1D2,ArcCosh(Plus(C1,Times(d,Sqr(x)))))),Erf(Times(Power(Times(C2,b),CN1D2),Sqrt(Plus(a,Times(b,ArcCosh(Plus(C1,Times(d,Sqr(x))))))))),Power(Times(d,x),-1)),x),Negate(Simp(Times(Sqrt(b),Sqrt(Times(C1D2,Pi)),Plus(Cosh(Times(a,Power(Times(C2,b),-1))),Negate(Sinh(Times(a,Power(Times(C2,b),-1))))),Sinh(Times(C1D2,ArcCosh(Plus(C1,Times(d,Sqr(x)))))),Erfi(Times(Power(Times(C2,b),CN1D2),Sqrt(Plus(a,Times(b,ArcCosh(Plus(C1,Times(d,Sqr(x))))))))),Power(Times(d,x),-1)),x))),FreeQ(List(a,b,d),x))),
ISetDelayed(9804,Int(Sqrt(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Plus(CN1,Times(d_DEFAULT,Sqr(x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(C2,Sqrt(Plus(a,Times(b,ArcCosh(Plus(CN1,Times(d,Sqr(x))))))),Sqr(Cosh(Times(C1D2,ArcCosh(Plus(CN1,Times(d,Sqr(x))))))),Power(Times(d,x),-1)),x),Negate(Simp(Times(Sqrt(b),Sqrt(Times(C1D2,Pi)),Plus(Cosh(Times(a,Power(Times(C2,b),-1))),Sinh(Times(a,Power(Times(C2,b),-1)))),Cosh(Times(C1D2,ArcCosh(Plus(CN1,Times(d,Sqr(x)))))),Erf(Times(Power(Times(C2,b),CN1D2),Sqrt(Plus(a,Times(b,ArcCosh(Plus(CN1,Times(d,Sqr(x))))))))),Power(Times(d,x),-1)),x)),Negate(Simp(Times(Sqrt(b),Sqrt(Times(C1D2,Pi)),Plus(Cosh(Times(a,Power(Times(C2,b),-1))),Negate(Sinh(Times(a,Power(Times(C2,b),-1))))),Cosh(Times(C1D2,ArcCosh(Plus(CN1,Times(d,Sqr(x)))))),Erfi(Times(Power(Times(C2,b),CN1D2),Sqrt(Plus(a,Times(b,ArcCosh(Plus(CN1,Times(d,Sqr(x))))))))),Power(Times(d,x),-1)),x))),FreeQ(List(a,b,d),x))),
ISetDelayed(9805,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Plus(c_,Times(d_DEFAULT,Sqr(x_)))))),n_),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,ArcCosh(Plus(c,Times(d,Sqr(x)))))),n)),x),Dist(Times(C4,Sqr(b),n,Plus(n,Negate(C1))),Int(Power(Plus(a,Times(b,ArcCosh(Plus(c,Times(d,Sqr(x)))))),Plus(n,Negate(C2))),x),x),Negate(Simp(Times(C2,b,n,Plus(Times(C2,c,d,Sqr(x)),Times(Sqr(d),Power(x,4))),Power(Plus(a,Times(b,ArcCosh(Plus(c,Times(d,Sqr(x)))))),Plus(n,Negate(C1))),Power(Times(d,x,Sqrt(Plus(CN1,c,Times(d,Sqr(x)))),Sqrt(Plus(C1,c,Times(d,Sqr(x))))),-1)),x))),And(FreeQ(List(a,b,c,d),x),EqQ(Sqr(c),C1),GtQ(n,C1)))),
ISetDelayed(9806,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Plus(C1,Times(d_DEFAULT,Sqr(x_)))))),-1),x_Symbol),
    Condition(Plus(Simp(Times(x,Cosh(Times(a,Power(Times(C2,b),-1))),CoshIntegral(Times(Plus(a,Times(b,ArcCosh(Plus(C1,Times(d,Sqr(x)))))),Power(Times(C2,b),-1))),Power(Times(CSqrt2,b,Sqrt(Times(d,Sqr(x)))),-1)),x),Negate(Simp(Times(x,Sinh(Times(a,Power(Times(C2,b),-1))),SinhIntegral(Times(Plus(a,Times(b,ArcCosh(Plus(C1,Times(d,Sqr(x)))))),Power(Times(C2,b),-1))),Power(Times(CSqrt2,b,Sqrt(Times(d,Sqr(x)))),-1)),x))),FreeQ(List(a,b,d),x))),
ISetDelayed(9807,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Plus(CN1,Times(d_DEFAULT,Sqr(x_)))))),-1),x_Symbol),
    Condition(Plus(Negate(Simp(Times(x,Sinh(Times(a,Power(Times(C2,b),-1))),CoshIntegral(Times(Plus(a,Times(b,ArcCosh(Plus(CN1,Times(d,Sqr(x)))))),Power(Times(C2,b),-1))),Power(Times(CSqrt2,b,Sqrt(Times(d,Sqr(x)))),-1)),x)),Simp(Times(x,Cosh(Times(a,Power(Times(C2,b),-1))),SinhIntegral(Times(Plus(a,Times(b,ArcCosh(Plus(CN1,Times(d,Sqr(x)))))),Power(Times(C2,b),-1))),Power(Times(CSqrt2,b,Sqrt(Times(d,Sqr(x)))),-1)),x)),FreeQ(List(a,b,d),x))),
ISetDelayed(9808,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Plus(C1,Times(d_DEFAULT,Sqr(x_)))))),CN1D2),x_Symbol),
    Condition(Plus(Simp(Times(Sqrt(Times(C1D2,Pi)),Plus(Cosh(Times(a,Power(Times(C2,b),-1))),Negate(Sinh(Times(a,Power(Times(C2,b),-1))))),Sinh(Times(C1D2,ArcCosh(Plus(C1,Times(d,Sqr(x)))))),Erfi(Times(Sqrt(Plus(a,Times(b,ArcCosh(Plus(C1,Times(d,Sqr(x))))))),Power(Times(C2,b),CN1D2))),Power(Times(Sqrt(b),d,x),-1)),x),Simp(Times(Sqrt(Times(C1D2,Pi)),Plus(Cosh(Times(a,Power(Times(C2,b),-1))),Sinh(Times(a,Power(Times(C2,b),-1)))),Sinh(Times(C1D2,ArcCosh(Plus(C1,Times(d,Sqr(x)))))),Erf(Times(Sqrt(Plus(a,Times(b,ArcCosh(Plus(C1,Times(d,Sqr(x))))))),Power(Times(C2,b),CN1D2))),Power(Times(Sqrt(b),d,x),-1)),x)),FreeQ(List(a,b,d),x))),
ISetDelayed(9809,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Plus(CN1,Times(d_DEFAULT,Sqr(x_)))))),CN1D2),x_Symbol),
    Condition(Plus(Simp(Times(Sqrt(Times(C1D2,Pi)),Plus(Cosh(Times(a,Power(Times(C2,b),-1))),Negate(Sinh(Times(a,Power(Times(C2,b),-1))))),Cosh(Times(C1D2,ArcCosh(Plus(CN1,Times(d,Sqr(x)))))),Erfi(Times(Sqrt(Plus(a,Times(b,ArcCosh(Plus(CN1,Times(d,Sqr(x))))))),Power(Times(C2,b),CN1D2))),Power(Times(Sqrt(b),d,x),-1)),x),Negate(Simp(Times(Sqrt(Times(C1D2,Pi)),Plus(Cosh(Times(a,Power(Times(C2,b),-1))),Sinh(Times(a,Power(Times(C2,b),-1)))),Cosh(Times(C1D2,ArcCosh(Plus(CN1,Times(d,Sqr(x)))))),Erf(Times(Sqrt(Plus(a,Times(b,ArcCosh(Plus(CN1,Times(d,Sqr(x))))))),Power(Times(C2,b),CN1D2))),Power(Times(Sqrt(b),d,x),-1)),x))),FreeQ(List(a,b,d),x))),
ISetDelayed(9810,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Plus(C1,Times(d_DEFAULT,Sqr(x_)))))),QQ(-3L,2L)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqrt(Times(d,Sqr(x))),Sqrt(Plus(C2,Times(d,Sqr(x)))),Power(Times(b,d,x,Sqrt(Plus(a,Times(b,ArcCosh(Plus(C1,Times(d,Sqr(x)))))))),-1)),x)),Negate(Simp(Times(Sqrt(Times(C1D2,Pi)),Plus(Cosh(Times(a,Power(Times(C2,b),-1))),Sinh(Times(a,Power(Times(C2,b),-1)))),Sinh(Times(C1D2,ArcCosh(Plus(C1,Times(d,Sqr(x)))))),Erf(Times(Sqrt(Plus(a,Times(b,ArcCosh(Plus(C1,Times(d,Sqr(x))))))),Power(Times(C2,b),CN1D2))),Power(Times(Power(b,QQ(3L,2L)),d,x),-1)),x)),Simp(Times(Sqrt(Times(C1D2,Pi)),Plus(Cosh(Times(a,Power(Times(C2,b),-1))),Negate(Sinh(Times(a,Power(Times(C2,b),-1))))),Sinh(Times(C1D2,ArcCosh(Plus(C1,Times(d,Sqr(x)))))),Erfi(Times(Sqrt(Plus(a,Times(b,ArcCosh(Plus(C1,Times(d,Sqr(x))))))),Power(Times(C2,b),CN1D2))),Power(Times(Power(b,QQ(3L,2L)),d,x),-1)),x)),FreeQ(List(a,b,d),x))),
ISetDelayed(9811,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Plus(CN1,Times(d_DEFAULT,Sqr(x_)))))),QQ(-3L,2L)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqrt(Times(d,Sqr(x))),Sqrt(Plus(CN2,Times(d,Sqr(x)))),Power(Times(b,d,x,Sqrt(Plus(a,Times(b,ArcCosh(Plus(CN1,Times(d,Sqr(x)))))))),-1)),x)),Simp(Times(Sqrt(Times(C1D2,Pi)),Plus(Cosh(Times(a,Power(Times(C2,b),-1))),Sinh(Times(a,Power(Times(C2,b),-1)))),Cosh(Times(C1D2,ArcCosh(Plus(CN1,Times(d,Sqr(x)))))),Erf(Times(Sqrt(Plus(a,Times(b,ArcCosh(Plus(CN1,Times(d,Sqr(x))))))),Power(Times(C2,b),CN1D2))),Power(Times(Power(b,QQ(3L,2L)),d,x),-1)),x),Simp(Times(Sqrt(Times(C1D2,Pi)),Plus(Cosh(Times(a,Power(Times(C2,b),-1))),Negate(Sinh(Times(a,Power(Times(C2,b),-1))))),Cosh(Times(C1D2,ArcCosh(Plus(CN1,Times(d,Sqr(x)))))),Erfi(Times(Sqrt(Plus(a,Times(b,ArcCosh(Plus(CN1,Times(d,Sqr(x))))))),Power(Times(C2,b),CN1D2))),Power(Times(Power(b,QQ(3L,2L)),d,x),-1)),x)),FreeQ(List(a,b,d),x))),
ISetDelayed(9812,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Plus(C1,Times(d_DEFAULT,Sqr(x_)))))),-2),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqrt(Times(d,Sqr(x))),Sqrt(Plus(C2,Times(d,Sqr(x)))),Power(Times(C2,b,d,x,Plus(a,Times(b,ArcCosh(Plus(C1,Times(d,Sqr(x))))))),-1)),x)),Negate(Simp(Times(x,Sinh(Times(a,Power(Times(C2,b),-1))),CoshIntegral(Times(Plus(a,Times(b,ArcCosh(Plus(C1,Times(d,Sqr(x)))))),Power(Times(C2,b),-1))),Power(Times(C2,CSqrt2,Sqr(b),Sqrt(Times(d,Sqr(x)))),-1)),x)),Simp(Times(x,Cosh(Times(a,Power(Times(C2,b),-1))),SinhIntegral(Times(Plus(a,Times(b,ArcCosh(Plus(C1,Times(d,Sqr(x)))))),Power(Times(C2,b),-1))),Power(Times(C2,CSqrt2,Sqr(b),Sqrt(Times(d,Sqr(x)))),-1)),x)),FreeQ(List(a,b,d),x))),
ISetDelayed(9813,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Plus(CN1,Times(d_DEFAULT,Sqr(x_)))))),-2),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqrt(Times(d,Sqr(x))),Sqrt(Plus(CN2,Times(d,Sqr(x)))),Power(Times(C2,b,d,x,Plus(a,Times(b,ArcCosh(Plus(CN1,Times(d,Sqr(x))))))),-1)),x)),Simp(Times(x,Cosh(Times(a,Power(Times(C2,b),-1))),CoshIntegral(Times(Plus(a,Times(b,ArcCosh(Plus(CN1,Times(d,Sqr(x)))))),Power(Times(C2,b),-1))),Power(Times(C2,CSqrt2,Sqr(b),Sqrt(Times(d,Sqr(x)))),-1)),x),Negate(Simp(Times(x,Sinh(Times(a,Power(Times(C2,b),-1))),SinhIntegral(Times(Plus(a,Times(b,ArcCosh(Plus(CN1,Times(d,Sqr(x)))))),Power(Times(C2,b),-1))),Power(Times(C2,CSqrt2,Sqr(b),Sqrt(Times(d,Sqr(x)))),-1)),x))),FreeQ(List(a,b,d),x))),
ISetDelayed(9814,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Plus(c_,Times(d_DEFAULT,Sqr(x_)))))),n_),x_Symbol),
    Condition(Plus(Negate(Simp(Times(x,Power(Plus(a,Times(b,ArcCosh(Plus(c,Times(d,Sqr(x)))))),Plus(n,C2)),Power(Times(C4,Sqr(b),Plus(n,C1),Plus(n,C2)),-1)),x)),Dist(Power(Times(C4,Sqr(b),Plus(n,C1),Plus(n,C2)),-1),Int(Power(Plus(a,Times(b,ArcCosh(Plus(c,Times(d,Sqr(x)))))),Plus(n,C2)),x),x),Simp(Times(Plus(Times(C2,c,Sqr(x)),Times(d,Power(x,4))),Power(Plus(a,Times(b,ArcCosh(Plus(c,Times(d,Sqr(x)))))),Plus(n,C1)),Power(Times(C2,b,Plus(n,C1),x,Sqrt(Plus(CN1,c,Times(d,Sqr(x)))),Sqrt(Plus(C1,c,Times(d,Sqr(x))))),-1)),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Sqr(c),C1),LtQ(n,CN1),NeQ(n,CN2)))),
ISetDelayed(9815,Int(Times(Power(x_,-1),Power(ArcSinh(Times(a_DEFAULT,Power(x_,p_))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Power(p,-1),Subst(Int(Times(Power(x,n),Coth(x)),x),x,ArcSinh(Times(a,Power(x,p)))),x),And(FreeQ(List(a,p),x),IGtQ(n,C0)))),
ISetDelayed(9816,Int(Times(Power(x_,-1),Power(ArcCosh(Times(a_DEFAULT,Power(x_,p_))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Power(p,-1),Subst(Int(Times(Power(x,n),Tanh(x)),x),x,ArcCosh(Times(a,Power(x,p)))),x),And(FreeQ(List(a,p),x),IGtQ(n,C0)))),
ISetDelayed(9817,Int(Times(u_DEFAULT,Power(ArcSinh(Times(c_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))),-1))),m_DEFAULT)),x_Symbol),
    Condition(Int(Times(u,Power(ArcCsch(Plus(Times(a,Power(c,-1)),Times(b,Power(x,n),Power(c,-1)))),m)),x),FreeQ(List(a,b,c,n,m),x))),
ISetDelayed(9818,Int(Times(u_DEFAULT,Power(ArcCosh(Times(c_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))),-1))),m_DEFAULT)),x_Symbol),
    Condition(Int(Times(u,Power(ArcSech(Plus(Times(a,Power(c,-1)),Times(b,Power(x,n),Power(c,-1)))),m)),x),FreeQ(List(a,b,c,n,m),x))),
ISetDelayed(9819,Int(Times(Power(Plus(CN1,Times(b_DEFAULT,Sqr(x_))),CN1D2),Power(ArcSinh(Sqrt(Plus(CN1,Times(b_DEFAULT,Sqr(x_))))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Sqrt(Times(b,Sqr(x))),Power(Times(b,x),-1)),Subst(Int(Times(Power(ArcSinh(x),n),Power(Plus(C1,Sqr(x)),CN1D2)),x),x,Sqrt(Plus(CN1,Times(b,Sqr(x))))),x),FreeQ(List(b,n),x))),
ISetDelayed(9820,Int(Times(Power(Plus(C1,Times(b_DEFAULT,Sqr(x_))),CN1D2),Power(ArcCosh(Sqrt(Plus(C1,Times(b_DEFAULT,Sqr(x_))))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(CN1,Sqrt(Plus(C1,Times(b,Sqr(x)))))),Sqrt(Plus(C1,Sqrt(Plus(C1,Times(b,Sqr(x)))))),Power(Times(b,x),-1)),Subst(Int(Times(Power(ArcCosh(x),n),Power(Times(Sqrt(Plus(CN1,x)),Sqrt(Plus(C1,x))),-1)),x),x,Sqrt(Plus(C1,Times(b,Sqr(x))))),x),FreeQ(List(b,n),x))),
ISetDelayed(9821,Int(Power(f_,Times(c_DEFAULT,Power(ArcSinh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT))),x_Symbol),
    Condition(Dist(Power(b,-1),Subst(Int(Times(Power(f,Times(c,Power(x,n))),Cosh(x)),x),x,ArcSinh(Plus(a,Times(b,x)))),x),And(FreeQ(List(a,b,c,f),x),IGtQ(n,C0)))),
ISetDelayed(9822,Int(Power(f_,Times(c_DEFAULT,Power(ArcCosh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT))),x_Symbol),
    Condition(Dist(Power(b,-1),Subst(Int(Times(Power(f,Times(c,Power(x,n))),Sinh(x)),x),x,ArcCosh(Plus(a,Times(b,x)))),x),And(FreeQ(List(a,b,c,f),x),IGtQ(n,C0)))),
ISetDelayed(9823,Int(Times(Power(f_,Times(c_DEFAULT,Power(ArcSinh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Dist(Power(b,-1),Subst(Int(Times(Power(Plus(Times(CN1,a,Power(b,-1)),Times(Sinh(x),Power(b,-1))),m),Power(f,Times(c,Power(x,n))),Cosh(x)),x),x,ArcSinh(Plus(a,Times(b,x)))),x),And(FreeQ(List(a,b,c,f),x),IGtQ(m,C0),IGtQ(n,C0)))),
ISetDelayed(9824,Int(Times(Power(f_,Times(c_DEFAULT,Power(ArcCosh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Dist(Power(b,-1),Subst(Int(Times(Power(Plus(Times(CN1,a,Power(b,-1)),Times(Cosh(x),Power(b,-1))),m),Power(f,Times(c,Power(x,n))),Sinh(x)),x),x,ArcCosh(Plus(a,Times(b,x)))),x),And(FreeQ(List(a,b,c,f),x),IGtQ(m,C0),IGtQ(n,C0)))),
ISetDelayed(9825,Int(ArcSinh(u_),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcSinh(u)),x),Negate(Int(SimplifyIntegrand(Times(x,D(u,x),Power(Plus(C1,Sqr(u)),CN1D2)),x),x))),And(InverseFunctionFreeQ(u,x),Not(FunctionOfExponentialQ(u,x)))))
  );
}
