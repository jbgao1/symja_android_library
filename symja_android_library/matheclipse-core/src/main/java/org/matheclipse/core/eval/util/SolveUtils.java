package org.matheclipse.core.eval.util;

import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IASTAppendable;
import org.matheclipse.core.interfaces.IExpr;

public class SolveUtils {

	/**
	 * <code>result[0]</code> is the list of expressions <code>== 0</code> . <code>result[1]</code>are the
	 * <code>Unequal, Less, LessEqual, Greater, GreaterEqual</code> expressions. If <code>result[2].isPresent()</code>
	 * return the entry as solution.
	 * 
	 * @param list
	 * @return
	 */
	public static IAST[] filterSolveLists(IAST list, IAST solution) {
		IAST[] result = new IASTAppendable[3];
		IASTAppendable termsEqualZero = F.ListAlloc(list.size());
		IASTAppendable inequalityTerms = F.ListAlloc(list.size());
		result[0] = termsEqualZero;
		result[1] = inequalityTerms;
		result[2] = F.NIL;
		int i = 1;
		while (i < list.size()) {
			IExpr arg = list.get(i);
			if (arg.isTrue()) {
			} else if (arg.isFalse()) {
				// no solution possible
				result[2] = F.List();
				return result;
			} else if (arg.isEqual()) {
				// arg must be Equal(_, 0)
				termsEqualZero.append(arg.getAt(1));
			} else {
				inequalityTerms.append(arg);
			}
			i++;
		}
		if (result[0].isEmpty() && result[1].isEmpty()) {
			if (solution.isPresent()) {
				result[2] = solution;
			} else {
				result[2] = F.List(F.List());
			}
			return result;
		}
		return result;
	}

}
