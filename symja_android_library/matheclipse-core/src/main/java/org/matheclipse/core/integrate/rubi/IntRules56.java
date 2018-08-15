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
public class IntRules56 { 
  public static IAST RULES = List( 
ISetDelayed(6841,Int(Power(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),QQ(3L,2L)),Sqrt(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),-1),x_Symbol),
    Condition(Plus(Dist(Power(Plus(a,Negate(b)),-1),Int(Power(Times(Sqrt(Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))))),-1),x),x),Negate(Dist(Times(b,Power(Plus(a,Negate(b)),-1)),Int(Times(Plus(C1,Sin(Plus(e,Times(f,x)))),Power(Times(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),QQ(3L,2L)),Sqrt(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),NeQ(Plus(Sqr(c),Negate(Sqr(d))),C0)))),
ISetDelayed(6842,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqr(b),Cos(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),Plus(n,C1)),Power(Times(f,Plus(m,C1),Plus(Times(b,c),Times(CN1,a,d)),Plus(Sqr(a),Negate(Sqr(b)))),-1)),x)),Dist(Power(Times(Plus(m,C1),Plus(Times(b,c),Times(CN1,a,d)),Plus(Sqr(a),Negate(Sqr(b)))),-1),Int(Times(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),n),Simp(Plus(Times(a,Plus(Times(b,c),Times(CN1,a,d)),Plus(m,C1)),Times(Sqr(b),d,Plus(m,n,C2)),Times(CN1,Plus(Times(Sqr(b),c),Times(b,Plus(Times(b,c),Times(CN1,a,d)),Plus(m,C1))),Sin(Plus(e,Times(f,x)))),Times(CN1,Sqr(b),d,Plus(m,n,C3),Sqr(Sin(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,n),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),NeQ(Plus(Sqr(c),Negate(Sqr(d))),C0),LtQ(m,CN1),IntegersQ(Times(C2,m),Times(C2,n)),Or(And(EqQ(a,C0),IntegerQ(m),Not(IntegerQ(n))),Not(And(IntegerQ(Times(C2,n)),LtQ(n,CN1),Or(And(IntegerQ(n),Not(IntegerQ(m))),EqQ(a,C0)))))))),
ISetDelayed(6843,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1),Sqrt(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Dist(Times(d,Power(b,-1)),Int(Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),CN1D2),x),x),Dist(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(b,-1)),Int(Power(Times(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Sqrt(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))))),-1),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),NeQ(Plus(Sqr(c),Negate(Sqr(d))),C0)))),
ISetDelayed(6844,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),QQ(3L,2L)),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Plus(Dist(Times(b,Power(d,-1)),Int(Sqrt(Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),x),x),Negate(Dist(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(d,-1)),Int(Times(Sqrt(Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),NeQ(Plus(Sqr(c),Negate(Sqr(d))),C0)))),
ISetDelayed(6845,Int(Power(Times(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Sqrt(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),-1),x_Symbol),
    Condition(Simp(Times(C2,EllipticPi(Times(C2,b,Power(Plus(a,b),-1)),Times(C1D2,C1,Plus(e,Times(CN1,C1D2,Pi),Times(f,x))),Times(C2,d,Power(Plus(c,d),-1))),Power(Times(f,Plus(a,b),Sqrt(Plus(c,d))),-1)),x),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),NeQ(Plus(Sqr(c),Negate(Sqr(d))),C0),GtQ(Plus(c,d),C0)))),
ISetDelayed(6846,Int(Power(Times(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Sqrt(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),-1),x_Symbol),
    Condition(Simp(Times(C2,EllipticPi(Times(CN2,b,Power(Plus(a,Negate(b)),-1)),Times(C1D2,C1,Plus(e,Times(C1D2,Pi),Times(f,x))),Times(CN2,d,Power(Plus(c,Negate(d)),-1))),Power(Times(f,Plus(a,Negate(b)),Sqrt(Plus(c,Negate(d)))),-1)),x),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),NeQ(Plus(Sqr(c),Negate(Sqr(d))),C0),GtQ(Plus(c,Negate(d)),C0)))),
