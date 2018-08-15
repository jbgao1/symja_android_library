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
public class IntRules124 { 
  public static IAST RULES = List( 
ISetDelayed(10116,Int(Times(Exp(Times(n_DEFAULT,ArcCoth(Times(c_DEFAULT,Plus(a_,Times(b_DEFAULT,x_)))))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(c,Plus(a,Times(b,x))),Times(C1D2,n)),Power(Plus(C1,Power(Times(c,Plus(a,Times(b,x))),-1)),Times(C1D2,n)),Power(Power(Plus(C1,Times(a,c),Times(b,c,x)),Times(C1D2,n)),-1)),Int(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(C1,Times(a,c),Times(b,c,x)),Times(C1D2,n)),Power(Power(Plus(CN1,Times(a,c),Times(b,c,x)),Times(C1D2,n)),-1)),x),x),And(FreeQ(List(a,b,c,d,e,m,n),x),Not(IntegerQ(Times(C1D2,n)))))),
ISetDelayed(10117,Int(Times(Exp(Times(n_DEFAULT,ArcCoth(Plus(a_,Times(b_DEFAULT,x_))))),u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,x_),Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(c,Power(Plus(C1,Negate(Sqr(a))),-1)),p),Power(Times(Plus(a,Times(b,x)),Power(Plus(C1,a,Times(b,x)),-1)),Times(C1D2,n)),Power(Times(Plus(C1,a,Times(b,x)),Power(Plus(a,Times(b,x)),-1)),Times(C1D2,n)),Power(Plus(C1,Negate(a),Times(CN1,b,x)),Times(C1D2,n)),Power(Power(Plus(CN1,a,Times(b,x)),Times(C1D2,n)),-1)),Int(Times(u,Power(Plus(C1,Negate(a),Times(CN1,b,x)),Plus(p,Times(CN1,C1D2,n))),Power(Plus(C1,a,Times(b,x)),Plus(p,Times(C1D2,n)))),x),x),And(FreeQ(List(a,b,c,d,e,n,p),x),Not(IntegerQ(Times(C1D2,n))),EqQ(Plus(Times(b,d),Times(CN1,C2,a,e)),C0),EqQ(Plus(Times(Sqr(b),c),Times(e,Plus(C1,Negate(Sqr(a))))),C0),Or(IntegerQ(p),GtQ(Times(c,Power(Plus(C1,Negate(Sqr(a))),-1)),C0))))),
ISetDelayed(10118,Int(Times(Exp(Times(n_DEFAULT,ArcCoth(Plus(a_,Times(b_DEFAULT,x_))))),u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,x_),Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Plus(c,Times(d,x),Times(e,Sqr(x))),p),Power(Power(Plus(C1,Negate(Sqr(a)),Times(CN1,C2,a,b,x),Times(CN1,Sqr(b),Sqr(x))),p),-1)),Int(Times(u,Power(Plus(C1,Negate(Sqr(a)),Times(CN1,C2,a,b,x),Times(CN1,Sqr(b),Sqr(x))),p),Exp(Times(n,ArcCoth(Times(a,x))))),x),x),And(FreeQ(List(a,b,c,d,e,n,p),x),Not(IntegerQ(Times(C1D2,n))),EqQ(Plus(Times(b,d),Times(CN1,C2,a,e)),C0),EqQ(Plus(Times(Sqr(b),c),Times(e,Plus(C1,Negate(Sqr(a))))),C0),Not(Or(IntegerQ(p),GtQ(Times(c,Power(Plus(C1,Negate(Sqr(a))),-1)),C0)))))),
ISetDelayed(10119,Int(Times(Exp(Times(n_DEFAULT,ArcCoth(Times(c_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),-1))))),u_DEFAULT),x_Symbol),
    Condition(Int(Times(u,Exp(Times(n,ArcTanh(Plus(Times(a,Power(c,-1)),Times(b,x,Power(c,-1))))))),x),FreeQ(List(a,b,c,n),x))),
ISetDelayed(10120,Int(ArcTanh(Plus(a_,Times(b_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcTanh(Plus(a,Times(b,Power(x,n))))),x),Negate(Dist(Times(b,n),Int(Times(Power(x,n),Power(Plus(C1,Negate(Sqr(a)),Times(CN1,C2,a,b,Power(x,n)),Times(CN1,Sqr(b),Power(x,Times(C2,n)))),-1)),x),x))),FreeQ(List(a,b,n),x))),
ISetDelayed(10121,Int(ArcCoth(Plus(a_,Times(b_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcCoth(Plus(a,Times(b,Power(x,n))))),x),Negate(Dist(Times(b,n),Int(Times(Power(x,n),Power(Plus(C1,Negate(Sqr(a)),Times(CN1,C2,a,b,Power(x,n)),Times(CN1,Sqr(b),Power(x,Times(C2,n)))),-1)),x),x))),FreeQ(List(a,b,n),x))),
ISetDelayed(10122,Int(Times(Power(x_,-1),ArcTanh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))))),x_Symbol),
    Condition(Plus(Dist(C1D2,Int(Times(Log(Plus(C1,a,Times(b,Power(x,n)))),Power(x,-1)),x),x),Negate(Dist(C1D2,Int(Times(Log(Plus(C1,Negate(a),Times(CN1,b,Power(x,n)))),Power(x,-1)),x),x))),FreeQ(List(a,b,n),x))),
ISetDelayed(10123,Int(Times(Power(x_,-1),ArcCoth(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))))),x_Symbol),
    Condition(Plus(Dist(C1D2,Int(Times(Log(Plus(C1,Power(Plus(a,Times(b,Power(x,n))),-1))),Power(x,-1)),x),x),Negate(Dist(C1D2,Int(Times(Log(Plus(C1,Negate(Power(Plus(a,Times(b,Power(x,n))),-1)))),Power(x,-1)),x),x))),FreeQ(List(a,b,n),x))),
ISetDelayed(10124,Int(Times(Power(x_,m_DEFAULT),ArcTanh(Plus(a_,Times(b_DEFAULT,Power(x_,n_))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,C1)),ArcTanh(Plus(a,Times(b,Power(x,n)))),Power(Plus(m,C1),-1)),x),Negate(Dist(Times(b,n,Power(Plus(m,C1),-1)),Int(Times(Power(x,Plus(m,n)),Power(Plus(C1,Negate(Sqr(a)),Times(CN1,C2,a,b,Power(x,n)),Times(CN1,Sqr(b),Power(x,Times(C2,n)))),-1)),x),x))),And(FreeQ(List(a,b),x),RationalQ(m,n),NeQ(m,CN1),NeQ(Plus(m,C1),n)))),
ISetDelayed(10125,Int(Times(Power(x_,m_DEFAULT),ArcCoth(Plus(a_,Times(b_DEFAULT,Power(x_,n_))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,C1)),ArcCoth(Plus(a,Times(b,Power(x,n)))),Power(Plus(m,C1),-1)),x),Negate(Dist(Times(b,n,Power(Plus(m,C1),-1)),Int(Times(Power(x,Plus(m,n)),Power(Plus(C1,Negate(Sqr(a)),Times(CN1,C2,a,b,Power(x,n)),Times(CN1,Sqr(b),Power(x,Times(C2,n)))),-1)),x),x))),And(FreeQ(List(a,b),x),RationalQ(m,n),NeQ(m,CN1),NeQ(Plus(m,C1),n)))),
ISetDelayed(10126,Int(ArcTanh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(f_,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Dist(C1D2,Int(Log(Plus(C1,a,Times(b,Power(f,Plus(c,Times(d,x)))))),x),x),Negate(Dist(C1D2,Int(Log(Plus(C1,Negate(a),Times(CN1,b,Power(f,Plus(c,Times(d,x)))))),x),x))),FreeQ(List(a,b,c,d,f),x))),
ISetDelayed(10127,Int(ArcCoth(Plus(a_DEFAULT,Times(b_DEFAULT,Power(f_,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Dist(C1D2,Int(Log(Plus(C1,Power(Plus(a,Times(b,Power(f,Plus(c,Times(d,x))))),-1))),x),x),Negate(Dist(C1D2,Int(Log(Plus(C1,Negate(Power(Plus(a,Times(b,Power(f,Plus(c,Times(d,x))))),-1)))),x),x))),FreeQ(List(a,b,c,d,f),x))),
ISetDelayed(10128,Int(Times(Power(x_,m_DEFAULT),ArcTanh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(f_,Plus(c_DEFAULT,Times(d_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Dist(C1D2,Int(Times(Power(x,m),Log(Plus(C1,a,Times(b,Power(f,Plus(c,Times(d,x))))))),x),x),Negate(Dist(C1D2,Int(Times(Power(x,m),Log(Plus(C1,Negate(a),Times(CN1,b,Power(f,Plus(c,Times(d,x))))))),x),x))),And(FreeQ(List(a,b,c,d,f),x),IGtQ(m,C0)))),
ISetDelayed(10129,Int(Times(Power(x_,m_DEFAULT),ArcCoth(Plus(a_DEFAULT,Times(b_DEFAULT,Power(f_,Plus(c_DEFAULT,Times(d_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Dist(C1D2,Int(Times(Power(x,m),Log(Plus(C1,Power(Plus(a,Times(b,Power(f,Plus(c,Times(d,x))))),-1)))),x),x),Negate(Dist(C1D2,Int(Times(Power(x,m),Log(Plus(C1,Negate(Power(Plus(a,Times(b,Power(f,Plus(c,Times(d,x))))),-1))))),x),x))),And(FreeQ(List(a,b,c,d,f),x),IGtQ(m,C0)))),
ISetDelayed(10130,Int(Times(u_DEFAULT,Power(ArcTanh(Times(c_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))),-1))),m_DEFAULT)),x_Symbol),
    Condition(Int(Times(u,Power(ArcCoth(Plus(Times(a,Power(c,-1)),Times(b,Power(x,n),Power(c,-1)))),m)),x),FreeQ(List(a,b,c,n,m),x))),
ISetDelayed(10131,Int(Times(u_DEFAULT,Power(ArcCoth(Times(c_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))),-1))),m_DEFAULT)),x_Symbol),
    Condition(Int(Times(u,Power(ArcTanh(Plus(Times(a,Power(c,-1)),Times(b,Power(x,n),Power(c,-1)))),m)),x),FreeQ(List(a,b,c,n,m),x))),
ISetDelayed(10132,Int(ArcTanh(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2))),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcTanh(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2)))),x),Negate(Dist(c,Int(Times(x,Power(Plus(a,Times(b,Sqr(x))),CN1D2)),x),x))),And(FreeQ(List(a,b,c),x),EqQ(b,Sqr(c))))),
ISetDelayed(10133,Int(ArcCoth(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2))),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcCoth(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2)))),x),Negate(Dist(c,Int(Times(x,Power(Plus(a,Times(b,Sqr(x))),CN1D2)),x),x))),And(FreeQ(List(a,b,c),x),EqQ(b,Sqr(c))))),
ISetDelayed(10134,Int(Times(Power(x_,-1),ArcTanh(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2)))),x_Symbol),
    Condition(Plus(Simp(Times(ArcTanh(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))),Log(x)),x),Negate(Dist(c,Int(Times(Log(x),Power(Plus(a,Times(b,Sqr(x))),CN1D2)),x),x))),And(FreeQ(List(a,b,c),x),EqQ(b,Sqr(c))))),