ISetDelayed(6847,Int(Power(Times(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Sqrt(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),-1),x_Symbol),
    Condition(Dist(Times(Sqrt(Times(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),Power(Plus(c,d),-1))),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),CN1D2)),Int(Power(Times(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Sqrt(Plus(Times(c,Power(Plus(c,d),-1)),Times(d,Sin(Plus(e,Times(f,x))),Power(Plus(c,d),-1))))),-1),x),x),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),NeQ(Plus(Sqr(c),Negate(Sqr(d))),C0),Not(GtQ(Plus(c,d),C0))))),
ISetDelayed(6848,Int(Times(Sqrt(Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Simp(Times(C2,c,Rt(Times(b,Plus(c,d)),C2),Tan(Plus(e,Times(f,x))),Sqrt(Plus(C1,Csc(Plus(e,Times(f,x))))),Sqrt(Plus(C1,Negate(Csc(Plus(e,Times(f,x)))))),EllipticPi(Times(Plus(c,d),Power(d,-1)),ArcSin(Times(Sqrt(Plus(c,Times(d,Sin(Plus(e,Times(f,x)))))),Power(Times(Sqrt(Times(b,Sin(Plus(e,Times(f,x))))),Rt(Times(Plus(c,d),Power(b,-1)),C2)),-1))),Times(CN1,Plus(c,d),Power(Plus(c,Negate(d)),-1))),Power(Times(d,f,Sqrt(Plus(Sqr(c),Negate(Sqr(d))))),-1)),x),And(FreeQ(List(b,c,d,e,f),x),GtQ(Plus(Sqr(c),Negate(Sqr(d))),C0),PosQ(Times(Plus(c,d),Power(b,-1))),GtQ(Sqr(c),C0)))),
ISetDelayed(6849,Int(Times(Sqrt(Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Simp(Times(C2,b,Tan(Plus(e,Times(f,x))),Rt(Times(Plus(c,d),Power(b,-1)),C2),Sqrt(Times(c,Plus(C1,Csc(Plus(e,Times(f,x)))),Power(Plus(c,Negate(d)),-1))),Sqrt(Times(c,Plus(C1,Negate(Csc(Plus(e,Times(f,x))))),Power(Plus(c,d),-1))),EllipticPi(Times(Plus(c,d),Power(d,-1)),ArcSin(Times(Sqrt(Plus(c,Times(d,Sin(Plus(e,Times(f,x)))))),Power(Times(Sqrt(Times(b,Sin(Plus(e,Times(f,x))))),Rt(Times(Plus(c,d),Power(b,-1)),C2)),-1))),Times(CN1,Plus(c,d),Power(Plus(c,Negate(d)),-1))),Power(Times(d,f),-1)),x),And(FreeQ(List(b,c,d,e,f),x),NeQ(Plus(Sqr(c),Negate(Sqr(d))),C0),PosQ(Times(Plus(c,d),Power(b,-1)))))),
ISetDelayed(6850,Int(Times(Sqrt(Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Times(b,Sin(Plus(e,Times(f,x))))),Power(Times(CN1,b,Sin(Plus(e,Times(f,x)))),CN1D2)),Int(Times(Sqrt(Times(CN1,b,Sin(Plus(e,Times(f,x))))),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),CN1D2)),x),x),And(FreeQ(List(b,c,d,e,f),x),NeQ(Plus(Sqr(c),Negate(Sqr(d))),C0),NegQ(Times(Plus(c,d),Power(b,-1)))))),
ISetDelayed(6851,Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Simp(Times(C2,Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Sqrt(Times(Plus(Times(b,c),Times(CN1,a,d)),Plus(C1,Sin(Plus(e,Times(f,x)))),Power(Times(Plus(c,Negate(d)),Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),-1))),Sqrt(Times(CN1,Plus(Times(b,c),Times(CN1,a,d)),Plus(C1,Negate(Sin(Plus(e,Times(f,x))))),Power(Times(Plus(c,d),Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),-1))),EllipticPi(Times(b,Plus(c,d),Power(Times(d,Plus(a,b)),-1)),ArcSin(Times(Rt(Times(Plus(a,b),Power(Plus(c,d),-1)),C2),Sqrt(Plus(c,Times(d,Sin(Plus(e,Times(f,x)))))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),CN1D2))),Times(Plus(a,Negate(b)),Plus(c,d),Power(Times(Plus(a,b),Plus(c,Negate(d))),-1))),Power(Times(d,f,Rt(Times(Plus(a,b),Power(Plus(c,d),-1)),C2),Cos(Plus(e,Times(f,x)))),-1)),x),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),NeQ(Plus(Sqr(c),Negate(Sqr(d))),C0),PosQ(Times(Plus(a,b),Power(Plus(c,d),-1)))))),
ISetDelayed(6852,Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(Negate(c),Times(CN1,d,Sin(Plus(e,Times(f,x)))))),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),CN1D2)),Int(Times(Sqrt(Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),Power(Plus(Negate(c),Times(CN1,d,Sin(Plus(e,Times(f,x))))),CN1D2)),x),x),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),NeQ(Plus(Sqr(c),Negate(Sqr(d))),C0),NegQ(Times(Plus(a,b),Power(Plus(c,d),-1)))))),
ISetDelayed(6853,Int(Power(Times(Sqrt(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),-1),x_Symbol),
    Condition(Simp(Times(CN2,d,EllipticF(ArcSin(Times(Cos(Plus(e,Times(f,x))),Power(Plus(C1,Times(d,Sin(Plus(e,Times(f,x))))),-1))),Times(CN1,Plus(a,Times(CN1,b,d)),Power(Plus(a,Times(b,d)),-1))),Power(Times(f,Sqrt(Plus(a,Times(b,d)))),-1)),x),And(FreeQ(List(a,b,d,e,f),x),LtQ(Plus(Sqr(a),Negate(Sqr(b))),C0),EqQ(Sqr(d),C1),GtQ(Times(b,d),C0)))),
ISetDelayed(6854,Int(Power(Times(Sqrt(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),-1),x_Symbol),
    Condition(Dist(Times(Sqrt(Times(Sign(b),Sin(Plus(e,Times(f,x))))),Power(Times(d,Sin(Plus(e,Times(f,x)))),CN1D2)),Int(Power(Times(Sqrt(Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),Sqrt(Times(Sign(b),Sin(Plus(e,Times(f,x)))))),-1),x),x),And(FreeQ(List(a,b,d,e,f),x),LtQ(Plus(Sqr(a),Negate(Sqr(b))),C0),GtQ(Sqr(b),C0),Not(And(EqQ(Sqr(d),C1),GtQ(Times(b,d),C0)))))),
ISetDelayed(6855,Int(Power(Times(Sqrt(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),-1),x_Symbol),
    Condition(Simp(Times(CN2,Sqrt(Sqr(a)),Sqrt(Negate(Sqr(Cot(Plus(e,Times(f,x)))))),Rt(Times(Plus(a,b),Power(d,-1)),C2),EllipticF(ArcSin(Times(Sqrt(Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),Power(Times(Sqrt(Times(d,Sin(Plus(e,Times(f,x))))),Rt(Times(Plus(a,b),Power(d,-1)),C2)),-1))),Times(CN1,Plus(a,b),Power(Plus(a,Negate(b)),-1))),Power(Times(a,f,Sqrt(Plus(Sqr(a),Negate(Sqr(b)))),Cot(Plus(e,Times(f,x)))),-1)),x),And(FreeQ(List(a,b,d,e,f),x),GtQ(Plus(Sqr(a),Negate(Sqr(b))),C0),PosQ(Times(Plus(a,b),Power(d,-1))),GtQ(Sqr(a),C0)))),
ISetDelayed(6856,Int(Power(Times(Sqrt(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),-1),x_Symbol),
    Condition(Simp(Times(CN2,Tan(Plus(e,Times(f,x))),Rt(Times(Plus(a,b),Power(d,-1)),C2),Sqrt(Times(a,Plus(C1,Negate(Csc(Plus(e,Times(f,x))))),Power(Plus(a,b),-1))),Sqrt(Times(a,Plus(C1,Csc(Plus(e,Times(f,x)))),Power(Plus(a,Negate(b)),-1))),EllipticF(ArcSin(Times(Sqrt(Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),Power(Times(Sqrt(Times(d,Sin(Plus(e,Times(f,x))))),Rt(Times(Plus(a,b),Power(d,-1)),C2)),-1))),Times(CN1,Plus(a,b),Power(Plus(a,Negate(b)),-1))),Power(Times(a,f),-1)),x),And(FreeQ(List(a,b,d,e,f),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),PosQ(Times(Plus(a,b),Power(d,-1)))))),
ISetDelayed(6857,Int(Power(Times(Sqrt(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),-1),x_Symbol),
    Condition(Dist(Times(Sqrt(Times(CN1,d,Sin(Plus(e,Times(f,x))))),Power(Times(d,Sin(Plus(e,Times(f,x)))),CN1D2)),Int(Power(Times(Sqrt(Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),Sqrt(Times(CN1,d,Sin(Plus(e,Times(f,x)))))),-1),x),x),And(FreeQ(List(a,b,d,e,f),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),NegQ(Times(Plus(a,b),Power(d,-1)))))),
ISetDelayed(6858,Int(Power(Times(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Sqrt(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),-1),x_Symbol),
    Condition(Simp(Times(C2,Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),Sqrt(Times(Plus(Times(b,c),Times(CN1,a,d)),Plus(C1,Negate(Sin(Plus(e,Times(f,x))))),Power(Times(Plus(a,b),Plus(c,Times(d,Sin(Plus(e,Times(f,x)))))),-1))),Sqrt(Times(CN1,Plus(Times(b,c),Times(CN1,a,d)),Plus(C1,Sin(Plus(e,Times(f,x)))),Power(Times(Plus(a,Negate(b)),Plus(c,Times(d,Sin(Plus(e,Times(f,x)))))),-1))),EllipticF(ArcSin(Times(Rt(Times(Plus(c,d),Power(Plus(a,b),-1)),C2),Sqrt(Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),CN1D2))),Times(Plus(a,b),Plus(c,Negate(d)),Power(Times(Plus(a,Negate(b)),Plus(c,d)),-1))),Power(Times(f,Plus(Times(b,c),Times(CN1,a,d)),Rt(Times(Plus(c,d),Power(Plus(a,b),-1)),C2),Cos(Plus(e,Times(f,x)))),-1)),x),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),NeQ(Plus(Sqr(c),Negate(Sqr(d))),C0),PosQ(Times(Plus(c,d),Power(Plus(a,b),-1)))))),
ISetDelayed(6859,Int(Power(Times(Sqrt(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Sqrt(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),-1),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(Negate(a),Times(CN1,b,Sin(Plus(e,Times(f,x)))))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),CN1D2)),Int(Power(Times(Sqrt(Plus(Negate(a),Times(CN1,b,Sin(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))))),-1),x),x),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),NeQ(Plus(Sqr(c),Negate(Sqr(d))),C0),NegQ(Times(Plus(c,d),Power(Plus(a,b),-1)))))),
ISetDelayed(6860,Int(Times(Power(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),QQ(3L,2L)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Plus(Negate(Dist(Times(a,d,Power(Times(C2,b),-1)),Int(Times(Sqrt(Times(d,Sin(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),CN1D2)),x),x)),Dist(Times(d,Power(Times(C2,b),-1)),Int(Times(Sqrt(Times(d,Sin(Plus(e,Times(f,x))))),Plus(a,Times(C2,b,Sin(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),CN1D2)),x),x)),And(FreeQ(List(a,b,d,e,f),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
ISetDelayed(6861,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Cos(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),n),Power(Times(f,Plus(m,n)),-1)),x)),Dist(Power(Times(d,Plus(m,n)),-1),Int(Times(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,Negate(C2))),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),Plus(n,Negate(C1))),Simp(Plus(Times(Sqr(a),c,d,Plus(m,n)),Times(b,d,Plus(Times(b,c,Plus(m,Negate(C1))),Times(a,d,n))),Times(Plus(Times(a,d,Plus(Times(C2,b,c),Times(a,d)),Plus(m,n)),Times(CN1,b,d,Plus(Times(a,c),Times(CN1,b,d,Plus(m,n,Negate(C1)))))),Sin(Plus(e,Times(f,x)))),Times(b,d,Plus(Times(b,c,n),Times(a,d,Plus(Times(C2,m),n,Negate(C1)))),Sqr(Sin(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),NeQ(Plus(Sqr(c),Negate(Sqr(d))),C0),LtQ(C0,m,C2),LtQ(CN1,n,C2),NeQ(Plus(m,n),C0),Or(IntegerQ(m),IntegersQ(Times(C2,m),Times(C2,n)))))),
ISetDelayed(6862,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Dist(Times(b,Power(d,-1)),Int(Times(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),Plus(n,C1))),x),x),Negate(Dist(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(d,-1)),Int(Times(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),n)),x),x))),And(FreeQ(List(a,b,c,d,e,f,n),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),IGtQ(m,C0)))),
ISetDelayed(6863,Int(Times(Power(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Plus(Dist(a,Int(Times(Power(Times(d,Sin(Plus(e,Times(f,x)))),n),Power(Plus(Sqr(a),Times(CN1,Sqr(b),Sqr(Sin(Plus(e,Times(f,x)))))),-1)),x),x),Negate(Dist(Times(b,Power(d,-1)),Int(Times(Power(Times(d,Sin(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Plus(Sqr(a),Times(CN1,Sqr(b),Sqr(Sin(Plus(e,Times(f,x)))))),-1)),x),x))),And(FreeQ(List(a,b,d,e,f,n),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
ISetDelayed(6864,Int(Times(Power(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrig(Times(Power(Times(d,$($s("§sin"),Plus(e,Times(f,x)))),n),Power(Times(Power(Plus(a,Times(CN1,b,$($s("§sin"),Plus(e,Times(f,x))))),m),Power(Power(Plus(Sqr(a),Times(CN1,Sqr(b),Sqr($($s("§sin"),Plus(e,Times(f,x)))))),m),-1)),-1)),x),x),And(FreeQ(List(a,b,d,e,f,n),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),ILtQ(m,CN1)))),
ISetDelayed(6865,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Times(c_DEFAULT,Power(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_)),n_)),x_Symbol),
    Condition(Dist(Times(Power(c,IntPart(n)),Power(Times(c,Power(Times(d,Sin(Plus(e,Times(f,x)))),p)),FracPart(n)),Power(Power(Times(d,Sin(Plus(e,Times(f,x)))),Times(p,FracPart(n))),-1)),Int(Times(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),Power(Times(d,Sin(Plus(e,Times(f,x)))),Times(n,p))),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n,p),x),Not(IntegerQ(n))))),
ISetDelayed(6866,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Times(c_DEFAULT,Power(Times(d_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_)),n_)),x_Symbol),
    Condition(Dist(Times(Power(c,IntPart(n)),Power(Times(c,Power(Times(d,Cos(Plus(e,Times(f,x)))),p)),FracPart(n)),Power(Power(Times(d,Cos(Plus(e,Times(f,x)))),Times(p,FracPart(n))),-1)),Int(Times(Power(Plus(a,Times(b,Cos(Plus(e,Times(f,x))))),m),Power(Times(d,Cos(Plus(e,Times(f,x)))),Times(n,p))),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n,p),x),Not(IntegerQ(n))))),
ISetDelayed(6867,Int(Times(Power(Plus(c_,Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),Power(Plus(d,Times(c,Sin(Plus(e,Times(f,x))))),n),Power(Power(Sin(Plus(e,Times(f,x))),n),-1)),x),And(FreeQ(List(a,b,c,d,e,f,m),x),IntegerQ(n)))),
ISetDelayed(6868,Int(Times(Power(Plus(c_,Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Plus(b,Times(a,Csc(Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),n),Power(Power(Csc(Plus(e,Times(f,x))),m),-1)),x),And(FreeQ(List(a,b,c,d,e,f,n),x),Not(IntegerQ(n)),IntegerQ(m)))),
ISetDelayed(6869,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Int(Times(Power(Plus(b,Times(a,Sec(Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,Sec(Plus(e,Times(f,x))))),n),Power(Power(Sec(Plus(e,Times(f,x))),m),-1)),x),And(FreeQ(List(a,b,c,d,e,f,n),x),Not(IntegerQ(n)),IntegerQ(m)))),
ISetDelayed(6870,Int(Times(Power(Plus(c_,Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Dist(Times(Power(Sin(Plus(e,Times(f,x))),n),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),n),Power(Power(Plus(d,Times(c,Sin(Plus(e,Times(f,x))))),n),-1)),Int(Times(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),Power(Plus(d,Times(c,Sin(Plus(e,Times(f,x))))),n),Power(Power(Sin(Plus(e,Times(f,x))),n),-1)),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n),x),Not(IntegerQ(n)),Not(IntegerQ(m))))),
ISetDelayed(6871,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_,Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Dist(Times(Power(Cos(Plus(e,Times(f,x))),n),Power(Plus(c,Times(d,Sec(Plus(e,Times(f,x))))),n),Power(Power(Plus(d,Times(c,Cos(Plus(e,Times(f,x))))),n),-1)),Int(Times(Power(Plus(a,Times(b,Cos(Plus(e,Times(f,x))))),m),Power(Plus(d,Times(c,Cos(Plus(e,Times(f,x))))),n),Power(Power(Cos(Plus(e,Times(f,x))),n),-1)),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n),x),Not(IntegerQ(n)),Not(IntegerQ(m))))),
ISetDelayed(6872,Int(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Times(b,f),-1),Subst(Int(Times(Power(Plus(a,x),m),Power(Plus(c,Times(d,x,Power(b,-1))),n)),x),x,Times(b,Sin(Plus(e,Times(f,x))))),x),FreeQ(List(a,b,c,d,e,f,m,n),x))),
ISetDelayed(6873,Int(Times(Power($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),p_),Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(a,Int(Times(Power(Cos(Plus(e,Times(f,x))),p),Power(Times(d,Sin(Plus(e,Times(f,x)))),n)),x),x),Dist(Times(b,Power(d,-1)),Int(Times(Power(Cos(Plus(e,Times(f,x))),p),Power(Times(d,Sin(Plus(e,Times(f,x)))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,d,e,f,n,p),x),IntegerQ(Times(C1D2,Plus(p,Negate(C1)))),IntegerQ(n),Or(And(LtQ(p,C0),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0)),LtQ(C0,n,Plus(p,Negate(C1))),LtQ(Plus(p,C1),Negate(n),Plus(Times(C2,p),C1)))))),
ISetDelayed(6874,Int(Times(Power($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),p_),Power(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Plus(Dist(Power(a,-1),Int(Times(Power(Cos(Plus(e,Times(f,x))),Plus(p,Negate(C2))),Power(Times(d,Sin(Plus(e,Times(f,x)))),n)),x),x),Negate(Dist(Power(Times(b,d),-1),Int(Times(Power(Cos(Plus(e,Times(f,x))),Plus(p,Negate(C2))),Power(Times(d,Sin(Plus(e,Times(f,x)))),Plus(n,C1))),x),x))),And(FreeQ(List(a,b,d,e,f,n,p),x),IntegerQ(Times(C1D2,Plus(p,Negate(C1)))),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegerQ(n),Or(LtQ(C0,n,Times(C1D2,Plus(p,C1))),And(LeQ(p,Negate(n)),LtQ(Negate(n),Plus(Times(C2,p),Negate(C3)))),And(GtQ(n,C0),LeQ(n,Negate(p))))))),
ISetDelayed(6875,Int(Times(Power($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Times(Power(b,p),f),-1),Subst(Int(Times(Power(Plus(a,x),Plus(m,Times(C1D2,Plus(p,Negate(C1))))),Power(Plus(a,Negate(x)),Times(C1D2,Plus(p,Negate(C1)))),Power(Plus(c,Times(d,x,Power(b,-1))),n)),x),x,Times(b,Sin(Plus(e,Times(f,x))))),x),And(FreeQ(List(a,b,e,f,c,d,m,n),x),IntegerQ(Times(C1D2,Plus(p,Negate(C1)))),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
ISetDelayed(6876,Int(Times(Power($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Times(Power(b,p),f),-1),Subst(Int(Times(Power(Plus(a,x),m),Power(Plus(c,Times(d,x,Power(b,-1))),n),Power(Plus(Sqr(b),Negate(Sqr(x))),Times(C1D2,Plus(p,Negate(C1))))),x),x,Times(b,Sin(Plus(e,Times(f,x))))),x),And(FreeQ(List(a,b,c,d,e,f,m,n),x),IntegerQ(Times(C1D2,Plus(p,Negate(C1)))),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
ISetDelayed(6877,Int(Times(Power(Times(g_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_),Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(a,Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),p),Power(Times(d,Sin(Plus(e,Times(f,x)))),n)),x),x),Dist(Times(b,Power(d,-1)),Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),p),Power(Times(d,Sin(Plus(e,Times(f,x)))),Plus(n,C1))),x),x)),FreeQ(List(a,b,d,e,f,g,n,p),x))),
ISetDelayed(6878,Int(Times(Power(Times(g_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_),Power(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Plus(Dist(Times(Sqr(g),Power(a,-1)),Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,Negate(C2))),Power(Times(d,Sin(Plus(e,Times(f,x)))),n)),x),x),Negate(Dist(Times(Sqr(g),Power(Times(b,d),-1)),Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,Negate(C2))),Power(Times(d,Sin(Plus(e,Times(f,x)))),Plus(n,C1))),x),x))),And(FreeQ(List(a,b,d,e,f,g,n,p),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
ISetDelayed(6879,Int(Times(Power(Times(g_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(a,m),Power(c,m),Power(Power(g,Times(C2,m)),-1)),Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(Times(C2,m),p)),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),Plus(n,Negate(m)))),x),x),And(FreeQ(List(a,b,c,d,e,f,g,n,p),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegerQ(m),Not(And(IntegerQ(n),LtQ(Sqr(n),Sqr(m))))))),
ISetDelayed(6880,Int(Times(Power($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Times(Power(a,Times(C1D2,p)),Power(c,Times(C1D2,p))),-1),Int(Times(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,Times(C1D2,p))),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),Plus(n,Times(C1D2,p)))),x),x),And(FreeQ(List(a,b,c,d,e,f,n,p),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegerQ(Times(C1D2,p))))),
ISetDelayed(6881,Int(Times(Power(Times(g_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_),Power(Times(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Sqrt(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),-1)),x_Symbol),
    Condition(Dist(Times(g,Cos(Plus(e,Times(f,x))),Power(Times(Sqrt(Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))))),-1)),Int(Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,Negate(C1))),x),x),And(FreeQ(List(a,b,c,d,e,f,g,p),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0)))),