ISetDelayed(10135,Int(Times(Power(x_,-1),ArcCoth(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2)))),x_Symbol),
    Condition(Plus(Simp(Times(ArcCoth(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))),Log(x)),x),Negate(Dist(c,Int(Times(Log(x),Power(Plus(a,Times(b,Sqr(x))),CN1D2)),x),x))),And(FreeQ(List(a,b,c),x),EqQ(b,Sqr(c))))),
ISetDelayed(10136,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),ArcTanh(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(d,x),Plus(m,C1)),ArcTanh(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))),Power(Times(d,Plus(m,C1)),-1)),x),Negate(Dist(Times(c,Power(Times(d,Plus(m,C1)),-1)),Int(Times(Power(Times(d,x),Plus(m,C1)),Power(Plus(a,Times(b,Sqr(x))),CN1D2)),x),x))),And(FreeQ(List(a,b,c,d,m),x),EqQ(b,Sqr(c)),NeQ(m,CN1)))),
ISetDelayed(10137,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),ArcCoth(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(d,x),Plus(m,C1)),ArcCoth(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))),Power(Times(d,Plus(m,C1)),-1)),x),Negate(Dist(Times(c,Power(Times(d,Plus(m,C1)),-1)),Int(Times(Power(Times(d,x),Plus(m,C1)),Power(Plus(a,Times(b,Sqr(x))),CN1D2)),x),x))),And(FreeQ(List(a,b,c,d,m),x),EqQ(b,Sqr(c)),NeQ(m,CN1)))),
ISetDelayed(10138,Int(Power(Times(Sqrt(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_)))),ArcTanh(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2)))),-1),x_Symbol),
    Condition(Simp(Times(C1,Log(ArcTanh(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2)))),Power(c,-1)),x),And(FreeQ(List(a,b,c),x),EqQ(b,Sqr(c))))),
ISetDelayed(10139,Int(Power(Times(Sqrt(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_)))),ArcCoth(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2)))),-1),x_Symbol),
    Condition(Negate(Simp(Times(Log(ArcCoth(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2)))),Power(c,-1)),x)),And(FreeQ(List(a,b,c),x),EqQ(b,Sqr(c))))),
ISetDelayed(10140,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2),Power(ArcTanh(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2))),m_DEFAULT)),x_Symbol),
    Condition(Simp(Times(Power(ArcTanh(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))),Plus(m,C1)),Power(Times(c,Plus(m,C1)),-1)),x),And(FreeQ(List(a,b,c,m),x),EqQ(b,Sqr(c)),NeQ(m,CN1)))),
ISetDelayed(10141,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2),Power(ArcCoth(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2))),m_DEFAULT)),x_Symbol),
    Condition(Negate(Simp(Times(Power(ArcCoth(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))),Plus(m,C1)),Power(Times(c,Plus(m,C1)),-1)),x)),And(FreeQ(List(a,b,c,m),x),EqQ(b,Sqr(c)),NeQ(m,CN1)))),
ISetDelayed(10142,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),CN1D2),Power(ArcTanh(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2))),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Int(Times(Power(ArcTanh(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))),m),Power(Plus(a,Times(b,Sqr(x))),CN1D2)),x),x),And(FreeQ(List(a,b,c,d,e,m),x),EqQ(b,Sqr(c)),EqQ(Plus(Times(b,d),Times(CN1,a,e)),C0)))),
ISetDelayed(10143,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),CN1D2),Power(ArcCoth(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2))),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Int(Times(Power(ArcCoth(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))),m),Power(Plus(a,Times(b,Sqr(x))),CN1D2)),x),x),And(FreeQ(List(a,b,c,d,e,m),x),EqQ(b,Sqr(c)),EqQ(Plus(Times(b,d),Times(CN1,a,e)),C0)))),
ISetDelayed(10144,Int(Times(u_,Power(v_,n_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("tmp"),InverseFunctionOfLinear(u,x))),Condition(Dist(Times(Power(Times(CN1,Discriminant(v,x),Power(Times(C4,Coefficient(v,x,C2)),-1)),n),Power(Coefficient(Part($s("tmp"),C1),x,C1),-1)),Subst(Int(SimplifyIntegrand(Times(SubstForInverseFunction(u,$s("tmp"),x),Power(Sech(x),Times(C2,Plus(n,C1)))),x),x),x,$s("tmp")),x),And(Not(FalseQ($s("tmp"))),EqQ(Head($s("tmp")),$s("ArcTanh")),EqQ(Plus(Times(Discriminant(v,x),Sqr(Part($s("tmp"),C1))),Negate(Sqr(D(v,x)))),C0)))),And(QuadraticQ(v,x),ILtQ(n,C0),PosQ(Discriminant(v,x)),MatchQ(u,Condition(Times(r_DEFAULT,Power(f_,w_)),FreeQ(f,x)))))),
ISetDelayed(10145,Int(Times(u_,Power(v_,n_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("tmp"),InverseFunctionOfLinear(u,x))),Condition(Dist(Times(Power(Times(CN1,Discriminant(v,x),Power(Times(C4,Coefficient(v,x,C2)),-1)),n),Power(Coefficient(Part($s("tmp"),C1),x,C1),-1)),Subst(Int(SimplifyIntegrand(Times(SubstForInverseFunction(u,$s("tmp"),x),Power(Negate(Sqr(Csch(x))),Plus(n,C1))),x),x),x,$s("tmp")),x),And(Not(FalseQ($s("tmp"))),EqQ(Head($s("tmp")),$s("ArcCoth")),EqQ(Plus(Times(Discriminant(v,x),Sqr(Part($s("tmp"),C1))),Negate(Sqr(D(v,x)))),C0)))),And(QuadraticQ(v,x),ILtQ(n,C0),PosQ(Discriminant(v,x)),MatchQ(u,Condition(Times(r_DEFAULT,Power(f_,w_)),FreeQ(f,x)))))),
ISetDelayed(10146,Int(ArcTanh(Plus(c_DEFAULT,Times(d_DEFAULT,Tanh(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcTanh(Plus(c,Times(d,Tanh(Plus(a,Times(b,x))))))),x),Dist(b,Int(Times(x,Power(Plus(c,Negate(d),Times(c,Exp(Plus(Times(C2,a),Times(C2,b,x))))),-1)),x),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Sqr(Plus(c,Negate(d))),C1)))),
ISetDelayed(10147,Int(ArcCoth(Plus(c_DEFAULT,Times(d_DEFAULT,Tanh(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcCoth(Plus(c,Times(d,Tanh(Plus(a,Times(b,x))))))),x),Dist(b,Int(Times(x,Power(Plus(c,Negate(d),Times(c,Exp(Plus(Times(C2,a),Times(C2,b,x))))),-1)),x),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Sqr(Plus(c,Negate(d))),C1)))),
ISetDelayed(10148,Int(ArcTanh(Plus(c_DEFAULT,Times(d_DEFAULT,Coth(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcTanh(Plus(c,Times(d,Coth(Plus(a,Times(b,x))))))),x),Dist(b,Int(Times(x,Power(Plus(c,Negate(d),Times(CN1,c,Exp(Plus(Times(C2,a),Times(C2,b,x))))),-1)),x),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Sqr(Plus(c,Negate(d))),C1)))),
ISetDelayed(10149,Int(ArcCoth(Plus(c_DEFAULT,Times(d_DEFAULT,Coth(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcCoth(Plus(c,Times(d,Coth(Plus(a,Times(b,x))))))),x),Dist(b,Int(Times(x,Power(Plus(c,Negate(d),Times(CN1,c,Exp(Plus(Times(C2,a),Times(C2,b,x))))),-1)),x),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Sqr(Plus(c,Negate(d))),C1)))),
ISetDelayed(10150,Int(ArcTanh(Plus(c_DEFAULT,Times(d_DEFAULT,Tanh(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcTanh(Plus(c,Times(d,Tanh(Plus(a,Times(b,x))))))),x),Dist(Times(b,Plus(C1,Negate(c),Negate(d))),Int(Times(x,Exp(Plus(Times(C2,a),Times(C2,b,x))),Power(Plus(C1,Negate(c),d,Times(Plus(C1,Negate(c),Negate(d)),Exp(Plus(Times(C2,a),Times(C2,b,x))))),-1)),x),x),Negate(Dist(Times(b,Plus(C1,c,d)),Int(Times(x,Exp(Plus(Times(C2,a),Times(C2,b,x))),Power(Plus(C1,c,Negate(d),Times(Plus(C1,c,d),Exp(Plus(Times(C2,a),Times(C2,b,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d),x),NeQ(Sqr(Plus(c,Negate(d))),C1)))),
ISetDelayed(10151,Int(ArcCoth(Plus(c_DEFAULT,Times(d_DEFAULT,Tanh(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcCoth(Plus(c,Times(d,Tanh(Plus(a,Times(b,x))))))),x),Dist(Times(b,Plus(C1,Negate(c),Negate(d))),Int(Times(x,Exp(Plus(Times(C2,a),Times(C2,b,x))),Power(Plus(C1,Negate(c),d,Times(Plus(C1,Negate(c),Negate(d)),Exp(Plus(Times(C2,a),Times(C2,b,x))))),-1)),x),x),Negate(Dist(Times(b,Plus(C1,c,d)),Int(Times(x,Exp(Plus(Times(C2,a),Times(C2,b,x))),Power(Plus(C1,c,Negate(d),Times(Plus(C1,c,d),Exp(Plus(Times(C2,a),Times(C2,b,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d),x),NeQ(Sqr(Plus(c,Negate(d))),C1)))),
ISetDelayed(10152,Int(ArcTanh(Plus(c_DEFAULT,Times(d_DEFAULT,Coth(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcTanh(Plus(c,Times(d,Coth(Plus(a,Times(b,x))))))),x),Negate(Dist(Times(b,Plus(C1,Negate(c),Negate(d))),Int(Times(x,Exp(Plus(Times(C2,a),Times(C2,b,x))),Power(Plus(C1,Negate(c),d,Times(CN1,Plus(C1,Negate(c),Negate(d)),Exp(Plus(Times(C2,a),Times(C2,b,x))))),-1)),x),x)),Dist(Times(b,Plus(C1,c,d)),Int(Times(x,Exp(Plus(Times(C2,a),Times(C2,b,x))),Power(Plus(C1,c,Negate(d),Times(CN1,Plus(C1,c,d),Exp(Plus(Times(C2,a),Times(C2,b,x))))),-1)),x),x)),And(FreeQ(List(a,b,c,d),x),NeQ(Sqr(Plus(c,Negate(d))),C1)))),
ISetDelayed(10153,Int(ArcCoth(Plus(c_DEFAULT,Times(d_DEFAULT,Coth(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcCoth(Plus(c,Times(d,Coth(Plus(a,Times(b,x))))))),x),Negate(Dist(Times(b,Plus(C1,Negate(c),Negate(d))),Int(Times(x,Exp(Plus(Times(C2,a),Times(C2,b,x))),Power(Plus(C1,Negate(c),d,Times(CN1,Plus(C1,Negate(c),Negate(d)),Exp(Plus(Times(C2,a),Times(C2,b,x))))),-1)),x),x)),Dist(Times(b,Plus(C1,c,d)),Int(Times(x,Exp(Plus(Times(C2,a),Times(C2,b,x))),Power(Plus(C1,c,Negate(d),Times(CN1,Plus(C1,c,d),Exp(Plus(Times(C2,a),Times(C2,b,x))))),-1)),x),x)),And(FreeQ(List(a,b,c,d),x),NeQ(Sqr(Plus(c,Negate(d))),C1)))),
ISetDelayed(10154,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),ArcTanh(Plus(c_DEFAULT,Times(d_DEFAULT,Tanh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),ArcTanh(Plus(c,Times(d,Tanh(Plus(a,Times(b,x)))))),Power(Times(f,Plus(m,C1)),-1)),x),Dist(Times(b,Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(Plus(c,Negate(d),Times(c,Exp(Plus(Times(C2,a),Times(C2,b,x))))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),EqQ(Sqr(Plus(c,Negate(d))),C1)))),
ISetDelayed(10155,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),ArcCoth(Plus(c_DEFAULT,Times(d_DEFAULT,Tanh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),ArcCoth(Plus(c,Times(d,Tanh(Plus(a,Times(b,x)))))),Power(Times(f,Plus(m,C1)),-1)),x),Dist(Times(b,Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(Plus(c,Negate(d),Times(c,Exp(Plus(Times(C2,a),Times(C2,b,x))))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),EqQ(Sqr(Plus(c,Negate(d))),C1)))),
ISetDelayed(10156,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),ArcTanh(Plus(c_DEFAULT,Times(d_DEFAULT,Coth(Plus(a_DEFAULT,Times(b_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),ArcTanh(Plus(c,Times(d,Coth(Plus(a,Times(b,x)))))),Power(Times(f,Plus(m,C1)),-1)),x),Dist(Times(b,Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(Plus(c,Negate(d),Times(CN1,c,Exp(Plus(Times(C2,a),Times(C2,b,x))))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),EqQ(Sqr(Plus(c,Negate(d))),C1)))),
ISetDelayed(10157,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),ArcCoth(Plus(c_DEFAULT,Times(d_DEFAULT,Coth(Plus(a_DEFAULT,Times(b_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),ArcCoth(Plus(c,Times(d,Coth(Plus(a,Times(b,x)))))),Power(Times(f,Plus(m,C1)),-1)),x),Dist(Times(b,Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(Plus(c,Negate(d),Times(CN1,c,Exp(Plus(Times(C2,a),Times(C2,b,x))))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),EqQ(Sqr(Plus(c,Negate(d))),C1)))),
ISetDelayed(10158,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),ArcTanh(Plus(c_DEFAULT,Times(d_DEFAULT,Tanh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),ArcTanh(Plus(c,Times(d,Tanh(Plus(a,Times(b,x)))))),Power(Times(f,Plus(m,C1)),-1)),x),Dist(Times(b,Plus(C1,Negate(c),Negate(d)),Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Exp(Plus(Times(C2,a),Times(C2,b,x))),Power(Plus(C1,Negate(c),d,Times(Plus(C1,Negate(c),Negate(d)),Exp(Plus(Times(C2,a),Times(C2,b,x))))),-1)),x),x),Negate(Dist(Times(b,Plus(C1,c,d),Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Exp(Plus(Times(C2,a),Times(C2,b,x))),Power(Plus(C1,c,Negate(d),Times(Plus(C1,c,d),Exp(Plus(Times(C2,a),Times(C2,b,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),NeQ(Sqr(Plus(c,Negate(d))),C1)))),
ISetDelayed(10159,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),ArcCoth(Plus(c_DEFAULT,Times(d_DEFAULT,Tanh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),ArcCoth(Plus(c,Times(d,Tanh(Plus(a,Times(b,x)))))),Power(Times(f,Plus(m,C1)),-1)),x),Dist(Times(b,Plus(C1,Negate(c),Negate(d)),Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Exp(Plus(Times(C2,a),Times(C2,b,x))),Power(Plus(C1,Negate(c),d,Times(Plus(C1,Negate(c),Negate(d)),Exp(Plus(Times(C2,a),Times(C2,b,x))))),-1)),x),x),Negate(Dist(Times(b,Plus(C1,c,d),Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Exp(Plus(Times(C2,a),Times(C2,b,x))),Power(Plus(C1,c,Negate(d),Times(Plus(C1,c,d),Exp(Plus(Times(C2,a),Times(C2,b,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),NeQ(Sqr(Plus(c,Negate(d))),C1)))),
ISetDelayed(10160,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),ArcTanh(Plus(c_DEFAULT,Times(d_DEFAULT,Coth(Plus(a_DEFAULT,Times(b_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),ArcTanh(Plus(c,Times(d,Coth(Plus(a,Times(b,x)))))),Power(Times(f,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,Plus(C1,Negate(c),Negate(d)),Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Exp(Plus(Times(C2,a),Times(C2,b,x))),Power(Plus(C1,Negate(c),d,Times(CN1,Plus(C1,Negate(c),Negate(d)),Exp(Plus(Times(C2,a),Times(C2,b,x))))),-1)),x),x)),Dist(Times(b,Plus(C1,c,d),Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Exp(Plus(Times(C2,a),Times(C2,b,x))),Power(Plus(C1,c,Negate(d),Times(CN1,Plus(C1,c,d),Exp(Plus(Times(C2,a),Times(C2,b,x))))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),NeQ(Sqr(Plus(c,Negate(d))),C1)))),
ISetDelayed(10161,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),ArcCoth(Plus(c_DEFAULT,Times(d_DEFAULT,Coth(Plus(a_DEFAULT,Times(b_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),ArcCoth(Plus(c,Times(d,Coth(Plus(a,Times(b,x)))))),Power(Times(f,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,Plus(C1,Negate(c),Negate(d)),Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Exp(Plus(Times(C2,a),Times(C2,b,x))),Power(Plus(C1,Negate(c),d,Times(CN1,Plus(C1,Negate(c),Negate(d)),Exp(Plus(Times(C2,a),Times(C2,b,x))))),-1)),x),x)),Dist(Times(b,Plus(C1,c,d),Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Exp(Plus(Times(C2,a),Times(C2,b,x))),Power(Plus(C1,c,Negate(d),Times(CN1,Plus(C1,c,d),Exp(Plus(Times(C2,a),Times(C2,b,x))))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0),NeQ(Sqr(Plus(c,Negate(d))),C1)))),
ISetDelayed(10162,Int(ArcTanh(Tan(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcTanh(Tan(Plus(a,Times(b,x))))),x),Negate(Dist(b,Int(Times(x,Sec(Plus(Times(C2,a),Times(C2,b,x)))),x),x))),FreeQ(List(a,b),x))),
ISetDelayed(10163,Int(ArcCoth(Tan(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcCoth(Tan(Plus(a,Times(b,x))))),x),Negate(Dist(b,Int(Times(x,Sec(Plus(Times(C2,a),Times(C2,b,x)))),x),x))),FreeQ(List(a,b),x))),
ISetDelayed(10164,Int(ArcTanh(Cot(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcTanh(Cot(Plus(a,Times(b,x))))),x),Negate(Dist(b,Int(Times(x,Sec(Plus(Times(C2,a),Times(C2,b,x)))),x),x))),FreeQ(List(a,b),x))),
ISetDelayed(10165,Int(ArcCoth(Cot(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcCoth(Cot(Plus(a,Times(b,x))))),x),Negate(Dist(b,Int(Times(x,Sec(Plus(Times(C2,a),Times(C2,b,x)))),x),x))),FreeQ(List(a,b),x)))
  );
}