ISetDelayed(6882,Int(Times(Power(Times(g_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Dist(Times(Power(a,IntPart(m)),Power(c,IntPart(m)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),FracPart(m)),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),FracPart(m)),Power(Times(Power(g,Times(C2,IntPart(m))),Power(Times(g,Cos(Plus(e,Times(f,x)))),Times(C2,FracPart(m)))),-1)),Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(Times(C2,m),p)),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),-1)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,m,n,p),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),EqQ(Plus(Times(C2,m),p,Negate(C1)),C0),EqQ(Plus(m,Negate(n),Negate(C1)),C0)))),
ISetDelayed(6883,Int(Times(Power(Times(g_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Simp(Times(b,Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C1)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),n),Power(Times(f,g,Plus(m,Negate(n),Negate(C1))),-1)),x),And(FreeQ(List(a,b,c,d,e,f,g,m,n,p),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),EqQ(Plus(Times(C2,m),p,Negate(C1)),C0),NeQ(Plus(m,Negate(n),Negate(C1)),C0)))),
ISetDelayed(6884,Int(Times(Power(Times(g_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(CN2,b,Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C1)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),n),Power(Times(f,g,Plus(Times(C2,n),p,C1)),-1)),x),Negate(Dist(Times(b,Plus(Times(C2,m),p,Negate(C1)),Power(Times(d,Plus(Times(C2,n),p,C1)),-1)),Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),p),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),Plus(n,C1))),x),x))),And(FreeQ(List(a,b,c,d,e,f,g,p),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IGtQ(Simplify(Plus(m,Times(C1D2,p),Negate(C1D2))),C0),LtQ(n,CN1),NeQ(Plus(Times(C2,n),p,C1),C0),Not(And(ILtQ(Simplify(Plus(m,n,p)),C0),GtQ(Simplify(Plus(Times(C2,m),n,Times(C1D2,C3,p),C1)),C0)))))),
ISetDelayed(6885,Int(Times(Power(Times(g_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C1)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),n),Power(Times(f,g,Plus(m,n,p)),-1)),x)),Dist(Times(a,Plus(Times(C2,m),p,Negate(C1)),Power(Plus(m,n,p),-1)),Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),p),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),n)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,n,p),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IGtQ(Simplify(Plus(m,Times(C1D2,p),Negate(C1D2))),C0),Not(LtQ(n,CN1)),Not(And(IGtQ(Simplify(Plus(n,Times(C1D2,p),Negate(C1D2))),C0),GtQ(Plus(m,Negate(n)),C0))),Not(And(ILtQ(Simplify(Plus(m,n,p)),C0),GtQ(Simplify(Plus(Times(C2,m),n,Times(C1D2,C3,p),C1)),C0)))))),
ISetDelayed(6886,Int(Times(Power(Times(g_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Dist(Times(Power(a,IntPart(m)),Power(c,IntPart(m)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),FracPart(m)),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),FracPart(m)),Power(Times(Power(g,Times(C2,IntPart(m))),Power(Times(g,Cos(Plus(e,Times(f,x)))),Times(C2,FracPart(m)))),-1)),Int(Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(Times(C2,m),p)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,m,p),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),EqQ(Plus(Times(C2,m),p,C1),C0)))),
ISetDelayed(6887,Int(Times(Power(Times(g_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Simp(Times(b,Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C1)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),n),Power(Times(a,f,g,Plus(m,Negate(n))),-1)),x),And(FreeQ(List(a,b,c,d,e,f,g,m,n,p),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),EqQ(Plus(m,n,p,C1),C0),NeQ(m,n)))),
ISetDelayed(6888,Int(Times(Power(Times(g_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C1)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),n),Power(Times(a,f,g,Plus(Times(C2,m),p,C1)),-1)),x),Dist(Times(Plus(m,n,p,C1),Power(Times(a,Plus(Times(C2,m),p,C1)),-1)),Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),p),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),n)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,m,n,p),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),ILtQ(Simplify(Plus(m,n,p,C1)),C0),NeQ(Plus(Times(C2,m),p,C1),C0),Or(SumSimplerQ(m,C1),Not(SumSimplerQ(n,C1)))))),
ISetDelayed(6889,Int(Times(Power(Times(g_DEFAULT,$($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(CN2,b,Power(Times(g,Cos(Plus(e,Times(f,x)))),Plus(p,C1)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),n),Power(Times(f,g,Plus(Times(C2,n),p,C1)),-1)),x),Negate(Dist(Times(b,Plus(Times(C2,m),p,Negate(C1)),Power(Times(d,Plus(Times(C2,n),p,C1)),-1)),Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),p),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),Plus(n,C1))),x),x))),And(FreeQ(List(a,b,c,d,e,f,g,p),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),GtQ(m,C0),LtQ(n,CN1),NeQ(Plus(Times(C2,n),p,C1),C0),IntegersQ(Times(C2,m),Times(C2,n),Times(C2,p)))))
  );
}
